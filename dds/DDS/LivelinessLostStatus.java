package DDS;
public final class LivelinessLostStatus implements java.io.Serializable {
  public int total_count;
  public int total_count_change;

  public LivelinessLostStatus() {}

  public LivelinessLostStatus(int _total_count, int _total_count_change) {
    total_count = _total_count;
    total_count_change = _total_count_change;
  }
}
