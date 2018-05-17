package DDS;
public class _ConditionTAOPeer extends i2jrt.TAOLocalObject implements Condition {
  protected _ConditionTAOPeer(long ptr) {
    super(ptr);
  }

  public native boolean get_trigger_value();


  static {
    String propVal = System.getProperty("opendds.native.debug");
    if (propVal != null && ("1".equalsIgnoreCase(propVal) ||
        "y".equalsIgnoreCase(propVal) ||
        "yes".equalsIgnoreCase(propVal) ||
        "t".equalsIgnoreCase(propVal) ||
        "true".equalsIgnoreCase(propVal)))
      System.loadLibrary("OpenDDS_DCPS_Javad");
    else System.loadLibrary("OpenDDS_DCPS_Java");
  }

}
