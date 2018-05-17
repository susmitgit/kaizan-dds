package DDS;
public class _GuardConditionInterfTAOPeer extends i2jrt.TAOLocalObject implements GuardConditionInterf {
  protected _GuardConditionInterfTAOPeer(long ptr) {
    super(ptr);
  }

  public native int set_trigger_value(boolean value);

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
