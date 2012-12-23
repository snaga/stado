//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> SQLPrecedenceLevel3Expression(prn)
 * f1 -> ( SQLPrecedenceLevel3Operand(prn) )*
 */
public class SQLPrecedenceLevel2Expression implements Node {
   public SQLPrecedenceLevel3Expression f0;
   public NodeListOptional f1;

   public SQLPrecedenceLevel2Expression(SQLPrecedenceLevel3Expression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

