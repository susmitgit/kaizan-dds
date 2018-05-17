package DDS;
public interface DataWriterOperations extends DDS.EntityOperations {
  int set_qos(DDS.DataWriterQos qos);
  int get_qos(DDS.DataWriterQosHolder qos);
  int set_listener(DDS.DataWriterListener a_listener, int mask);
  DDS.DataWriterListener get_listener();
  DDS.Topic get_topic();
  DDS.Publisher get_publisher();
  int wait_for_acknowledgments(DDS.Duration_t max_wait);
  int get_liveliness_lost_status(DDS.LivelinessLostStatusHolder status);
  int get_offered_deadline_missed_status(DDS.OfferedDeadlineMissedStatusHolder status);
  int get_offered_incompatible_qos_status(DDS.OfferedIncompatibleQosStatusHolder status);
  int get_publication_matched_status(DDS.PublicationMatchedStatusHolder status);
  int assert_liveliness();
  int get_matched_subscriptions(DDS.InstanceHandleSeqHolder subscription_handles);
  int get_matched_subscription_data(DDS.SubscriptionBuiltinTopicDataHolder subscription_data, int subscription_handle);
}
