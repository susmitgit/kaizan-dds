package simple;
public interface TestLIOperations {
  int attr1();
  void attr1(int attr1);
  double attr2();
  void attr2(double attr2);
  boolean localOp(simple.EnumSeqHolder p1, simple.TestStructSequenceHolder p2);
  boolean localOp2(simple.TestStructSequenceHolder s1);
  simple.TestEnum[] returnASequence(org.omg.CORBA.ShortHolder p1, simple.TestStructHolder p2);
  void primitive(org.omg.CORBA.BooleanHolder p1, org.omg.CORBA.CharHolder p2, org.omg.CORBA.ByteHolder p3, org.omg.CORBA.ShortHolder p4, org.omg.CORBA.IntHolder p5, org.omg.CORBA.LongHolder p6, org.omg.CORBA.FloatHolder p7, org.omg.CORBA.DoubleHolder p8);
}
