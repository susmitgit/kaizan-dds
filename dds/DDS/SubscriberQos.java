package DDS;
public final class SubscriberQos implements java.io.Serializable {
  public DDS.PresentationQosPolicy presentation;
  public DDS.PartitionQosPolicy partition;
  public DDS.GroupDataQosPolicy group_data;
  public DDS.EntityFactoryQosPolicy entity_factory;

  public SubscriberQos() {}

  public SubscriberQos(DDS.PresentationQosPolicy _presentation, DDS.PartitionQosPolicy _partition, DDS.GroupDataQosPolicy _group_data, DDS.EntityFactoryQosPolicy _entity_factory) {
    presentation = _presentation;
    partition = _partition;
    group_data = _group_data;
    entity_factory = _entity_factory;
  }
}
