package simple;
public abstract class TestInterfHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:simple/TestInterf:1.0"; }
  public static TestInterf narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof TestInterf)
      return (TestInterf)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static TestInterf unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof TestInterf)
      return (TestInterf)obj;
    else
      return native_unarrow(obj);
  }

  private native static TestInterf native_unarrow(org.omg.CORBA.Object obj);

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
