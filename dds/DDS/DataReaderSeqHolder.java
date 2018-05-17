package DDS;
public final class DataReaderSeqHolder {
  // TypeCode operations not currently implemented
  public DDS.DataReader[] value;
  public DataReaderSeqHolder() {}
  public DataReaderSeqHolder(DDS.DataReader[] initial) {
    value = initial;
  }
}
