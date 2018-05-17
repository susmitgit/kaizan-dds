package DDS;
public class _QueryConditionTAOPeer extends i2jrt.TAOLocalObject implements QueryCondition {
  protected _QueryConditionTAOPeer(long ptr) {
    super(ptr);
  }

  public native String get_query_expression();

  public native int get_query_parameters(DDS.StringSeqHolder query_parameters);

  public native int set_query_parameters(String[] query_parameters);

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
