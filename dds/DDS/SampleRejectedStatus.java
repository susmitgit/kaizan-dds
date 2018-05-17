package DDS;
public final class SampleRejectedStatus implements java.io.Serializable {
  public int total_count;
  public int total_count_change;
  public DDS.SampleRejectedStatusKind last_reason;
  public int last_instance_handle;

  public SampleRejectedStatus() {}

  public SampleRejectedStatus(int _total_count, int _total_count_change, DDS.SampleRejectedStatusKind _last_reason, int _last_instance_handle) {
    total_count = _total_count;
    total_count_change = _total_count_change;
    last_reason = _last_reason;
    last_instance_handle = _last_instance_handle;
  }
}
