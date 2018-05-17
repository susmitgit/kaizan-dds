package DDS;
public abstract class _EntityLocalBase extends org.omg.CORBA.LocalObject implements Entity {
  private String[] _type_ids = {"IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
