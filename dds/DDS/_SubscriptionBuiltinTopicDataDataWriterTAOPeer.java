package DDS;
public class _SubscriptionBuiltinTopicDataDataWriterTAOPeer extends i2jrt.TAOLocalObject implements SubscriptionBuiltinTopicDataDataWriter {
  protected _SubscriptionBuiltinTopicDataDataWriterTAOPeer(long ptr) {
    super(ptr);
  }

  public native int register_instance(DDS.SubscriptionBuiltinTopicData instance);

  public native int register_instance_w_timestamp(DDS.SubscriptionBuiltinTopicData instance, DDS.Time_t timestamp);

  public native int unregister_instance(DDS.SubscriptionBuiltinTopicData instance, int handle);

  public native int unregister_instance_w_timestamp(DDS.SubscriptionBuiltinTopicData instance, int handle, DDS.Time_t timestamp);

  public native int write(DDS.SubscriptionBuiltinTopicData instance_data, int handle);

  public native int write_w_timestamp(DDS.SubscriptionBuiltinTopicData instance_data, int handle, DDS.Time_t source_timestamp);

  public native int dispose(DDS.SubscriptionBuiltinTopicData instance_data, int instance_handle);

  public native int dispose_w_timestamp(DDS.SubscriptionBuiltinTopicData instance_data, int instance_handle, DDS.Time_t source_timestamp);

  public native int get_key_value(DDS.SubscriptionBuiltinTopicDataHolder key_holder, int handle);

  public native int lookup_instance(DDS.SubscriptionBuiltinTopicData instance_data);

  public native int set_qos(DDS.DataWriterQos qos);

  public native int get_qos(DDS.DataWriterQosHolder qos);

  public native int set_listener(DDS.DataWriterListener a_listener, int mask);

  public native DDS.DataWriterListener get_listener();

  public native DDS.Topic get_topic();

  public native DDS.Publisher get_publisher();

  public native int wait_for_acknowledgments(DDS.Duration_t max_wait);

  public native int get_liveliness_lost_status(DDS.LivelinessLostStatusHolder status);

  public native int get_offered_deadline_missed_status(DDS.OfferedDeadlineMissedStatusHolder status);

  public native int get_offered_incompatible_qos_status(DDS.OfferedIncompatibleQosStatusHolder status);

  public native int get_publication_matched_status(DDS.PublicationMatchedStatusHolder status);

  public native int assert_liveliness();

  public native int get_matched_subscriptions(DDS.InstanceHandleSeqHolder subscription_handles);

  public native int get_matched_subscription_data(DDS.SubscriptionBuiltinTopicDataHolder subscription_data, int subscription_handle);

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
