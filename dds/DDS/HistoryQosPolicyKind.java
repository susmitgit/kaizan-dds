package DDS;
public class HistoryQosPolicyKind implements java.io.Serializable {
  private static HistoryQosPolicyKind[] __values = {
    new HistoryQosPolicyKind(0),
    new HistoryQosPolicyKind(1)
  };

  public static final int _KEEP_LAST_HISTORY_QOS = 0;
  public static final HistoryQosPolicyKind KEEP_LAST_HISTORY_QOS = __values[0];

  public static final int _KEEP_ALL_HISTORY_QOS = 1;
  public static final HistoryQosPolicyKind KEEP_ALL_HISTORY_QOS = __values[1];

  public int value() { return _value; }

  private int _value;

  public static HistoryQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 2) {
      return __values[value];
    } else {
      return new HistoryQosPolicyKind(value);
    }
  }

  protected HistoryQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
