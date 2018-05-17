package DDS;
public final class TimeBasedFilterQosPolicy implements java.io.Serializable {
  public DDS.Duration_t minimum_separation;

  public TimeBasedFilterQosPolicy() {}

  public TimeBasedFilterQosPolicy(DDS.Duration_t _minimum_separation) {
    minimum_separation = _minimum_separation;
  }
}
