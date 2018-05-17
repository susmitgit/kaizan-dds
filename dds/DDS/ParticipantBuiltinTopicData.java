package DDS;
public final class ParticipantBuiltinTopicData implements java.io.Serializable {
  public DDS.BuiltinTopicKey_t key;
  public DDS.UserDataQosPolicy user_data;

  public ParticipantBuiltinTopicData() {}

  public ParticipantBuiltinTopicData(DDS.BuiltinTopicKey_t _key, DDS.UserDataQosPolicy _user_data) {
    key = _key;
    user_data = _user_data;
  }
}
