package simple;
public interface TestInterfOperations {
  int attr1();
  void attr1(int attr1);
  int[] op1(simple.TestEnum p1, org.omg.CORBA.ShortHolder p2, simple.TestSeqTypedefHolder p3, org.omg.CORBA.StringHolder p4);
  simple.TestUnion4 opu(simple.TestUnion1 p1, simple.TestUnion2Holder p2, simple.TestUnion1Holder p4);
}
