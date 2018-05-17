package simple;
public class _Local2TAOPeer extends i2jrt.TAOLocalObject implements Local2 {
  protected _Local2TAOPeer(long ptr) {
    super(ptr);
  }

  public native simple.TestLI op(simple.TestLI p1, simple.TestLIHolder p2, simple.TestLIHolder p3);

  public native boolean localOp(simple.EnumSeqHolder p1, simple.TestStructSequenceHolder p2);

  public native boolean localOp2(simple.TestStructSequenceHolder s1);

  public native simple.TestEnum[] returnASequence(org.omg.CORBA.ShortHolder p1, simple.TestStructHolder p2);

  public native void primitive(org.omg.CORBA.BooleanHolder p1, org.omg.CORBA.CharHolder p2, org.omg.CORBA.ByteHolder p3, org.omg.CORBA.ShortHolder p4, org.omg.CORBA.IntHolder p5, org.omg.CORBA.LongHolder p6, org.omg.CORBA.FloatHolder p7, org.omg.CORBA.DoubleHolder p8);

  public native int attr1();

  public native void attr1(int attr1);

  public native double attr2();

  public native void attr2(double attr2);


  static {
    String propVal = System.getProperty("opendds.native.debug");
    if (propVal != null && ("1".equalsIgnoreCase(propVal) ||
        "y".equalsIgnoreCase(propVal) ||
        "yes".equalsIgnoreCase(propVal) ||
        "t".equalsIgnoreCase(propVal) ||
        "true".equalsIgnoreCase(propVal)))
      System.loadLibrary("idl2jni_test_simpled");
    else System.loadLibrary("idl2jni_test_simple");
  }

}
