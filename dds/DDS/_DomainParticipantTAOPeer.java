package DDS;
public class _DomainParticipantTAOPeer extends i2jrt.TAOLocalObject implements DomainParticipant {
  protected _DomainParticipantTAOPeer(long ptr) {
    super(ptr);
  }

  public native DDS.Publisher create_publisher(DDS.PublisherQos qos, DDS.PublisherListener a_listener, int mask);

  public native int delete_publisher(DDS.Publisher p);

  public native DDS.Subscriber create_subscriber(DDS.SubscriberQos qos, DDS.SubscriberListener a_listener, int mask);

  public native int delete_subscriber(DDS.Subscriber s);

  public native DDS.Subscriber get_builtin_subscriber();

  public native DDS.Topic create_topic(String topic_name, String type_name, DDS.TopicQos qos, DDS.TopicListener a_listener, int mask);

  public native int delete_topic(DDS.Topic a_topic);

  public native DDS.Topic find_topic(String topic_name, DDS.Duration_t timeout);

  public native DDS.TopicDescription lookup_topicdescription(String name);

  public native DDS.ContentFilteredTopic create_contentfilteredtopic(String name, DDS.Topic related_topic, String filter_expression, String[] expression_parameters);

  public native int delete_contentfilteredtopic(DDS.ContentFilteredTopic a_contentfilteredtopic);

  public native DDS.MultiTopic create_multitopic(String name, String type_name, String subscription_expression, String[] expression_parameters);

  public native int delete_multitopic(DDS.MultiTopic a_multitopic);

  public native int delete_contained_entities();

  public native boolean contains_entity(int a_handle);

  public native int set_qos(DDS.DomainParticipantQos qos);

  public native int get_qos(DDS.DomainParticipantQosHolder qos);

  public native int set_listener(DDS.DomainParticipantListener a_listener, int mask);

  public native DDS.DomainParticipantListener get_listener();

  public native int ignore_participant(int handle);

  public native int ignore_topic(int handle);

  public native int ignore_publication(int handle);

  public native int ignore_subscription(int handle);

  public native int get_domain_id();

  public native int assert_liveliness();

  public native int set_default_publisher_qos(DDS.PublisherQos qos);

  public native int get_default_publisher_qos(DDS.PublisherQosHolder qos);

  public native int set_default_subscriber_qos(DDS.SubscriberQos qos);

  public native int get_default_subscriber_qos(DDS.SubscriberQosHolder qos);

  public native int set_default_topic_qos(DDS.TopicQos qos);

  public native int get_default_topic_qos(DDS.TopicQosHolder qos);

  public native int get_current_time(DDS.Time_tHolder current_time);

  public native int get_discovered_participants(DDS.InstanceHandleSeqHolder participant_handles);

  public native int get_discovered_participant_data(DDS.ParticipantBuiltinTopicDataHolder participant_data, int participant_handle);

  public native int get_discovered_topics(DDS.InstanceHandleSeqHolder topic_handles);

  public native int get_discovered_topic_data(DDS.TopicBuiltinTopicDataHolder topic_data, int topic_handle);

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
