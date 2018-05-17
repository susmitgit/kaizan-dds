package DDS;
public class DurabilityQosPolicyKind implements java.io.Serializable {
  private static DurabilityQosPolicyKind[] __values = {
    new DurabilityQosPolicyKind(0),
    new DurabilityQosPolicyKind(1),
    new DurabilityQosPolicyKind(2),
    new DurabilityQosPolicyKind(3)
  };

  public static final int _VOLATILE_DURABILITY_QOS = 0;
  public static final DurabilityQosPolicyKind VOLATILE_DURABILITY_QOS = __values[0];

  public static final int _TRANSIENT_LOCAL_DURABILITY_QOS = 1;
  public static final DurabilityQosPolicyKind TRANSIENT_LOCAL_DURABILITY_QOS = __values[1];

  public static final int _TRANSIENT_DURABILITY_QOS = 2;
  public static final DurabilityQosPolicyKind TRANSIENT_DURABILITY_QOS = __values[2];

  public static final int _PERSISTENT_DURABILITY_QOS = 3;
  public static final DurabilityQosPolicyKind PERSISTENT_DURABILITY_QOS = __values[3];

  public int value() { return _value; }

  private int _value;

  public static DurabilityQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 4) {
      return __values[value];
    } else {
      return new DurabilityQosPolicyKind(value);
    }
  }

  protected DurabilityQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
