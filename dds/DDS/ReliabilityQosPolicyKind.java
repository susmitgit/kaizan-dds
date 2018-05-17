package DDS;
public class ReliabilityQosPolicyKind implements java.io.Serializable {
  private static ReliabilityQosPolicyKind[] __values = {
    new ReliabilityQosPolicyKind(0),
    new ReliabilityQosPolicyKind(1)
  };

  public static final int _BEST_EFFORT_RELIABILITY_QOS = 0;
  public static final ReliabilityQosPolicyKind BEST_EFFORT_RELIABILITY_QOS = __values[0];

  public static final int _RELIABLE_RELIABILITY_QOS = 1;
  public static final ReliabilityQosPolicyKind RELIABLE_RELIABILITY_QOS = __values[1];

  public int value() { return _value; }

  private int _value;

  public static ReliabilityQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 2) {
      return __values[value];
    } else {
      return new ReliabilityQosPolicyKind(value);
    }
  }

  protected ReliabilityQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
