package DDS;
public abstract class _TopicListenerLocalBase extends org.omg.CORBA.LocalObject implements TopicListener {
  private String[] _type_ids = {"IDL:DDS/TopicListener:1.0", "IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
