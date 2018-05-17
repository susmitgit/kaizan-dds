package DDS;
public final class DurabilityQosPolicy implements java.io.Serializable {
  public DDS.DurabilityQosPolicyKind kind;

  public DurabilityQosPolicy() {}

  public DurabilityQosPolicy(DDS.DurabilityQosPolicyKind _kind) {
    kind = _kind;
  }
}
