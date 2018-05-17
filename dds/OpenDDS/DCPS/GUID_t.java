package OpenDDS.DCPS;
public final class GUID_t implements java.io.Serializable {
  public byte[] guidPrefix;
  public OpenDDS.DCPS.EntityId_t entityId;

  public GUID_t() {}

  public GUID_t(byte[] _guidPrefix, OpenDDS.DCPS.EntityId_t _entityId) {
    guidPrefix = _guidPrefix;
    entityId = _entityId;
  }
}
