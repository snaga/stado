//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> [ <AS_> ]
 * f1 -> AliasName(prn)
 */
public class SelectAliasSpec implements Node {
   public NodeOptional f0;
   public AliasName f1;

   public SelectAliasSpec(NodeOptional n0, AliasName n1) {
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

