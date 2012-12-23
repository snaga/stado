//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> ( <ST_ASEWKB_> | <ASEWKB_> )
 * f1 -> <PARENTHESIS_START_>
 * f2 -> SQLArgument(prn)
 * f3 -> [ "," SQLArgument(prn) ]
 * f4 -> <PARENTHESIS_CLOSE_>
 */
public class Func_ST_ASEWKB implements Node {
   public NodeChoice f0;
   public NodeToken f1;
   public SQLArgument f2;
   public NodeOptional f3;
   public NodeToken f4;

   public Func_ST_ASEWKB(NodeChoice n0, NodeToken n1, SQLArgument n2, NodeOptional n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public Func_ST_ASEWKB(NodeChoice n0, SQLArgument n1, NodeOptional n2) {
      f0 = n0;
      f1 = new NodeToken("(");
      f2 = n1;
      f3 = n2;
      f4 = new NodeToken(")");
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

