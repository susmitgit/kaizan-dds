package OpenDDS.DCPS;
public interface DataWriterListenerOperations extends DDS.DataWriterListenerOperations {
  void on_publication_disconnected(DDS.DataWriter reader, OpenDDS.DCPS.PublicationLostStatus status);
  void on_publication_reconnected(DDS.DataWriter reader, OpenDDS.DCPS.PublicationLostStatus status);
  void on_publication_lost(DDS.DataWriter writer, OpenDDS.DCPS.PublicationLostStatus status);
  void on_connection_deleted(DDS.DataWriter writer);
}
