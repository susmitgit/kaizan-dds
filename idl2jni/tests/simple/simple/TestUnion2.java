package simple;
public final class TestUnion2 implements java.io.Serializable {
  public TestUnion2() {}

  private short _discriminator;

  public short discriminator() {
    return _discriminator;
  }

  private String s;

  public String s() {
    if (_discriminator != 0) throw new org.omg.CORBA.BAD_OPERATION();
    return s;
  }

  public void s(String _value) {
    _discriminator = 0;
    s = _value;
  }

  public void s(short _discriminator, String _value) {
    if (_discriminator != 0) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.s = _value;
  }

  private simple.TestStruct t;

  public simple.TestStruct t() {
    if (_discriminator != 1) throw new org.omg.CORBA.BAD_OPERATION();
    return t;
  }

  public void t(simple.TestStruct _value) {
    _discriminator = 1;
    t = _value;
  }

  public void t(short _discriminator, simple.TestStruct _value) {
    if (_discriminator != 1) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.t = _value;
  }

  private int[] q;

  public int[] q() {
    if (_discriminator != 2 && _discriminator != 3) throw new org.omg.CORBA.BAD_OPERATION();
    return q;
  }

  public void q(int[] _value) {
    _discriminator = 2;
    q = _value;
  }

  public void q(short _discriminator, int[] _value) {
    if (_discriminator != 2 && _discriminator != 3) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.q = _value;
  }

  private String d;

  public String d() {
    if (_discriminator != 4) throw new org.omg.CORBA.BAD_OPERATION();
    return d;
  }

  public void d(String _value) {
    _discriminator = 4;
    d = _value;
  }

  public void d(short _discriminator, String _value) {
    if (_discriminator != 4) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.d = _value;
  }

  private simple.TestEnum e;

  public simple.TestEnum e() {
    if (_discriminator == 0 || _discriminator == 1 || _discriminator == 2 || _discriminator == 3 || _discriminator == 4) throw new org.omg.CORBA.BAD_OPERATION();
    return e;
  }

  public void e(simple.TestEnum _value) {
    _discriminator = -32768;
    e = _value;
  }

  public void e(short _discriminator, simple.TestEnum _value) {
    if (_discriminator == 0 || _discriminator == 1 || _discriminator == 2 || _discriminator == 3 || _discriminator == 4) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.e = _value;
  }

}
