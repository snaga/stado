//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> ( <INT_> | <INTEGER_> | <INT4_> )
 * f1 -> [ <SERIAL_> ]
 * f2 -> UnsignedZeroFillSpecs()
 */
public class IntegerDataType implements Node {
   public NodeChoice f0;
   public NodeOptional f1;
   public UnsignedZeroFillSpecs f2;

   public IntegerDataType(NodeChoice n0, NodeOptional n1, UnsignedZeroFillSpecs n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

