package OpenDDS.DCPS;
public abstract class _DataReaderExLocalBase extends org.omg.CORBA.LocalObject implements DataReaderEx {
  private String[] _type_ids = {"IDL:OpenDDS/DCPS/DataReaderEx:1.0", "IDL:DDS/DataReader:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
