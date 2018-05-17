package DDS;
public interface ParticipantBuiltinTopicDataDataReaderOperations extends OpenDDS.DCPS.DataReaderExOperations {
  int read(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int sample_states, int view_states, int instance_states);
  int take(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int sample_states, int view_states, int instance_states);
  int read_w_condition(DDS.ParticipantBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, DDS.ReadCondition a_condition);
  int take_w_condition(DDS.ParticipantBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, DDS.ReadCondition a_condition);
  int read_next_sample(DDS.ParticipantBuiltinTopicDataHolder received_data, DDS.SampleInfoHolder sample_info);
  int take_next_sample(DDS.ParticipantBuiltinTopicDataHolder received_data, DDS.SampleInfoHolder sample_info);
  int read_instance(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int take_instance(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int read_next_instance(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int take_next_instance(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int read_next_instance_w_condition(DDS.ParticipantBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, int previous_handle, DDS.ReadCondition a_condition);
  int take_next_instance_w_condition(DDS.ParticipantBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, int previous_handle, DDS.ReadCondition a_condition);
  int return_loan(DDS.ParticipantBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq);
  int get_key_value(DDS.ParticipantBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.ParticipantBuiltinTopicData instance_data);
}
