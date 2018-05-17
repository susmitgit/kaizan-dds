package DDS;
public final class DataWriterListenerHolder {
  // TypeCode operations not currently implemented
  public DataWriterListener value;
  public DataWriterListenerHolder() {}
  public DataWriterListenerHolder(DataWriterListener initial) {
    value = initial;
  }
}
