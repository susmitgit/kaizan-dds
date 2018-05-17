package DDS;
public class _TopicDescriptionTAOPeer extends i2jrt.TAOLocalObject implements TopicDescription {
  protected _TopicDescriptionTAOPeer(long ptr) {
    super(ptr);
  }

  public native String get_type_name();

  public native String get_name();

  public native DDS.DomainParticipant get_participant();


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
