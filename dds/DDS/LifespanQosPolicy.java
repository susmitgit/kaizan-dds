package DDS;
public final class LifespanQosPolicy implements java.io.Serializable {
  public DDS.Duration_t duration;

  public LifespanQosPolicy() {}

  public LifespanQosPolicy(DDS.Duration_t _duration) {
    duration = _duration;
  }
}
