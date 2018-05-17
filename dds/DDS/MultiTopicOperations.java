package DDS;
public interface MultiTopicOperations extends DDS.TopicDescriptionOperations {
  String get_subscription_expression();
  int get_expression_parameters(DDS.StringSeqHolder params);
  int set_expression_parameters(String[] expression_parameters);
}
