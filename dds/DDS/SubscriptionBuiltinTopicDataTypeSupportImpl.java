package DDS;
public class SubscriptionBuiltinTopicDataTypeSupportImpl extends _SubscriptionBuiltinTopicDataTypeSupportTAOPeer {
    public SubscriptionBuiltinTopicDataTypeSupportImpl() {
        super(_jni_init());
    }
    private static native long _jni_init();
}
