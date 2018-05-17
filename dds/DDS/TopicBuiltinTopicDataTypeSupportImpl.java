package DDS;
public class TopicBuiltinTopicDataTypeSupportImpl extends _TopicBuiltinTopicDataTypeSupportTAOPeer {
    public TopicBuiltinTopicDataTypeSupportImpl() {
        super(_jni_init());
    }
    private static native long _jni_init();
}
