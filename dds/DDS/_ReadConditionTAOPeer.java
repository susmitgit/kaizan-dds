package DDS;
public class _ReadConditionTAOPeer extends i2jrt.TAOLocalObject implements ReadCondition {
  protected _ReadConditionTAOPeer(long ptr) {
    super(ptr);
  }

  public native int get_sample_state_mask();

  public native int get_view_state_mask();

  public native int get_instance_state_mask();

  public native DDS.DataReader get_datareader();

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
