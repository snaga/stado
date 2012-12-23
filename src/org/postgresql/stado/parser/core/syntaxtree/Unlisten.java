//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <UNLISTEN_>
 * f1 -> [ Identifier(prn) | <STAR_> ]
 */
public class Unlisten implements Node {
   public NodeToken f0;
   public NodeOptional f1;

   public Unlisten(NodeToken n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public Unlisten(NodeOptional n0) {
      f0 = new NodeToken("UNLISTEN");
      f1 = n0;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

