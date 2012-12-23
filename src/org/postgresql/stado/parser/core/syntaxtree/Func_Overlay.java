//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <OVERLAY_>
 * f1 -> <PARENTHESIS_START_>
 * f2 -> SQLArgument(prn)
 * f3 -> <PLACING_>
 * f4 -> SQLArgument(prn)
 * f5 -> <FROM_>
 * f6 -> SQLArgument(prn)
 * f7 -> [ <FOR_> SQLArgument(prn) ]
 * f8 -> <PARENTHESIS_CLOSE_>
 */
public class Func_Overlay implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public SQLArgument f2;
   public NodeToken f3;
   public SQLArgument f4;
   public NodeToken f5;
   public SQLArgument f6;
   public NodeOptional f7;
   public NodeToken f8;

   public Func_Overlay(NodeToken n0, NodeToken n1, SQLArgument n2, NodeToken n3, SQLArgument n4, NodeToken n5, SQLArgument n6, NodeOptional n7, NodeToken n8) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
   }

   public Func_Overlay(SQLArgument n0, SQLArgument n1, SQLArgument n2, NodeOptional n3) {
      f0 = new NodeToken("OVERLAY");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken("PLACING");
      f4 = n1;
      f5 = new NodeToken("FROM");
      f6 = n2;
      f7 = n3;
      f8 = new NodeToken(")");
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}
