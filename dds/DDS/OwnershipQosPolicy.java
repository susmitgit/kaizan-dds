package DDS;
public final class OwnershipQosPolicy implements java.io.Serializable {
  public DDS.OwnershipQosPolicyKind kind;

  public OwnershipQosPolicy() {}

  public OwnershipQosPolicy(DDS.OwnershipQosPolicyKind _kind) {
    kind = _kind;
  }
}
