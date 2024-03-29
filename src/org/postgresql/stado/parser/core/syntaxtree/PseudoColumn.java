//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <PARENTHESIS_START_>
 * f1 -> <SELECT_>
 * f2 -> [ <ALL_> | <DISTINCT_> ]
 * f3 -> SelectList(prn)
 * f4 -> [ FromClause(prn) ]
 * f5 -> [ WhereClause(prn) ]
 * f6 -> [ LimitClause(prn) ]
 * f7 -> <PARENTHESIS_CLOSE_>
 */
public class PseudoColumn implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeOptional f2;
   public SelectList f3;
   public NodeOptional f4;
   public NodeOptional f5;
   public NodeOptional f6;
   public NodeToken f7;

   public PseudoColumn(NodeToken n0, NodeToken n1, NodeOptional n2, SelectList n3, NodeOptional n4, NodeOptional n5, NodeOptional n6, NodeToken n7) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
   }

   public PseudoColumn(NodeOptional n0, SelectList n1, NodeOptional n2, NodeOptional n3, NodeOptional n4) {
      f0 = new NodeToken("(");
      f1 = new NodeToken("SELECT");
      f2 = n0;
      f3 = n1;
      f4 = n2;
      f5 = n3;
      f6 = n4;
      f7 = new NodeToken(")");
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

