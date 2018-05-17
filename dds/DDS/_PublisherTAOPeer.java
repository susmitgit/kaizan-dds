package DDS;
public class _PublisherTAOPeer extends i2jrt.TAOLocalObject implements Publisher {
  protected _PublisherTAOPeer(long ptr) {
    super(ptr);
  }

  public native DDS.DataWriter create_datawriter(DDS.Topic a_topic, DDS.DataWriterQos qos, DDS.DataWriterListener a_listener, int mask);

  public native int delete_datawriter(DDS.DataWriter a_datawriter);

  public native DDS.DataWriter lookup_datawriter(String topic_name);

  public native int delete_contained_entities();

  public native int set_qos(DDS.PublisherQos qos);

  public native int get_qos(DDS.PublisherQosHolder qos);

  public native int set_listener(DDS.PublisherListener a_listener, int mask);

  public native DDS.PublisherListener get_listener();

  public native int suspend_publications();

  public native int resume_publications();

  public native int begin_coherent_changes();

  public native int end_coherent_changes();

  public native int wait_for_acknowledgments(DDS.Duration_t max_wait);

  public native DDS.DomainParticipant get_participant();

  public native int set_default_datawriter_qos(DDS.DataWriterQos qos);

  public native int get_default_datawriter_qos(DDS.DataWriterQosHolder qos);

  public native int copy_from_topic_qos(DDS.DataWriterQosHolder a_datawriter_qos, DDS.TopicQos a_topic_qos);

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
