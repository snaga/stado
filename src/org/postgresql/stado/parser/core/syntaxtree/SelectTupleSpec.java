//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> ( <STAR_> | TableName(prn) "." <STAR_> | SQLSimpleExpression(prn) [ SelectAliasSpec(prn) ] )
 */
public class SelectTupleSpec implements Node {
   public NodeChoice f0;

   public SelectTupleSpec(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}
