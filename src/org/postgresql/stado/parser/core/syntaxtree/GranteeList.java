//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> Grantee(prn)
 * f1 -> ( "," Grantee(prn) )*
 */
public class GranteeList implements Node {
   public Grantee f0;
   public NodeListOptional f1;

   public GranteeList(Grantee n0, NodeListOptional n1) {
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

