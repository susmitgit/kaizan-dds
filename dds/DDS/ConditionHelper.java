package DDS;
public abstract class ConditionHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/Condition:1.0"; }
  public static Condition narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof Condition)
      return (Condition)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static Condition unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof Condition)
      return (Condition)obj;
    else
      return native_unarrow(obj);
  }

  private native static Condition native_unarrow(org.omg.CORBA.Object obj);

  static {
    String propVal = System.getProperty("opendds.native.debug");
    if (propVal != null && ("1".equalsIgnoreCase(propVal) ||
        "y".equalsIgnoreCase(propVal) ||
        "yes".equalsIgnoreCase(propVal) ||
        "t".equalsIgnoreCase(propVal) ||
        "true".equalsIgnoreCase(propVal)))
      System.loadLibrary("OpenDDS_DCPS_Javad");
    else System.loadLibrary("OpenDDS_DCPS_Java");
  }

}
