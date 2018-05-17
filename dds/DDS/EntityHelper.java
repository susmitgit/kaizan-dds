package DDS;
public abstract class EntityHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/Entity:1.0"; }
  public static Entity narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof Entity)
      return (Entity)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static Entity unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof Entity)
      return (Entity)obj;
    else
      return native_unarrow(obj);
  }

  private native static Entity native_unarrow(org.omg.CORBA.Object obj);

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
