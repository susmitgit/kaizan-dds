package DDS;
public abstract class _StatusConditionLocalBase extends org.omg.CORBA.LocalObject implements StatusCondition {
  private String[] _type_ids = {"IDL:DDS/StatusCondition:1.0", "IDL:DDS/Condition:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
