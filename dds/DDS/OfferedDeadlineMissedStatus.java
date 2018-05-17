package DDS;
public final class OfferedDeadlineMissedStatus implements java.io.Serializable {
  public int total_count;
  public int total_count_change;
  public int last_instance_handle;

  public OfferedDeadlineMissedStatus() {}

  public OfferedDeadlineMissedStatus(int _total_count, int _total_count_change, int _last_instance_handle) {
    total_count = _total_count;
    total_count_change = _total_count_change;
    last_instance_handle = _last_instance_handle;
  }
}
