//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> Identifier(prn)
 * f1 -> ( AlterDefOperationType(prn) | AlterDefOperationSet(prn) | DropDefaultNotNull(prn) )
 */
public class AlterDefOperation implements Node {
   public Identifier f0;
   public NodeChoice f1;

   public AlterDefOperation(Identifier n0, NodeChoice n1) {
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
