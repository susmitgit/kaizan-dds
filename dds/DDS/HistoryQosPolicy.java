package DDS;
public final class HistoryQosPolicy implements java.io.Serializable {
  public DDS.HistoryQosPolicyKind kind;
  public int depth;

  public HistoryQosPolicy() {}

  public HistoryQosPolicy(DDS.HistoryQosPolicyKind _kind, int _depth) {
    kind = _kind;
    depth = _depth;
  }
}
