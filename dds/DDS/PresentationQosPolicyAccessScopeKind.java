package DDS;
public class PresentationQosPolicyAccessScopeKind implements java.io.Serializable {
  private static PresentationQosPolicyAccessScopeKind[] __values = {
    new PresentationQosPolicyAccessScopeKind(0),
    new PresentationQosPolicyAccessScopeKind(1),
    new PresentationQosPolicyAccessScopeKind(2)
  };

  public static final int _INSTANCE_PRESENTATION_QOS = 0;
  public static final PresentationQosPolicyAccessScopeKind INSTANCE_PRESENTATION_QOS = __values[0];

  public static final int _TOPIC_PRESENTATION_QOS = 1;
  public static final PresentationQosPolicyAccessScopeKind TOPIC_PRESENTATION_QOS = __values[1];

  public static final int _GROUP_PRESENTATION_QOS = 2;
  public static final PresentationQosPolicyAccessScopeKind GROUP_PRESENTATION_QOS = __values[2];

  public int value() { return _value; }

  private int _value;

  public static PresentationQosPolicyAccessScopeKind from_int(int value) {
    if (value >= 0 && value < 3) {
      return __values[value];
    } else {
      return new PresentationQosPolicyAccessScopeKind(value);
    }
  }

  protected PresentationQosPolicyAccessScopeKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
