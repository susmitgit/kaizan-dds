package simple;
public final class TestUnion3 implements java.io.Serializable {
  public TestUnion3() {}

  private simple.TestEnum _discriminator;

  public simple.TestEnum discriminator() {
    return _discriminator;
  }

  private simple.TestStruct[] sa;

  public simple.TestStruct[] sa() {
    if (_discriminator.value() != 0) throw new org.omg.CORBA.BAD_OPERATION();
    return sa;
  }

  public void sa(simple.TestStruct[] _value) {
    _discriminator = simple.TestEnum.from_int(0);
    sa = _value;
  }

  public void sa(simple.TestEnum _discriminator, simple.TestStruct[] _value) {
    if (_discriminator.value() != 0) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.sa = _value;
  }

  private simple.TestInterf obj;

  public simple.TestInterf obj() {
    if (_discriminator.value() != 1) throw new org.omg.CORBA.BAD_OPERATION();
    return obj;
  }

  public void obj(simple.TestInterf _value) {
    _discriminator = simple.TestEnum.from_int(1);
    obj = _value;
  }

  public void obj(simple.TestEnum _discriminator, simple.TestInterf _value) {
    if (_discriminator.value() != 1) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.obj = _value;
  }

  private simple.TestUnion2[] us;

  public simple.TestUnion2[] us() {
    if (_discriminator.value() != 2) throw new org.omg.CORBA.BAD_OPERATION();
    return us;
  }

  public void us(simple.TestUnion2[] _value) {
    _discriminator = simple.TestEnum.from_int(2);
    us = _value;
  }

  public void us(simple.TestEnum _discriminator, simple.TestUnion2[] _value) {
    if (_discriminator.value() != 2) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.us = _value;
  }

  private double fp;

  public double fp() {
    if (_discriminator.value() == 0 || _discriminator.value() == 1 || _discriminator.value() == 2) throw new org.omg.CORBA.BAD_OPERATION();
    return fp;
  }

  public void fp(double _value) {
    _discriminator = simple.TestEnum.from_int(3);
    fp = _value;
  }

  public void fp(simple.TestEnum _discriminator, double _value) {
    if (_discriminator.value() == 0 || _discriminator.value() == 1 || _discriminator.value() == 2) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.fp = _value;
  }

}
