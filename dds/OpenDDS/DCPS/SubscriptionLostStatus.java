package OpenDDS.DCPS;
public final class SubscriptionLostStatus implements java.io.Serializable {
  public int[] publication_handles;

  public SubscriptionLostStatus() {}

  public SubscriptionLostStatus(int[] _publication_handles) {
    publication_handles = _publication_handles;
  }
}
