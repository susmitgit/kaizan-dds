package DDS;
public abstract class _PublisherLocalBase extends org.omg.CORBA.LocalObject implements Publisher {
  private String[] _type_ids = {"IDL:DDS/Publisher:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
