package DDS;
public abstract class _ListenerLocalBase extends org.omg.CORBA.LocalObject implements Listener {
  private String[] _type_ids = {"IDL:DDS/Listener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
