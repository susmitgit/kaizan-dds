package DDS;
public final class DataWriterHolder {
  // TypeCode operations not currently implemented
  public DataWriter value;
  public DataWriterHolder() {}
  public DataWriterHolder(DataWriter initial) {
    value = initial;
  }
}
