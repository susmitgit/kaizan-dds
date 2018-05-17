package DDS;
public final class DataWriterQos implements java.io.Serializable {
  public DDS.DurabilityQosPolicy durability;
  public DDS.DurabilityServiceQosPolicy durability_service;
  public DDS.DeadlineQosPolicy deadline;
  public DDS.LatencyBudgetQosPolicy latency_budget;
  public DDS.LivelinessQosPolicy liveliness;
  public DDS.ReliabilityQosPolicy reliability;
  public DDS.DestinationOrderQosPolicy destination_order;
  public DDS.HistoryQosPolicy history;
  public DDS.ResourceLimitsQosPolicy resource_limits;
  public DDS.TransportPriorityQosPolicy transport_priority;
  public DDS.LifespanQosPolicy lifespan;
  public DDS.UserDataQosPolicy user_data;
  public DDS.OwnershipQosPolicy ownership;
  public DDS.OwnershipStrengthQosPolicy ownership_strength;
  public DDS.WriterDataLifecycleQosPolicy writer_data_lifecycle;

  public DataWriterQos() {}

  public DataWriterQos(DDS.DurabilityQosPolicy _durability, DDS.DurabilityServiceQosPolicy _durability_service, DDS.DeadlineQosPolicy _deadline, DDS.LatencyBudgetQosPolicy _latency_budget, DDS.LivelinessQosPolicy _liveliness, DDS.ReliabilityQosPolicy _reliability, DDS.DestinationOrderQosPolicy _destination_order, DDS.HistoryQosPolicy _history, DDS.ResourceLimitsQosPolicy _resource_limits, DDS.TransportPriorityQosPolicy _transport_priority, DDS.LifespanQosPolicy _lifespan, DDS.UserDataQosPolicy _user_data, DDS.OwnershipQosPolicy _ownership, DDS.OwnershipStrengthQosPolicy _ownership_strength, DDS.WriterDataLifecycleQosPolicy _writer_data_lifecycle) {
    durability = _durability;
    durability_service = _durability_service;
    deadline = _deadline;
    latency_budget = _latency_budget;
    liveliness = _liveliness;
    reliability = _reliability;
    destination_order = _destination_order;
    history = _history;
    resource_limits = _resource_limits;
    transport_priority = _transport_priority;
    lifespan = _lifespan;
    user_data = _user_data;
    ownership = _ownership;
    ownership_strength = _ownership_strength;
    writer_data_lifecycle = _writer_data_lifecycle;
  }
}
