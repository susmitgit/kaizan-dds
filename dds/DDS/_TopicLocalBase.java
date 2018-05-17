package DDS;
public abstract class _TopicLocalBase extends org.omg.CORBA.LocalObject implements Topic {
  private String[] _type_ids = {"IDL:DDS/Topic:1.0", "IDL:DDS/Entity:1.0", "IDL:DDS/TopicDescription:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
