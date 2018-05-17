package OpenDDS.DCPS;
public interface TypeSupportOperations extends DDS.TypeSupportOperations {
  DDS.DataWriter create_datawriter();
  DDS.DataReader create_datareader();
  DDS.DataReader create_multitopic_datareader();
  boolean has_dcps_key();
}
