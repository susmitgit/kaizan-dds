package simple;
public abstract class TestInterf2Helper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:simple/TestInterf2:1.0"; }
  public static TestInterf2 narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof TestInterf2)
      return (TestInterf2)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static TestInterf2 unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof TestInterf2)
      return (TestInterf2)obj;
    else
      return native_unarrow(obj);
  }

  private native static TestInterf2 native_unarrow(org.omg.CORBA.Object obj);

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
