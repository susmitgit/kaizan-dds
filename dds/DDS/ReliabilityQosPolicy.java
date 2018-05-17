package DDS;
public final class ReliabilityQosPolicy implements java.io.Serializable {
  public DDS.ReliabilityQosPolicyKind kind;
  public DDS.Duration_t max_blocking_time;

  public ReliabilityQosPolicy() {}

  public ReliabilityQosPolicy(DDS.ReliabilityQosPolicyKind _kind, DDS.Duration_t _max_blocking_time) {
    kind = _kind;
    max_blocking_time = _max_blocking_time;
  }
}
