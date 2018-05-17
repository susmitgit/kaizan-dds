package DDS;
public final class LatencyBudgetQosPolicy implements java.io.Serializable {
  public DDS.Duration_t duration;

  public LatencyBudgetQosPolicy() {}

  public LatencyBudgetQosPolicy(DDS.Duration_t _duration) {
    duration = _duration;
  }
}
