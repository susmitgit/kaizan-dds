package simple;
public final class TestStruct implements java.io.Serializable {
  public int m1;
  public int m2;
  public int[] seq1;
  public int[] seq2;
  public String st;

  public TestStruct() {}

  public TestStruct(int _m1, int _m2, int[] _seq1, int[] _seq2, String _st) {
    m1 = _m1;
    m2 = _m2;
    seq1 = _seq1;
    seq2 = _seq2;
    st = _st;
  }
}
