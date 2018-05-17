package DDS;
public class _DataReaderTAOPeer extends i2jrt.TAOLocalObject implements DataReader {
  protected _DataReaderTAOPeer(long ptr) {
    super(ptr);
  }

  public native DDS.ReadCondition create_readcondition(int sample_states, int view_states, int instance_states);

  public native DDS.QueryCondition create_querycondition(int sample_states, int view_states, int instance_states, String query_expression, String[] query_parameters);

  public native int delete_readcondition(DDS.ReadCondition a_condition);

  public native int delete_contained_entities();

  public native int set_qos(DDS.DataReaderQos qos);

  public native int get_qos(DDS.DataReaderQosHolder qos);

  public native int set_listener(DDS.DataReaderListener a_listener, int mask);

  public native DDS.DataReaderListener get_listener();

  public native DDS.TopicDescription get_topicdescription();

  public native DDS.Subscriber get_subscriber();

  public native int get_sample_rejected_status(DDS.SampleRejectedStatusHolder status);

  public native int get_liveliness_changed_status(DDS.LivelinessChangedStatusHolder status);

  public native int get_requested_deadline_missed_status(DDS.RequestedDeadlineMissedStatusHolder status);

  public native int get_requested_incompatible_qos_status(DDS.RequestedIncompatibleQosStatusHolder status);

  public native int get_subscription_matched_status(DDS.SubscriptionMatchedStatusHolder status);

  public native int get_sample_lost_status(DDS.SampleLostStatusHolder status);

  public native int wait_for_historical_data(DDS.Duration_t max_wait);

  public native int get_matched_publications(DDS.InstanceHandleSeqHolder publication_handles);

  public native int get_matched_publication_data(DDS.PublicationBuiltinTopicDataHolder publication_data, int publication_handle);

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
