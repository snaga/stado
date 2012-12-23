/*****************************************************************************
 * Copyright (C) 2008 EnterpriseDB Corporation.
 * Copyright (C) 2011 Stado Global Development Group.
 *
 * This file is part of Stado.
 *
 * Stado is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Stado is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Stado.  If not, see <http://www.gnu.org/licenses/>.
 *
 * You can find Stado at http://www.stado.us
 *
 ****************************************************************************/
package org.postgresql.driver.core.v2;

import java.util.Vector;

import org.postgresql.driver.core.*;

/**
 * Query implementation for all queries via the V2 protocol.
 */
class V2Query implements Query {
    V2Query(String query, boolean withParameters, ProtocolConnection pconn) {

        useEStringSyntax = pconn.getServerVersion() != null
                && pconn.getServerVersion().compareTo("8.1") > 0;
        boolean stdStrings = pconn.getStandardConformingStrings();

        if (!withParameters)
        {
            fragments = new String[] { query };
            return ;
        }

        // Parse query and find parameter placeholders.

        Vector v = new Vector();
        int lastParmEnd = 0;

        char []aChars = query.toCharArray();

        for (int i = 0; i < aChars.length; ++i)
        {
            switch (aChars[i])
            {
            case '\'': // single-quotes
                i = Parser.parseSingleQuotes(aChars, i, stdStrings);
                break;

            case '"': // double-quotes
                i = Parser.parseDoubleQuotes(aChars, i);
                break;

            case '-': // possibly -- style comment
                i = Parser.parseLineComment(aChars, i);
                break;

            case '/': // possibly /* */ style comment
                i = Parser.parseBlockComment(aChars, i);
                break;
            
            case '$': // possibly dollar quote start
                i = Parser.parseDollarQuotes(aChars, i);
                break;

            case '?':
                v.addElement(query.substring (lastParmEnd, i));
                lastParmEnd = i + 1;
                break;

            default:
                break;
            }
        }

        v.addElement(query.substring (lastParmEnd, query.length()));

        fragments = new String[v.size()];
        for (int i = 0 ; i < fragments.length; ++i)
            fragments[i] = (String)v.elementAt(i);
    }

    public ParameterList createParameterList() {
        if (fragments.length == 1)
            return NO_PARAMETERS;

        return new SimpleParameterList(fragments.length - 1, useEStringSyntax);
    }

    public String toString(ParameterList parameters) {
        StringBuffer sbuf = new StringBuffer(fragments[0]);
        for (int i = 1; i < fragments.length; ++i)
        {
            if (parameters == null)
                sbuf.append("?");
            else
                sbuf.append(parameters.toString(i));
            sbuf.append(fragments[i]);
        }
        return sbuf.toString();
    }

    public void close() {
    }

    String[] getFragments() {
        return fragments;
    }

    private static final ParameterList NO_PARAMETERS = new SimpleParameterList(0, false);

    private final String[] fragments;      // Query fragments, length == # of parameters + 1
    
    private final boolean useEStringSyntax; // whether escaped string syntax should be used
}
