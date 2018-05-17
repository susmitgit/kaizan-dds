package DDS;
public class ParticipantBuiltinTopicDataTypeSupportImpl extends _ParticipantBuiltinTopicDataTypeSupportTAOPeer {
    public ParticipantBuiltinTopicDataTypeSupportImpl() {
        super(_jni_init());
    }
    private static native long _jni_init();
}
