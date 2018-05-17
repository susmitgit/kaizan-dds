package DDS;
public class LivelinessQosPolicyKind implements java.io.Serializable {
  private static LivelinessQosPolicyKind[] __values = {
    new LivelinessQosPolicyKind(0),
    new LivelinessQosPolicyKind(1),
    new LivelinessQosPolicyKind(2)
  };

  public static final int _AUTOMATIC_LIVELINESS_QOS = 0;
  public static final LivelinessQosPolicyKind AUTOMATIC_LIVELINESS_QOS = __values[0];

  public static final int _MANUAL_BY_PARTICIPANT_LIVELINESS_QOS = 1;
  public static final LivelinessQosPolicyKind MANUAL_BY_PARTICIPANT_LIVELINESS_QOS = __values[1];

  public static final int _MANUAL_BY_TOPIC_LIVELINESS_QOS = 2;
  public static final LivelinessQosPolicyKind MANUAL_BY_TOPIC_LIVELINESS_QOS = __values[2];

  public int value() { return _value; }

  private int _value;

  public static LivelinessQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 3) {
      return __values[value];
    } else {
      return new LivelinessQosPolicyKind(value);
    }
  }

  protected LivelinessQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
