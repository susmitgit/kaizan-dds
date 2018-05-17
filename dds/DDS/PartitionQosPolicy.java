package DDS;
public final class PartitionQosPolicy implements java.io.Serializable {
  public String[] name;

  public PartitionQosPolicy() {}

  public PartitionQosPolicy(String[] _name) {
    name = _name;
  }
}
