package DDS;
public interface SubscriptionBuiltinTopicDataDataWriterOperations extends DDS.DataWriterOperations {
  int register_instance(DDS.SubscriptionBuiltinTopicData instance);
  int register_instance_w_timestamp(DDS.SubscriptionBuiltinTopicData instance, DDS.Time_t timestamp);
  int unregister_instance(DDS.SubscriptionBuiltinTopicData instance, int handle);
  int unregister_instance_w_timestamp(DDS.SubscriptionBuiltinTopicData instance, int handle, DDS.Time_t timestamp);
  int write(DDS.SubscriptionBuiltinTopicData instance_data, int handle);
  int write_w_timestamp(DDS.SubscriptionBuiltinTopicData instance_data, int handle, DDS.Time_t source_timestamp);
  int dispose(DDS.SubscriptionBuiltinTopicData instance_data, int instance_handle);
  int dispose_w_timestamp(DDS.SubscriptionBuiltinTopicData instance_data, int instance_handle, DDS.Time_t source_timestamp);
  int get_key_value(DDS.SubscriptionBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.SubscriptionBuiltinTopicData instance_data);
}
