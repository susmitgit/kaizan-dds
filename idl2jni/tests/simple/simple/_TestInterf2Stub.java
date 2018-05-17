package simple;
public class _TestInterf2Stub extends i2jrt.TAOObject implements TestInterf2 {
  protected _TestInterf2Stub(long ptr) {
    super(ptr);
  }

  public native int op2(int[] p1, int[][] p2);

  public native int[] op1(simple.TestEnum p1, org.omg.CORBA.ShortHolder p2, simple.TestSeqTypedefHolder p3, org.omg.CORBA.StringHolder p4);

  public native simple.TestUnion4 opu(simple.TestUnion1 p1, simple.TestUnion2Holder p2, simple.TestUnion1Holder p4);

  public native int attr1();

  public native void attr1(int attr1);


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
