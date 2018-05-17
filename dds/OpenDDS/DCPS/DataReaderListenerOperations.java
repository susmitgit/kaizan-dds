package OpenDDS.DCPS;
public interface DataReaderListenerOperations extends DDS.DataReaderListenerOperations {
  void on_subscription_disconnected(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);
  void on_subscription_reconnected(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);
  void on_subscription_lost(DDS.DataReader reader, OpenDDS.DCPS.SubscriptionLostStatus status);
  void on_connection_deleted(DDS.DataReader reader);
  void on_budget_exceeded(DDS.DataReader reader, OpenDDS.DCPS.BudgetExceededStatus status);
}
