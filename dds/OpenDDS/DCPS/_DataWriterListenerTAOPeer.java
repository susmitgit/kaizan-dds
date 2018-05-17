package OpenDDS.DCPS;
public class _DataWriterListenerTAOPeer extends i2jrt.TAOLocalObject implements DataWriterListener {
  protected _DataWriterListenerTAOPeer(long ptr) {
    super(ptr);
  }

  public native void on_publication_disconnected(DDS.DataWriter reader, OpenDDS.DCPS.PublicationLostStatus status);

  public native void on_publication_reconnected(DDS.DataWriter reader, OpenDDS.DCPS.PublicationLostStatus status);

  public native void on_publication_lost(DDS.DataWriter writer, OpenDDS.DCPS.PublicationLostStatus status);

  public native void on_connection_deleted(DDS.DataWriter writer);

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
