package DDS;
public class _TopicTAOPeer extends i2jrt.TAOLocalObject implements Topic {
  protected _TopicTAOPeer(long ptr) {
    super(ptr);
  }

  public native int set_qos(DDS.TopicQos qos);

  public native int get_qos(DDS.TopicQosHolder qos);

  public native int set_listener(DDS.TopicListener a_listener, int mask);

  public native DDS.TopicListener get_listener();

  public native int get_inconsistent_topic_status(DDS.InconsistentTopicStatusHolder a_status);

  public native int enable();

  public native DDS.StatusCondition get_statuscondition();

  public native int get_status_changes();

  public native int get_instance_handle();

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
