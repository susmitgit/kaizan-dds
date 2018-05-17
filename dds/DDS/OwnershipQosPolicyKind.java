package DDS;
public class OwnershipQosPolicyKind implements java.io.Serializable {
  private static OwnershipQosPolicyKind[] __values = {
    new OwnershipQosPolicyKind(0),
    new OwnershipQosPolicyKind(1)
  };

  public static final int _SHARED_OWNERSHIP_QOS = 0;
  public static final OwnershipQosPolicyKind SHARED_OWNERSHIP_QOS = __values[0];

  public static final int _EXCLUSIVE_OWNERSHIP_QOS = 1;
  public static final OwnershipQosPolicyKind EXCLUSIVE_OWNERSHIP_QOS = __values[1];

  public int value() { return _value; }

  private int _value;

  public static OwnershipQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 2) {
      return __values[value];
    } else {
      return new OwnershipQosPolicyKind(value);
    }
  }

  protected OwnershipQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
