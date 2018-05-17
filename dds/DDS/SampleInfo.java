package DDS;
public final class SampleInfo implements java.io.Serializable {
  public int sample_state;
  public int view_state;
  public int instance_state;
  public DDS.Time_t source_timestamp;
  public int instance_handle;
  public int publication_handle;
  public int disposed_generation_count;
  public int no_writers_generation_count;
  public int sample_rank;
  public int generation_rank;
  public int absolute_generation_rank;
  public boolean valid_data;
  public long opendds_reserved_publication_seq;

  public SampleInfo() {}

  public SampleInfo(int _sample_state, int _view_state, int _instance_state, DDS.Time_t _source_timestamp, int _instance_handle, int _publication_handle, int _disposed_generation_count, int _no_writers_generation_count, int _sample_rank, int _generation_rank, int _absolute_generation_rank, boolean _valid_data, long _opendds_reserved_publication_seq) {
    sample_state = _sample_state;
    view_state = _view_state;
    instance_state = _instance_state;
    source_timestamp = _source_timestamp;
    instance_handle = _instance_handle;
    publication_handle = _publication_handle;
    disposed_generation_count = _disposed_generation_count;
    no_writers_generation_count = _no_writers_generation_count;
    sample_rank = _sample_rank;
    generation_rank = _generation_rank;
    absolute_generation_rank = _absolute_generation_rank;
    valid_data = _valid_data;
    opendds_reserved_publication_seq = _opendds_reserved_publication_seq;
  }
}
