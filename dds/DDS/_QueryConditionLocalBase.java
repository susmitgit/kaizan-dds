package DDS;
public abstract class _QueryConditionLocalBase extends org.omg.CORBA.LocalObject implements QueryCondition {
  private String[] _type_ids = {"IDL:DDS/QueryCondition:1.0", "IDL:DDS/ReadCondition:1.0", "IDL:DDS/Condition:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
