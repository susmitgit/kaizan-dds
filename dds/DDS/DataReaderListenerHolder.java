package DDS;
public final class DataReaderListenerHolder {
  // TypeCode operations not currently implemented
  public DataReaderListener value;
  public DataReaderListenerHolder() {}
  public DataReaderListenerHolder(DataReaderListener initial) {
    value = initial;
  }
}
