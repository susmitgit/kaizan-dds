package DDS;
public interface DomainParticipantFactoryOperations {
  DDS.DomainParticipant create_participant(int domainId, DDS.DomainParticipantQos qos, DDS.DomainParticipantListener a_listener, int mask);
  int delete_participant(DDS.DomainParticipant a_participant);
  DDS.DomainParticipant lookup_participant(int domainId);
  int set_default_participant_qos(DDS.DomainParticipantQos qos);
  int get_default_participant_qos(DDS.DomainParticipantQosHolder qos);
  DDS.DomainParticipantFactory get_instance();
  int set_qos(DDS.DomainParticipantFactoryQos qos);
  int get_qos(DDS.DomainParticipantFactoryQosHolder qos);
}
