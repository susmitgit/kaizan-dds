package OpenDDS.DCPS;
public class _DataReaderListenerTAOPeer extends i2jrt.TAOLocalObject implements DataReaderListener {
  protected _DataReaderListenerTAOPeer(long ptr) {
    super(ptr);
  }

  public native void on_subscription_disconnected(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);

  public native void on_subscription_reconnected(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);

  public native void on_subscription_lost(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);

  public native void on_connection_deleted(DDS.DataReader reader);

  public native void on_budget_exceeded(DDS.DataReader reader, OpenDDS.DCPS.BudgetExceededStatus status);

  public native void on_requested_deadline_missed(DDS.DataReader reader, DDS.RequestedDeadlineMissedStatus status);

  public native void on_requested_incompatible_qos(DDS.DataReader reader, DDS.RequestedIncompatibleQosStatus status);

  public native void on_sample_rejected(DDS.DataReader reader, DDS.SampleRejectedStatus status);

  public native void on_liveliness_changed(DDS.DataReader reader, DDS.LivelinessChangedStatus status);

  public native void on_data_available(DDS.DataReader reader);

  public native void on_subscription_matched(DDS.DataReader reader, DDS.SubscriptionMatchedStatus status);

  public native void on_sample_lost(DDS.DataReader reader, DDS.SampleLostStatus status);


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
