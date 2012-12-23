//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> [ TableName(prn) "." ]
 * f1 -> Identifier(prn)
 * f2 -> "="
 * f3 -> SQLSimpleExpression(prn)
 */
public class SetUpdateClause implements Node {
   public NodeOptional f0;
   public Identifier f1;
   public NodeToken f2;
   public SQLSimpleExpression f3;

   public SetUpdateClause(NodeOptional n0, Identifier n1, NodeToken n2, SQLSimpleExpression n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public SetUpdateClause(NodeOptional n0, Identifier n1, SQLSimpleExpression n2) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken("=");
      f3 = n2;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

