package DDS;
public final class DeadlineQosPolicy implements java.io.Serializable {
  public DDS.Duration_t period;

  public DeadlineQosPolicy() {}

  public DeadlineQosPolicy(DDS.Duration_t _period) {
    period = _period;
  }
}
