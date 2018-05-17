package DDS;
public final class DataReaderHolder {
  // TypeCode operations not currently implemented
  public DataReader value;
  public DataReaderHolder() {}
  public DataReaderHolder(DataReader initial) {
    value = initial;
  }
}
