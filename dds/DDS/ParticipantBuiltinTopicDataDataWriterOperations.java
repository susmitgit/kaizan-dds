package DDS;
public interface ParticipantBuiltinTopicDataDataWriterOperations extends DDS.DataWriterOperations {
  int register_instance(DDS.ParticipantBuiltinTopicData instance);
  int register_instance_w_timestamp(DDS.ParticipantBuiltinTopicData instance, DDS.Time_t timestamp);
  int unregister_instance(DDS.ParticipantBuiltinTopicData instance, int handle);
  int unregister_instance_w_timestamp(DDS.ParticipantBuiltinTopicData instance, int handle, DDS.Time_t timestamp);
  int write(DDS.ParticipantBuiltinTopicData instance_data, int handle);
  int write_w_timestamp(DDS.ParticipantBuiltinTopicData instance_data, int handle, DDS.Time_t source_timestamp);
  int dispose(DDS.ParticipantBuiltinTopicData instance_data, int instance_handle);
  int dispose_w_timestamp(DDS.ParticipantBuiltinTopicData instance_data, int instance_handle, DDS.Time_t source_timestamp);
  int get_key_value(DDS.ParticipantBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.ParticipantBuiltinTopicData instance_data);
}
