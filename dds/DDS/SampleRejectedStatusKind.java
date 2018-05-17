package DDS;
public class SampleRejectedStatusKind implements java.io.Serializable {
  private static SampleRejectedStatusKind[] __values = {
    new SampleRejectedStatusKind(0),
    new SampleRejectedStatusKind(1),
    new SampleRejectedStatusKind(2),
    new SampleRejectedStatusKind(3)
  };

  public static final int _NOT_REJECTED = 0;
  public static final SampleRejectedStatusKind NOT_REJECTED = __values[0];

  public static final int _REJECTED_BY_INSTANCES_LIMIT = 1;
  public static final SampleRejectedStatusKind REJECTED_BY_INSTANCES_LIMIT = __values[1];

  public static final int _REJECTED_BY_SAMPLES_LIMIT = 2;
  public static final SampleRejectedStatusKind REJECTED_BY_SAMPLES_LIMIT = __values[2];

  public static final int _REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT = 3;
  public static final SampleRejectedStatusKind REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT = __values[3];

  public int value() { return _value; }

  private int _value;

  public static SampleRejectedStatusKind from_int(int value) {
    if (value >= 0 && value < 4) {
      return __values[value];
    } else {
      return new SampleRejectedStatusKind(value);
    }
  }

  protected SampleRejectedStatusKind(int value) { _value = value; }

  public Object readResolve()
      throws java.io.ObjectStreamException {
    return from_int(value());
  }

}
