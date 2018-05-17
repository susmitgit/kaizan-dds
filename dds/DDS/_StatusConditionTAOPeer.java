package DDS;
public class _StatusConditionTAOPeer extends i2jrt.TAOLocalObject implements StatusCondition {
  protected _StatusConditionTAOPeer(long ptr) {
    super(ptr);
  }

  public native int get_enabled_statuses();

  public native int set_enabled_statuses(int mask);

  public native DDS.Entity get_entity();

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
