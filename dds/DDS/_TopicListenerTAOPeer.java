package DDS;
public class _TopicListenerTAOPeer extends i2jrt.TAOLocalObject implements TopicListener {
  protected _TopicListenerTAOPeer(long ptr) {
    super(ptr);
  }

  public native void on_inconsistent_topic(DDS.Topic the_topic, DDS.InconsistentTopicStatus status);


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
