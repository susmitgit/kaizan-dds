package DDS;
public interface TopicOperations extends DDS.EntityOperations, DDS.TopicDescriptionOperations {
  int set_qos(DDS.TopicQos qos);
  int get_qos(DDS.TopicQosHolder qos);
  int set_listener(DDS.TopicListener a_listener, int mask);
  DDS.TopicListener get_listener();
  int get_inconsistent_topic_status(DDS.InconsistentTopicStatusHolder a_status);
}
