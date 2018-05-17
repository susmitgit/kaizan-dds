package DDS;
public abstract class _DomainParticipantLocalBase extends org.omg.CORBA.LocalObject implements DomainParticipant {
  private String[] _type_ids = {"IDL:DDS/DomainParticipant:1.0", "IDL:DDS/Entity:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
