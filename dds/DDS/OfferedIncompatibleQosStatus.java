package DDS;
public final class OfferedIncompatibleQosStatus implements java.io.Serializable {
  public int total_count;
  public int total_count_change;
  public int last_policy_id;
  public DDS.QosPolicyCount[] policies;

  public OfferedIncompatibleQosStatus() {}

  public OfferedIncompatibleQosStatus(int _total_count, int _total_count_change, int _last_policy_id, DDS.QosPolicyCount[] _policies) {
    total_count = _total_count;
    total_count_change = _total_count_change;
    last_policy_id = _last_policy_id;
    policies = _policies;
  }
}
