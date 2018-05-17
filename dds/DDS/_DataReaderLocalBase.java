package DDS;
public abstract class _DataReaderLocalBase extends org.omg.CORBA.LocalObject implements DataReader {
  private String[] _type_ids = {"IDL:DDS/DataReader:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
