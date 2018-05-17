package DDS;
public final class LivelinessQosPolicy implements java.io.Serializable {
  public DDS.LivelinessQosPolicyKind kind;
  public DDS.Duration_t lease_duration;

  public LivelinessQosPolicy() {}

  public LivelinessQosPolicy(DDS.LivelinessQosPolicyKind _kind, DDS.Duration_t _lease_duration) {
    kind = _kind;
    lease_duration = _lease_duration;
  }
}
