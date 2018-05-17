package DDS;
public abstract class ParticipantBuiltinTopicDataDataReaderHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/ParticipantBuiltinTopicDataDataReader:1.0"; }
  public static ParticipantBuiltinTopicDataDataReader narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof ParticipantBuiltinTopicDataDataReader)
      return (ParticipantBuiltinTopicDataDataReader)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static ParticipantBuiltinTopicDataDataReader unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof ParticipantBuiltinTopicDataDataReader)
      return (ParticipantBuiltinTopicDataDataReader)obj;
    else
      return native_unarrow(obj);
  }

  private native static ParticipantBuiltinTopicDataDataReader native_unarrow(org.omg.CORBA.Object obj);

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
