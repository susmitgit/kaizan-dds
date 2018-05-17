package OpenDDS.DCPS;
public abstract class _TypeSupportLocalBase extends org.omg.CORBA.LocalObject implements TypeSupport {
  private String[] _type_ids = {"IDL:OpenDDS/DCPS/TypeSupport:1.0", "IDL:DDS/TypeSupport:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
