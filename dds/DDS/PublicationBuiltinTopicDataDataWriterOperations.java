package DDS;
public interface PublicationBuiltinTopicDataDataWriterOperations extends DDS.DataWriterOperations {
  int register_instance(DDS.PublicationBuiltinTopicData instance);
  int register_instance_w_timestamp(DDS.PublicationBuiltinTopicData instance, DDS.Time_t timestamp);
  int unregister_instance(DDS.PublicationBuiltinTopicData instance, int handle);
  int unregister_instance_w_timestamp(DDS.PublicationBuiltinTopicData instance, int handle, DDS.Time_t timestamp);
  int write(DDS.PublicationBuiltinTopicData instance_data, int handle);
  int write_w_timestamp(DDS.PublicationBuiltinTopicData instance_data, int handle, DDS.Time_t source_timestamp);
  int dispose(DDS.PublicationBuiltinTopicData instance_data, int instance_handle);
  int dispose_w_timestamp(DDS.PublicationBuiltinTopicData instance_data, int instance_handle, DDS.Time_t source_timestamp);
  int get_key_value(DDS.PublicationBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.PublicationBuiltinTopicData instance_data);
}
