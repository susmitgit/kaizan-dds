package DDS;
public interface TopicBuiltinTopicDataDataWriterOperations extends DDS.DataWriterOperations {
  int register_instance(DDS.TopicBuiltinTopicData instance);
  int register_instance_w_timestamp(DDS.TopicBuiltinTopicData instance, DDS.Time_t timestamp);
  int unregister_instance(DDS.TopicBuiltinTopicData instance, int handle);
  int unregister_instance_w_timestamp(DDS.TopicBuiltinTopicData instance, int handle, DDS.Time_t timestamp);
  int write(DDS.TopicBuiltinTopicData instance_data, int handle);
  int write_w_timestamp(DDS.TopicBuiltinTopicData instance_data, int handle, DDS.Time_t source_timestamp);
  int dispose(DDS.TopicBuiltinTopicData instance_data, int instance_handle);
  int dispose_w_timestamp(DDS.TopicBuiltinTopicData instance_data, int instance_handle, DDS.Time_t source_timestamp);
  int get_key_value(DDS.TopicBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.TopicBuiltinTopicData instance_data);
}
