package OpenDDS.DCPS;
public final class LatencyStatistics implements java.io.Serializable {
  public OpenDDS.DCPS.GUID_t publication;
  public int n;
  public double maximum;
  public double minimum;
  public double mean;
  public double variance;

  public LatencyStatistics() {}

  public LatencyStatistics(OpenDDS.DCPS.GUID_t _publication, int _n, double _maximum, double _minimum, double _mean, double _variance) {
    publication = _publication;
    n = _n;
    maximum = _maximum;
    minimum = _minimum;
    mean = _mean;
    variance = _variance;
  }
}
