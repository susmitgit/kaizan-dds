package DDS;
public final class DomainParticipantFactoryHolder {
  // TypeCode operations not currently implemented
  public DomainParticipantFactory value;
  public DomainParticipantFactoryHolder() {}
  public DomainParticipantFactoryHolder(DomainParticipantFactory initial) {
    value = initial;
  }
}
