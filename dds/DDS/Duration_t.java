package DDS;
public final class Duration_t implements java.io.Serializable {
  public int sec;
  public int nanosec;

  public Duration_t() {}

  public Duration_t(int _sec, int _nanosec) {
    sec = _sec;
    nanosec = _nanosec;
  }
}
