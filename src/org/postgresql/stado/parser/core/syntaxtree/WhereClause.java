//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <WHERE_>
 * f1 -> SQLComplexExpression(prn)
 */
public class WhereClause implements Node {
   public NodeToken f0;
   public SQLComplexExpression f1;

   public WhereClause(NodeToken n0, SQLComplexExpression n1) {
      f0 = n0;
      f1 = n1;
   }

   public WhereClause(SQLComplexExpression n0) {
      f0 = new NodeToken("WHERE");
      f1 = n0;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

