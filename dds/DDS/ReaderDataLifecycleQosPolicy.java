package DDS;
public final class ReaderDataLifecycleQosPolicy implements java.io.Serializable {
  public DDS.Duration_t autopurge_nowriter_samples_delay;
  public DDS.Duration_t autopurge_disposed_samples_delay;

  public ReaderDataLifecycleQosPolicy() {}

  public ReaderDataLifecycleQosPolicy(DDS.Duration_t _autopurge_nowriter_samples_delay, DDS.Duration_t _autopurge_disposed_samples_delay) {
    autopurge_nowriter_samples_delay = _autopurge_nowriter_samples_delay;
    autopurge_disposed_samples_delay = _autopurge_disposed_samples_delay;
  }
}
