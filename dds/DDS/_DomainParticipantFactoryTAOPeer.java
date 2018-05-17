package DDS;
public class _DomainParticipantFactoryTAOPeer extends i2jrt.TAOLocalObject implements DomainParticipantFactory {
  protected _DomainParticipantFactoryTAOPeer(long ptr) {
    super(ptr);
  }

  public native DDS.DomainParticipant create_participant(int domainId, DDS.DomainParticipantQos qos, DDS.DomainParticipantListener a_listener, int mask);

  public native int delete_participant(DDS.DomainParticipant a_participant);

  public native DDS.DomainParticipant lookup_participant(int domainId);

  public native int set_default_participant_qos(DDS.DomainParticipantQos qos);

  public native int get_default_participant_qos(DDS.DomainParticipantQosHolder qos);

  public native DDS.DomainParticipantFactory get_instance();

  public native int set_qos(DDS.DomainParticipantFactoryQos qos);

  public native int get_qos(DDS.DomainParticipantFactoryQosHolder qos);


  static {
    String propVal = System.getProperty("opendds.native.debug");
    if (propVal != null && ("1".equalsIgnoreCase(propVal) ||
        "y".equalsIgnoreCase(propVal) ||
        "yes".equalsIgnoreCase(propVal) ||
        "t".equalsIgnoreCase(propVal) ||
        "true".equalsIgnoreCase(propVal)))
      System.loadLibrary("OpenDDS_DCPS_Javad");
    else System.loadLibrary("OpenDDS_DCPS_Java");
  }

}
