package DDS;
public interface ContentFilteredTopicOperations extends DDS.TopicDescriptionOperations {
  String get_filter_expression();
  int get_expression_parameters(DDS.StringSeqHolder params);
  int set_expression_parameters(String[] expression_parameters);
  DDS.Topic get_related_topic();
}
