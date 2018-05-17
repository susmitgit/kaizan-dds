package DDS;
public final class Time_t implements java.io.Serializable {
  public int sec;
  public int nanosec;

  public Time_t() {}

  public Time_t(int _sec, int _nanosec) {
    sec = _sec;
    nanosec = _nanosec;
  }
}
