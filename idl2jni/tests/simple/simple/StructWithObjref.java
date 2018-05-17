package simple;
public final class StructWithObjref implements java.io.Serializable {
  public simple.Local2 objref;
  public simple.Local2[] objrefsequence;

  public StructWithObjref() {}

  public StructWithObjref(simple.Local2 _objref, simple.Local2[] _objrefsequence) {
    objref = _objref;
    objrefsequence = _objrefsequence;
  }
}
