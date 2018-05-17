package DDS;
public final class DestinationOrderQosPolicy implements java.io.Serializable {
  public DDS.DestinationOrderQosPolicyKind kind;

  public DestinationOrderQosPolicy() {}

  public DestinationOrderQosPolicy(DDS.DestinationOrderQosPolicyKind _kind) {
    kind = _kind;
  }
}
