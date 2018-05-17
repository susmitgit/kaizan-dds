package DDS;
public abstract class DomainParticipantFactoryHelper {
  // Any and TypeCode operations not currently implemented
  public static String id() { return "IDL:DDS/DomainParticipantFactory:1.0"; }
  public static DomainParticipantFactory narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof DomainParticipantFactory)
      return (DomainParticipantFactory)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
      return native_unarrow(obj);
  }

  public static DomainParticipantFactory unchecked_narrow(org.omg.CORBA.Object obj) {
    if (obj == null)
      return null;
    else if (obj instanceof DomainParticipantFactory)
      return (DomainParticipantFactory)obj;
    else
      return native_unarrow(obj);
  }

  private native static DomainParticipantFactory native_unarrow(org.omg.CORBA.Object obj);

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
