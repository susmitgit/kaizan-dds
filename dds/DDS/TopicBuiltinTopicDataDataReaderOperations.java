package DDS;
public interface TopicBuiltinTopicDataDataReaderOperations extends OpenDDS.DCPS.DataReaderExOperations {
  int read(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int sample_states, int view_states, int instance_states);
  int take(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int sample_states, int view_states, int instance_states);
  int read_w_condition(DDS.TopicBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, DDS.ReadCondition a_condition);
  int take_w_condition(DDS.TopicBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, DDS.ReadCondition a_condition);
  int read_next_sample(DDS.TopicBuiltinTopicDataHolder received_data, DDS.SampleInfoHolder sample_info);
  int take_next_sample(DDS.TopicBuiltinTopicDataHolder received_data, DDS.SampleInfoHolder sample_info);
  int read_instance(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int take_instance(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int read_next_instance(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int take_next_instance(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq, int max_samples, int a_handle, int sample_states, int view_states, int instance_states);
  int read_next_instance_w_condition(DDS.TopicBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, int previous_handle, DDS.ReadCondition a_condition);
  int take_next_instance_w_condition(DDS.TopicBuiltinTopicDataSeqHolder data_values, DDS.SampleInfoSeqHolder sample_infos, int max_samples, int previous_handle, DDS.ReadCondition a_condition);
  int return_loan(DDS.TopicBuiltinTopicDataSeqHolder received_data, DDS.SampleInfoSeqHolder info_seq);
  int get_key_value(DDS.TopicBuiltinTopicDataHolder key_holder, int handle);
  int lookup_instance(DDS.TopicBuiltinTopicData instance_data);
}
