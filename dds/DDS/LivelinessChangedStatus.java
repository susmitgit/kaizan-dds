package DDS;
public final class LivelinessChangedStatus implements java.io.Serializable {
  public int alive_count;
  public int not_alive_count;
  public int alive_count_change;
  public int not_alive_count_change;
  public int last_publication_handle;

  public LivelinessChangedStatus() {}

  public LivelinessChangedStatus(int _alive_count, int _not_alive_count, int _alive_count_change, int _not_alive_count_change, int _last_publication_handle) {
    alive_count = _alive_count;
    not_alive_count = _not_alive_count;
    alive_count_change = _alive_count_change;
    not_alive_count_change = _not_alive_count_change;
    last_publication_handle = _last_publication_handle;
  }
}
