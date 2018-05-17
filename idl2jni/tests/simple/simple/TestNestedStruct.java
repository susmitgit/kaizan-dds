package simple;
public final class TestNestedStruct implements java.io.Serializable {
  public simple.TestStruct m;
  public String str;
  public int[] arr;
  public String[][] sss;
  public String[][][] ssss;
  public int[][] lss;
  public int[][][] lsss;

  public TestNestedStruct() {}

  public TestNestedStruct(simple.TestStruct _m, String _str, int[] _arr, String[][] _sss, String[][][] _ssss, int[][] _lss, int[][][] _lsss) {
    m = _m;
    str = _str;
    arr = _arr;
    sss = _sss;
    ssss = _ssss;
    lss = _lss;
    lsss = _lsss;
  }
}
