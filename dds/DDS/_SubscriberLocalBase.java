package DDS;
public abstract class _SubscriberLocalBase extends org.omg.CORBA.LocalObject implements Subscriber {
  private String[] _type_ids = {"IDL:DDS/Subscriber:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
