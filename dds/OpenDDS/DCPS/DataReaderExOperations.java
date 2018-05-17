package OpenDDS.DCPS;
public interface DataReaderExOperations extends DDS.DataReaderOperations {
  boolean statistics_enabled();
  void statistics_enabled(boolean statistics_enabled);
  void get_latency_stats(OpenDDS.DCPS.LatencyStatisticsSeqHolder stats);
  void reset_latency_stats();
}
