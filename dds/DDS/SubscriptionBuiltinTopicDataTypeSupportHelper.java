package DDS;
public abstract class SubscriptionBuiltinTopicDataTypeSupportHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/SubscriptionBuiltinTopicDataTypeSupport:1.0"; }
  public static SubscriptionBuiltinTopicDataTypeSupport narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof SubscriptionBuiltinTopicDataTypeSupport)
      return (SubscriptionBuiltinTopicDataTypeSupport)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static SubscriptionBuiltinTopicDataTypeSupport unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof SubscriptionBuiltinTopicDataTypeSupport)
      return (SubscriptionBuiltinTopicDataTypeSupport)obj;
    else
      return native_unarrow(obj);
  }

  private native static SubscriptionBuiltinTopicDataTypeSupport native_unarrow(org.omg.CORBA.Object obj);

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
