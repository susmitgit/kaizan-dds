package simple;
public final class TestStructWithEnum implements java.io.Serializable {
  public int count;
  public simple.TestEnum which;
  public simple.TestEnum[] lotsOfEm;
  public simple.TestUnion1 fixedUnion;
  public simple.TestUnion2 variableUnion;

  public TestStructWithEnum() {}

  public TestStructWithEnum(int _count, simple.TestEnum _which, simple.TestEnum[] _lotsOfEm, simple.TestUnion1 _fixedUnion, simple.TestUnion2 _variableUnion) {
    count = _count;
    which = _which;
    lotsOfEm = _lotsOfEm;
    fixedUnion = _fixedUnion;
    variableUnion = _variableUnion;
  }
}
