package DDS;
public class _SubscriberTAOPeer extends i2jrt.TAOLocalObject implements Subscriber {
  protected _SubscriberTAOPeer(long ptr) {
    super(ptr);
  }

  public native DDS.DataReader create_datareader(DDS.TopicDescription a_topic, DDS.DataReaderQos qos, DDS.DataReaderListener a_listener, int mask);

  public native int delete_datareader(DDS.DataReader a_datareader);

  public native int delete_contained_entities();

  public native DDS.DataReader lookup_datareader(String topic_name);

  public native int get_datareaders(DDS.DataReaderSeqHolder readers, int sample_states, int view_states, int instance_states);

  public native int notify_datareaders();

  public native int set_qos(DDS.SubscriberQos qos);

  public native int get_qos(DDS.SubscriberQosHolder qos);

  public native int set_listener(DDS.SubscriberListener a_listener, int mask);

  public native DDS.SubscriberListener get_listener();

  public native int begin_access();

  public native int end_access();

  public native DDS.DomainParticipant get_participant();

  public native int set_default_datareader_qos(DDS.DataReaderQos qos);

  public native int get_default_datareader_qos(DDS.DataReaderQosHolder qos);

  public native int copy_from_topic_qos(DDS.DataReaderQosHolder a_datareader_qos, DDS.TopicQos a_topic_qos);

  public native int enable();

  public native DDS.StatusCondition get_statuscondition();

  public native int get_status_changes();

  public native int get_instance_handle();


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
