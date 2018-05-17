package DDS;
public abstract class _SubscriberListenerLocalBase extends org.omg.CORBA.LocalObject implements SubscriberListener {
  private String[] _type_ids = {"IDL:DDS/SubscriberListener:1.0", "IDL:DDS/DataReaderListener:1.0", "IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
