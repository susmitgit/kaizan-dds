package DDS;
public class _PublisherListenerTAOPeer extends i2jrt.TAOLocalObject implements PublisherListener {
  protected _PublisherListenerTAOPeer(long ptr) {
    super(ptr);
  }

  public native void on_offered_deadline_missed(DDS.DataWriter writer, DDS.OfferedDeadlineMissedStatus status);

  public native void on_offered_incompatible_qos(DDS.DataWriter writer, DDS.OfferedIncompatibleQosStatus status);

  public native void on_liveliness_lost(DDS.DataWriter writer, DDS.LivelinessLostStatus status);

  public native void on_publication_matched(DDS.DataWriter writer, DDS.PublicationMatchedStatus status);


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
