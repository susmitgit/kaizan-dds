package DDS;
public final class TopicBuiltinTopicData implements java.io.Serializable {
  public DDS.BuiltinTopicKey_t key;
  public String name;
  public String type_name;
  public DDS.DurabilityQosPolicy durability;
  public DDS.DurabilityServiceQosPolicy durability_service;
  public DDS.DeadlineQosPolicy deadline;
  public DDS.LatencyBudgetQosPolicy latency_budget;
  public DDS.LivelinessQosPolicy liveliness;
  public DDS.ReliabilityQosPolicy reliability;
  public DDS.TransportPriorityQosPolicy transport_priority;
  public DDS.LifespanQosPolicy lifespan;
  public DDS.DestinationOrderQosPolicy destination_order;
  public DDS.HistoryQosPolicy history;
  public DDS.ResourceLimitsQosPolicy resource_limits;
  public DDS.OwnershipQosPolicy ownership;
  public DDS.TopicDataQosPolicy topic_data;

  public TopicBuiltinTopicData() {}

  public TopicBuiltinTopicData(DDS.BuiltinTopicKey_t _key, String _name, String _type_name, DDS.DurabilityQosPolicy _durability, DDS.DurabilityServiceQosPolicy _durability_service, DDS.DeadlineQosPolicy _deadline, DDS.LatencyBudgetQosPolicy _latency_budget, DDS.LivelinessQosPolicy _liveliness, DDS.ReliabilityQosPolicy _reliability, DDS.TransportPriorityQosPolicy _transport_priority, DDS.LifespanQosPolicy _lifespan, DDS.DestinationOrderQosPolicy _destination_order, DDS.HistoryQosPolicy _history, DDS.ResourceLimitsQosPolicy _resource_limits, DDS.OwnershipQosPolicy _ownership, DDS.TopicDataQosPolicy _topic_data) {
    key = _key;
    name = _name;
    type_name = _type_name;
    durability = _durability;
    durability_service = _durability_service;
    deadline = _deadline;
    latency_budget = _latency_budget;
    liveliness = _liveliness;
    reliability = _reliability;
    transport_priority = _transport_priority;
    lifespan = _lifespan;
    destination_order = _destination_order;
    history = _history;
    resource_limits = _resource_limits;
    ownership = _ownership;
    topic_data = _topic_data;
  }
}
