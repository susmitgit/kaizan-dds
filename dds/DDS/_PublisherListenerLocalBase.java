package DDS;
public abstract class _PublisherListenerLocalBase extends org.omg.CORBA.LocalObject implements PublisherListener {
  private String[] _type_ids = {"IDL:DDS/PublisherListener:1.0", "IDL:DDS/DataWriterListener:1.0", "IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
