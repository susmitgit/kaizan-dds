package DDS;
public final class WriterDataLifecycleQosPolicy implements java.io.Serializable {
  public boolean autodispose_unregistered_instances;

  public WriterDataLifecycleQosPolicy() {}

  public WriterDataLifecycleQosPolicy(boolean _autodispose_unregistered_instances) {
    autodispose_unregistered_instances = _autodispose_unregistered_instances;
  }
}
