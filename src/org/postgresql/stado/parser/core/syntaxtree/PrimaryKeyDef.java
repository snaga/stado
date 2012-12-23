//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <PRIMARYKEY_>
 * f1 -> <PARENTHESIS_START_>
 * f2 -> ColumnNameList(prn)
 * f3 -> <PARENTHESIS_CLOSE_>
 */
public class PrimaryKeyDef implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public ColumnNameList f2;
   public NodeToken f3;

   public PrimaryKeyDef(NodeToken n0, NodeToken n1, ColumnNameList n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public PrimaryKeyDef(ColumnNameList n0) {
      f0 = new NodeToken("KEY");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken(")");
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

