//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> FromTableSpec(prn)
 * f1 -> ( "," FromTableSpec(prn) )*
 */
public class TableList implements Node {
   public FromTableSpec f0;
   public NodeListOptional f1;

   public TableList(FromTableSpec n0, NodeListOptional n1) {
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

