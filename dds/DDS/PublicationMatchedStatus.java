package DDS;
public final class PublicationMatchedStatus implements java.io.Serializable {
  public int total_count;
  public int total_count_change;
  public int current_count;
  public int current_count_change;
  public int last_subscription_handle;

  public PublicationMatchedStatus() {}

  public PublicationMatchedStatus(int _total_count, int _total_count_change, int _current_count, int _current_count_change, int _last_subscription_handle) {
    total_count = _total_count;
    total_count_change = _total_count_change;
    current_count = _current_count;
    current_count_change = _current_count_change;
    last_subscription_handle = _last_subscription_handle;
  }
}
