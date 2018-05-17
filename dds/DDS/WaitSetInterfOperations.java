package DDS;
public interface WaitSetInterfOperations {
  int wait(DDS.ConditionSeqHolder active_conditions, DDS.Duration_t timeout);
  int attach_condition(DDS.Condition cond);
  int detach_condition(DDS.Condition cond);
  int get_conditions(DDS.ConditionSeqHolder attached_conditions);
}
