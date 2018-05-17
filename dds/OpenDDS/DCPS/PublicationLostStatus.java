package OpenDDS.DCPS;
public final class PublicationLostStatus implements java.io.Serializable {
  public int[] subscription_handles;

  public PublicationLostStatus() {}

  public PublicationLostStatus(int[] _subscription_handles) {
    subscription_handles = _subscription_handles;
  }
}
