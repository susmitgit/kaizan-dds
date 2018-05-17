package DDS;
public interface EntityOperations {
  int enable();
  DDS.StatusCondition get_statuscondition();
  int get_status_changes();
  int get_instance_handle();
}
