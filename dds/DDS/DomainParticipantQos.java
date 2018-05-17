package DDS;
public final class DomainParticipantQos implements java.io.Serializable {
  public DDS.UserDataQosPolicy user_data;
  public DDS.EntityFactoryQosPolicy entity_factory;

  public DomainParticipantQos() {}

  public DomainParticipantQos(DDS.UserDataQosPolicy _user_data, DDS.EntityFactoryQosPolicy _entity_factory) {
    user_data = _user_data;
    entity_factory = _entity_factory;
  }
}
