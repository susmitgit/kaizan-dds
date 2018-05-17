package DDS;
public final class DataReaderQos implements java.io.Serializable {
  public DDS.DurabilityQosPolicy durability;
  public DDS.DeadlineQosPolicy deadline;
  public DDS.LatencyBudgetQosPolicy latency_budget;
  public DDS.LivelinessQosPolicy liveliness;
  public DDS.ReliabilityQosPolicy reliability;
  public DDS.DestinationOrderQosPolicy destination_order;
  public DDS.HistoryQosPolicy history;
  public DDS.ResourceLimitsQosPolicy resource_limits;
  public DDS.UserDataQosPolicy user_data;
  public DDS.OwnershipQosPolicy ownership;
  public DDS.TimeBasedFilterQosPolicy time_based_filter;
  public DDS.ReaderDataLifecycleQosPolicy reader_data_lifecycle;

  public DataReaderQos() {}

  public DataReaderQos(DDS.DurabilityQosPolicy _durability, DDS.DeadlineQosPolicy _deadline, DDS.LatencyBudgetQosPolicy _latency_budget, DDS.LivelinessQosPolicy _liveliness, DDS.ReliabilityQosPolicy _reliability, DDS.DestinationOrderQosPolicy _destination_order, DDS.HistoryQosPolicy _history, DDS.ResourceLimitsQosPolicy _resource_limits, DDS.UserDataQosPolicy _user_data, DDS.OwnershipQosPolicy _ownership, DDS.TimeBasedFilterQosPolicy _time_based_filter, DDS.ReaderDataLifecycleQosPolicy _reader_data_lifecycle) {
    durability = _durability;
    deadline = _deadline;
    latency_budget = _latency_budget;
    liveliness = _liveliness;
    reliability = _reliability;
    destination_order = _destination_order;
    history = _history;
    resource_limits = _resource_limits;
    user_data = _user_data;
    ownership = _ownership;
    time_based_filter = _time_based_filter;
    reader_data_lifecycle = _reader_data_lifecycle;
  }
}
