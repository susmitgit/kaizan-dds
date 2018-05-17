package simple;
public final class TestUnion4 implements java.io.Serializable {
  public TestUnion4() {}

  private boolean _discriminator;

  public boolean discriminator() {
    return _discriminator;
  }

  private char c;

  public char c() {
    if (_discriminator != true) throw new org.omg.CORBA.BAD_OPERATION();
    return c;
  }

  public void c(char _value) {
    _discriminator = true;
    c = _value;
  }

  public void c(boolean _discriminator, char _value) {
    if (_discriminator != true) throw new org.omg.CORBA.BAD_PARAM(34, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    this._discriminator = _discriminator;
    this.c = _value;
  }

  public void __default() {
    _discriminator = false;
  }

  public void __default(boolean discriminator) {
    _discriminator = discriminator;
  }

}
