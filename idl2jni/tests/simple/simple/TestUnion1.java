package simple;
public final class TestUnion1 implements java.io.Serializable {
  public TestUnion1() {}

  private simple.TestEnum _discriminator;

  public simple.TestEnum discriminator() {
    return _discriminator;
  }

  private byte o;

  public byte o() {
    if (_discriminator.value() != 0) throw new org.omg.CORBA.BAD_OPERATION();
    return o;
  }

  public void o(byte _value) {
    _discriminator = simple.TestEnum.from_int(0);
    o = _value;
  }

  public void o(simple.TestEnum _discriminator, byte _value) {
    if (_discriminator.value() != 0) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.o = _value;
  }

  private short s;

  public short s() {
    if (_discriminator.value() != 1) throw new org.omg.CORBA.BAD_OPERATION();
    return s;
  }

  public void s(short _value) {
    _discriminator = simple.TestEnum.from_int(1);
    s = _value;
  }

  public void s(simple.TestEnum _discriminator, short _value) {
    if (_discriminator.value() != 1) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.s = _value;
  }

  private int l;

  public int l() {
    if (_discriminator.value() != 2) throw new org.omg.CORBA.BAD_OPERATION();
    return l;
  }

  public void l(int _value) {
    _discriminator = simple.TestEnum.from_int(2);
    l = _value;
  }

  public void l(simple.TestEnum _discriminator, int _value) {
    if (_discriminator.value() != 2) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.l = _value;
  }

  private boolean n;

  public boolean n() {
    if (_discriminator.value() != 3) throw new org.omg.CORBA.BAD_OPERATION();
    return n;
  }

  public void n(boolean _value) {
    _discriminator = simple.TestEnum.from_int(3);
    n = _value;
  }

  public void n(simple.TestEnum _discriminator, boolean _value) {
    if (_discriminator.value() != 3) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.n = _value;
  }

  private double u;

  public double u() {
    if (_discriminator.value() != 4) throw new org.omg.CORBA.BAD_OPERATION();
    return u;
  }

  public void u(double _value) {
    _discriminator = simple.TestEnum.from_int(4);
    u = _value;
  }

  public void u(simple.TestEnum _discriminator, double _value) {
    if (_discriminator.value() != 4) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.u = _value;
  }

  public void __default() {
    _discriminator = simple.TestEnum.from_int(5);
  }

  public void __default(simple.TestEnum discriminator) {
    _discriminator = discriminator;
  }

}
