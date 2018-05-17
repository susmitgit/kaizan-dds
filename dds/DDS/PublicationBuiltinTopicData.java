package DDS;
public final class PublicationBuiltinTopicData implements java.io.Serializable {
  public DDS.BuiltinTopicKey_t key;
  public DDS.BuiltinTopicKey_t participant_key;
  public String topic_name;
  public String type_name;
  public DDS.DurabilityQosPolicy durability;
  public DDS.DurabilityServiceQosPolicy durability_service;
  public DDS.DeadlineQosPolicy deadline;
  public DDS.LatencyBudgetQosPolicy latency_budget;
  public DDS.LivelinessQosPolicy liveliness;
  public DDS.ReliabilityQosPolicy reliability;
  public DDS.LifespanQosPolicy lifespan;
  public DDS.UserDataQosPolicy user_data;
  public DDS.OwnershipQosPolicy ownership;
  public DDS.OwnershipStrengthQosPolicy ownership_strength;
  public DDS.DestinationOrderQosPolicy destination_order;
  public DDS.PresentationQosPolicy presentation;
  public DDS.PartitionQosPolicy partition;
  public DDS.TopicDataQosPolicy topic_data;
  public DDS.GroupDataQosPolicy group_data;

  public PublicationBuiltinTopicData() {}

  public PublicationBuiltinTopicData(DDS.BuiltinTopicKey_t _key, DDS.BuiltinTopicKey_t _participant_key, String _topic_name, String _type_name, DDS.DurabilityQosPolicy _durability, DDS.DurabilityServiceQosPolicy _durability_service, DDS.DeadlineQosPolicy _deadline, DDS.LatencyBudgetQosPolicy _latency_budget, DDS.LivelinessQosPolicy _liveliness, DDS.ReliabilityQosPolicy _reliability, DDS.LifespanQosPolicy _lifespan, DDS.UserDataQosPolicy _user_data, DDS.OwnershipQosPolicy _ownership, DDS.OwnershipStrengthQosPolicy _ownership_strength, DDS.DestinationOrderQosPolicy _destination_order, DDS.PresentationQosPolicy _presentation, DDS.PartitionQosPolicy _partition, DDS.TopicDataQosPolicy _topic_data, DDS.GroupDataQosPolicy _group_data) {
    key = _key;
    participant_key = _participant_key;
    topic_name = _topic_name;
    type_name = _type_name;
    durability = _durability;
    durability_service = _durability_service;
    deadline = _deadline;
    latency_budget = _latency_budget;
    liveliness = _liveliness;
    reliability = _reliability;
    lifespan = _lifespan;
    user_data = _user_data;
    ownership = _ownership;
    ownership_strength = _ownership_strength;
    destination_order = _destination_order;
    presentation = _presentation;
    partition = _partition;
    topic_data = _topic_data;
    group_data = _group_data;
  }
}
