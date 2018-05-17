package DDS;
public final class DomainParticipantFactoryQos implements java.io.Serializable {
  public DDS.EntityFactoryQosPolicy entity_factory;

  public DomainParticipantFactoryQos() {}

  public DomainParticipantFactoryQos(DDS.EntityFactoryQosPolicy _entity_factory) {
    entity_factory = _entity_factory;
  }
}
