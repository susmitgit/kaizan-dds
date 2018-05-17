package DDS;
public final class QosPolicyCount implements java.io.Serializable {
  public int policy_id;
  public int count;

  public QosPolicyCount() {}

  public QosPolicyCount(int _policy_id, int _count) {
    policy_id = _policy_id;
    count = _count;
  }
}
