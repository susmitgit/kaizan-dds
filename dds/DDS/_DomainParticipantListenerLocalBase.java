package DDS;
public abstract class _DomainParticipantListenerLocalBase extends org.omg.CORBA.LocalObject implements DomainParticipantListener {
  private String[] _type_ids = {"IDL:DDS/DomainParticipantListener:1.0", "IDL:DDS/TopicListener:1.0", "IDL:DDS/Listener:1.0", "IDL:DDS/PublisherListener:1.0", "IDL:DDS/DataWriterListener:1.0", "IDL:DDS/SubscriberListener:1.0", "IDL:DDS/DataReaderListener:1.0"};

  public String[] _ids() { return (String[])_type_ids.clone(); }
}
