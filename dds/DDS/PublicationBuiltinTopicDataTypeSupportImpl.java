package DDS;
public class PublicationBuiltinTopicDataTypeSupportImpl extends _PublicationBuiltinTopicDataTypeSupportTAOPeer {
    public PublicationBuiltinTopicDataTypeSupportImpl() {
        super(_jni_init());
    }
    private static native long _jni_init();
}
