package OpenDDS.DCPS;
public abstract class _DataWriterListenerLocalBase extends org.omg.CORBA.LocalObject implements DataWriterListener {
  private String[] _type_ids = {"IDL:OpenDDS/DCPS/DataWriterListener:1.0", "IDL:DDS/DataWriterListener:1.0", "IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
