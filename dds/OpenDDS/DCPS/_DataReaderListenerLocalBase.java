package OpenDDS.DCPS;
public abstract class _DataReaderListenerLocalBase extends org.omg.CORBA.LocalObject implements DataReaderListener {
  private String[] _type_ids = {"IDL:OpenDDS/DCPS/DataReaderListener:1.0", "IDL:DDS/DataReaderListener:1.0", "IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
