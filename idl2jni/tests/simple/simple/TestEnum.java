package simple;
public class TestEnum implements java.io.Serializable {
  private static TestEnum[] __values = {
    new TestEnum(0),
    new TestEnum(1),
    new TestEnum(2),
    new TestEnum(3),
    new TestEnum(4)
  };

  public static final int _a = 0;
  public static final TestEnum a = __values[0];

  public static final int _b = 1;
  public static final TestEnum b = __values[1];

  public static final int _c = 2;
  public static final TestEnum c = __values[2];

  public static final int _d = 3;
  public static final TestEnum d = __values[3];

  public static final int _e = 4;
  public static final TestEnum e = __values[4];

  public int value() { return _value; }

  private int _value;

  public static TestEnum from_int(int value) {
    if (value >= 0 && value < 5) {
      return __values[value];
    } else {
      return new TestEnum(value);
    }
  }

  protected TestEnum(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
