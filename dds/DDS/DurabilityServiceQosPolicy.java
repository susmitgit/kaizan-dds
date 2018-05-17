package DDS;
public final class DurabilityServiceQosPolicy implements java.io.Serializable {
  public DDS.Duration_t service_cleanup_delay;
  public DDS.HistoryQosPolicyKind history_kind;
  public int history_depth;
  public int max_samples;
  public int max_instances;
  public int max_samples_per_instance;

  public DurabilityServiceQosPolicy() {}

  public DurabilityServiceQosPolicy(DDS.Duration_t _service_cleanup_delay, DDS.HistoryQosPolicyKind _history_kind, int _history_depth, int _max_samples, int _max_instances, int _max_samples_per_instance) {
    service_cleanup_delay = _service_cleanup_delay;
    history_kind = _history_kind;
    history_depth = _history_depth;
    max_samples = _max_samples;
    max_instances = _max_instances;
    max_samples_per_instance = _max_samples_per_instance;
  }
}
