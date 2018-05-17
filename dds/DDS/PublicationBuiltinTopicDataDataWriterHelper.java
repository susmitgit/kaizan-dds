package DDS;
public abstract class PublicationBuiltinTopicDataDataWriterHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/PublicationBuiltinTopicDataDataWriter:1.0"; }
  public static PublicationBuiltinTopicDataDataWriter narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof PublicationBuiltinTopicDataDataWriter)
      return (PublicationBuiltinTopicDataDataWriter)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static PublicationBuiltinTopicDataDataWriter unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof PublicationBuiltinTopicDataDataWriter)
      return (PublicationBuiltinTopicDataDataWriter)obj;
    else
      return native_unarrow(obj);
  }

  private native static PublicationBuiltinTopicDataDataWriter native_unarrow(org.omg.CORBA.Object obj);

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
