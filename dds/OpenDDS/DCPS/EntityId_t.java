package OpenDDS.DCPS;
public final class EntityId_t implements java.io.Serializable {
  public byte[] entityKey;
  public byte entityKind;

  public EntityId_t() {}

  public EntityId_t(byte[] _entityKey, byte _entityKind) {
    entityKey = _entityKey;
    entityKind = _entityKind;
  }
}
