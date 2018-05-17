package DDS;
public class _SubscriberListenerTAOPeer extends i2jrt.TAOLocalObject implements SubscriberListener {
  protected _SubscriberListenerTAOPeer(long ptr) {
    super(ptr);
  }

  public native void on_data_on_readers(DDS.Subscriber subs);

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
