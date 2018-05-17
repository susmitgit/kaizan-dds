package DDS;
public class _WaitSetInterfTAOPeer extends i2jrt.TAOLocalObject implements WaitSetInterf {
  protected _WaitSetInterfTAOPeer(long ptr) {
    super(ptr);
  }

  public native int wait(DDS.ConditionSeqHolder active_conditions, DDS.Duration_t timeout);

  public native int attach_condition(DDS.Condition cond);

  public native int detach_condition(DDS.Condition cond);

  public native int get_conditions(DDS.ConditionSeqHolder attached_conditions);


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
