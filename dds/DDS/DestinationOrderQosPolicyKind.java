package DDS;
public class DestinationOrderQosPolicyKind implements java.io.Serializable {
  private static DestinationOrderQosPolicyKind[] __values = {
    new DestinationOrderQosPolicyKind(0),
    new DestinationOrderQosPolicyKind(1)
  };

  public static final int _BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS = 0;
  public static final DestinationOrderQosPolicyKind BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS = __values[0];

  public static final int _BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS = 1;
  public static final DestinationOrderQosPolicyKind BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS = __values[1];

  public int value() { return _value; }

  private int _value;

  public static DestinationOrderQosPolicyKind from_int(int value) {
    if (value >= 0 && value < 2) {
      return __values[value];
    } else {
      return new DestinationOrderQosPolicyKind(value);
    }
  }

  protected DestinationOrderQosPolicyKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
