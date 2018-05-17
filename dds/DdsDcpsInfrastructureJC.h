/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_DDSDCPSINFRASTRUCTUREJC_H
#define IDL2JNI_GENERATED_DDSDCPSINFRASTRUCTUREJC_H
#include "DdsDcpsInfrastructureC.h"
#include "dds/DdsDcpsConditionSeqJC.h"
#include "dds/DdsDcpsCoreJC.h"
#include "idl2jni_BaseJavaPeer.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "dcps_java_export.h"
/* Generated by ../../bin/idl2jni running on input file ../../dds/DdsDcpsInfrastructure.idl */


/* Begin MODULE: DDS */



/* Begin TYPEDEF: DomainId_t */


/* End TYPEDEF: DomainId_t */


/* Begin TYPEDEF: ReturnCode_t */


/* End TYPEDEF: ReturnCode_t */


/* Begin CONST: HANDLE_NIL */


/* End CONST: HANDLE_NIL */


/* Begin CONST: LENGTH_UNLIMITED */


/* End CONST: LENGTH_UNLIMITED */


/* Begin CONST: DURATION_INFINITE_SEC */


/* End CONST: DURATION_INFINITE_SEC */


/* Begin CONST: DURATION_INFINITE_NSEC */


/* End CONST: DURATION_INFINITE_NSEC */


/* Begin CONST: DURATION_ZERO_SEC */


/* End CONST: DURATION_ZERO_SEC */


/* Begin CONST: DURATION_ZERO_NSEC */


/* End CONST: DURATION_ZERO_NSEC */


/* Begin CONST: TIME_INVALID_SEC */


/* End CONST: TIME_INVALID_SEC */


/* Begin CONST: TIME_INVALID_NSEC */


/* End CONST: TIME_INVALID_NSEC */


/* Begin CONST: RETCODE_OK */


/* End CONST: RETCODE_OK */


/* Begin CONST: RETCODE_ERROR */


/* End CONST: RETCODE_ERROR */


/* Begin CONST: RETCODE_UNSUPPORTED */


/* End CONST: RETCODE_UNSUPPORTED */


/* Begin CONST: RETCODE_BAD_PARAMETER */


/* End CONST: RETCODE_BAD_PARAMETER */


/* Begin CONST: RETCODE_PRECONDITION_NOT_MET */


/* End CONST: RETCODE_PRECONDITION_NOT_MET */


/* Begin CONST: RETCODE_OUT_OF_RESOURCES */


/* End CONST: RETCODE_OUT_OF_RESOURCES */


/* Begin CONST: RETCODE_NOT_ENABLED */


/* End CONST: RETCODE_NOT_ENABLED */


/* Begin CONST: RETCODE_IMMUTABLE_POLICY */


/* End CONST: RETCODE_IMMUTABLE_POLICY */


/* Begin CONST: RETCODE_INCONSISTENT_POLICY */


/* End CONST: RETCODE_INCONSISTENT_POLICY */


/* Begin CONST: RETCODE_ALREADY_DELETED */


/* End CONST: RETCODE_ALREADY_DELETED */


/* Begin CONST: RETCODE_TIMEOUT */


/* End CONST: RETCODE_TIMEOUT */


/* Begin CONST: RETCODE_NO_DATA */


/* End CONST: RETCODE_NO_DATA */


/* Begin CONST: RETCODE_ILLEGAL_OPERATION */


/* End CONST: RETCODE_ILLEGAL_OPERATION */


/* Begin TYPEDEF: StatusKind */


/* End TYPEDEF: StatusKind */


/* Begin TYPEDEF: StatusMask */


/* End TYPEDEF: StatusMask */


/* Begin CONST: INCONSISTENT_TOPIC_STATUS */


/* End CONST: INCONSISTENT_TOPIC_STATUS */


/* Begin CONST: OFFERED_DEADLINE_MISSED_STATUS */


/* End CONST: OFFERED_DEADLINE_MISSED_STATUS */


/* Begin CONST: REQUESTED_DEADLINE_MISSED_STATUS */


/* End CONST: REQUESTED_DEADLINE_MISSED_STATUS */


/* Begin CONST: OFFERED_INCOMPATIBLE_QOS_STATUS */


/* End CONST: OFFERED_INCOMPATIBLE_QOS_STATUS */


/* Begin CONST: REQUESTED_INCOMPATIBLE_QOS_STATUS */


/* End CONST: REQUESTED_INCOMPATIBLE_QOS_STATUS */


/* Begin CONST: SAMPLE_LOST_STATUS */


/* End CONST: SAMPLE_LOST_STATUS */


/* Begin CONST: SAMPLE_REJECTED_STATUS */


/* End CONST: SAMPLE_REJECTED_STATUS */


/* Begin CONST: DATA_ON_READERS_STATUS */


/* End CONST: DATA_ON_READERS_STATUS */


/* Begin CONST: DATA_AVAILABLE_STATUS */


/* End CONST: DATA_AVAILABLE_STATUS */


/* Begin CONST: LIVELINESS_LOST_STATUS */


/* End CONST: LIVELINESS_LOST_STATUS */


/* Begin CONST: LIVELINESS_CHANGED_STATUS */


/* End CONST: LIVELINESS_CHANGED_STATUS */


/* Begin CONST: PUBLICATION_MATCHED_STATUS */


/* End CONST: PUBLICATION_MATCHED_STATUS */


/* Begin CONST: SUBSCRIPTION_MATCHED_STATUS */


/* End CONST: SUBSCRIPTION_MATCHED_STATUS */


/* Begin STRUCT: InconsistentTopicStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::InconsistentTopicStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::InconsistentTopicStatus &source, bool createNewObject = false);

/* End STRUCT: InconsistentTopicStatus */


/* Begin STRUCT: SampleLostStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::SampleLostStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::SampleLostStatus &source, bool createNewObject = false);

/* End STRUCT: SampleLostStatus */


/* Begin ENUM: SampleRejectedStatusKind */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::SampleRejectedStatusKind &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::SampleRejectedStatusKind &source, bool createNewObject = false);

/* End ENUM: SampleRejectedStatusKind */


/* Begin STRUCT: SampleRejectedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::SampleRejectedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::SampleRejectedStatus &source, bool createNewObject = false);

/* End STRUCT: SampleRejectedStatus */


/* Begin STRUCT: LivelinessLostStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::LivelinessLostStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::LivelinessLostStatus &source, bool createNewObject = false);

/* End STRUCT: LivelinessLostStatus */


/* Begin STRUCT: LivelinessChangedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::LivelinessChangedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::LivelinessChangedStatus &source, bool createNewObject = false);

/* End STRUCT: LivelinessChangedStatus */


/* Begin STRUCT: OfferedDeadlineMissedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::OfferedDeadlineMissedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::OfferedDeadlineMissedStatus &source, bool createNewObject = false);

/* End STRUCT: OfferedDeadlineMissedStatus */


/* Begin STRUCT: RequestedDeadlineMissedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::RequestedDeadlineMissedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::RequestedDeadlineMissedStatus &source, bool createNewObject = false);

/* End STRUCT: RequestedDeadlineMissedStatus */


/* Begin STRUCT: OfferedIncompatibleQosStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::OfferedIncompatibleQosStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::OfferedIncompatibleQosStatus &source, bool createNewObject = false);

/* End STRUCT: OfferedIncompatibleQosStatus */


/* Begin STRUCT: RequestedIncompatibleQosStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::RequestedIncompatibleQosStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::RequestedIncompatibleQosStatus &source, bool createNewObject = false);

/* End STRUCT: RequestedIncompatibleQosStatus */


/* Begin STRUCT: PublicationMatchedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::PublicationMatchedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::PublicationMatchedStatus &source, bool createNewObject = false);

/* End STRUCT: PublicationMatchedStatus */


/* Begin STRUCT: SubscriptionMatchedStatus */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::SubscriptionMatchedStatus &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::SubscriptionMatchedStatus &source, bool createNewObject = false);

/* End STRUCT: SubscriptionMatchedStatus */


/* Begin INTERFACE-FWD: Listener */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::Listener_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::Listener_var &source, bool createNewObject);

/* End INTERFACE-FWD: Listener */


/* Begin INTERFACE-FWD: Entity */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::Entity_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::Entity_var &source, bool createNewObject);

/* End INTERFACE-FWD: Entity */


/* Begin INTERFACE: Listener */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::Listener_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::Listener_var &source, bool createNewObject = false);

class dcps_java_Export DDS_ListenerJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual DDS::Listener
{
public:
  DDS_ListenerJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

};


/* End INTERFACE: Listener */


/* Begin INTERFACE: Condition */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::Condition_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::Condition_var &source, bool createNewObject = false);

class dcps_java_Export DDS_ConditionJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual DDS::Condition
{
public:
  DDS_ConditionJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

  CORBA::Boolean get_trigger_value ();

};


/* End INTERFACE: Condition */


/* Begin INTERFACE: WaitSetInterf */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::WaitSetInterf_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::WaitSetInterf_var &source, bool createNewObject = false);

class dcps_java_Export DDS_WaitSetInterfJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual DDS::WaitSetInterf
{
public:
  DDS_WaitSetInterfJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

  DDS::ReturnCode_t wait (DDS::ConditionSeq& active_conditions, const DDS::Duration_t& timeout);

  DDS::ReturnCode_t attach_condition (DDS::Condition_ptr cond);

  DDS::ReturnCode_t detach_condition (DDS::Condition_ptr cond);

  DDS::ReturnCode_t get_conditions (DDS::ConditionSeq& attached_conditions);

};


/* End INTERFACE: WaitSetInterf */


/* Begin INTERFACE: GuardConditionInterf */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::GuardConditionInterf_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::GuardConditionInterf_var &source, bool createNewObject = false);

class dcps_java_Export DDS_GuardConditionInterfJavaPeer
  : public virtual DDS_ConditionJavaPeer
  , public virtual DDS::GuardConditionInterf
{
public:
  DDS_GuardConditionInterfJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , DDS_ConditionJavaPeer (jni, java)
  {}

  DDS::ReturnCode_t set_trigger_value (CORBA::Boolean value);

};


/* End INTERFACE: GuardConditionInterf */


/* Begin INTERFACE: StatusCondition */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::StatusCondition_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::StatusCondition_var &source, bool createNewObject = false);

class dcps_java_Export DDS_StatusConditionJavaPeer
  : public virtual DDS_ConditionJavaPeer
  , public virtual DDS::StatusCondition
{
public:
  DDS_StatusConditionJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , DDS_ConditionJavaPeer (jni, java)
  {}

  DDS::StatusMask get_enabled_statuses ();

  DDS::ReturnCode_t set_enabled_statuses (DDS::StatusMask mask);

  DDS::Entity_ptr get_entity ();

};


/* End INTERFACE: StatusCondition */


/* Begin CONST: USERDATA_QOS_POLICY_NAME */


/* End CONST: USERDATA_QOS_POLICY_NAME */


/* Begin CONST: DURABILITY_QOS_POLICY_NAME */


/* End CONST: DURABILITY_QOS_POLICY_NAME */


/* Begin CONST: PRESENTATION_QOS_POLICY_NAME */


/* End CONST: PRESENTATION_QOS_POLICY_NAME */


/* Begin CONST: DEADLINE_QOS_POLICY_NAME */


/* End CONST: DEADLINE_QOS_POLICY_NAME */


/* Begin CONST: LATENCYBUDGET_QOS_POLICY_NAME */


/* End CONST: LATENCYBUDGET_QOS_POLICY_NAME */


/* Begin CONST: OWNERSHIP_QOS_POLICY_NAME */


/* End CONST: OWNERSHIP_QOS_POLICY_NAME */


/* Begin CONST: OWNERSHIPSTRENGTH_QOS_POLICY_NAME */


/* End CONST: OWNERSHIPSTRENGTH_QOS_POLICY_NAME */


/* Begin CONST: LIVELINESS_QOS_POLICY_NAME */


/* End CONST: LIVELINESS_QOS_POLICY_NAME */


/* Begin CONST: TIMEBASEDFILTER_QOS_POLICY_NAME */


/* End CONST: TIMEBASEDFILTER_QOS_POLICY_NAME */


/* Begin CONST: PARTITION_QOS_POLICY_NAME */


/* End CONST: PARTITION_QOS_POLICY_NAME */


/* Begin CONST: RELIABILITY_QOS_POLICY_NAME */


/* End CONST: RELIABILITY_QOS_POLICY_NAME */


/* Begin CONST: DESTINATIONORDER_QOS_POLICY_NAME */


/* End CONST: DESTINATIONORDER_QOS_POLICY_NAME */


/* Begin CONST: HISTORY_QOS_POLICY_NAME */


/* End CONST: HISTORY_QOS_POLICY_NAME */


/* Begin CONST: RESOURCELIMITS_QOS_POLICY_NAME */


/* End CONST: RESOURCELIMITS_QOS_POLICY_NAME */


/* Begin CONST: ENTITYFACTORY_QOS_POLICY_NAME */


/* End CONST: ENTITYFACTORY_QOS_POLICY_NAME */


/* Begin CONST: WRITERDATALIFECYCLE_QOS_POLICY_NAME */


/* End CONST: WRITERDATALIFECYCLE_QOS_POLICY_NAME */


/* Begin CONST: READERDATALIFECYCLE_QOS_POLICY_NAME */


/* End CONST: READERDATALIFECYCLE_QOS_POLICY_NAME */


/* Begin CONST: TOPICDATA_QOS_POLICY_NAME */


/* End CONST: TOPICDATA_QOS_POLICY_NAME */


/* Begin CONST: GROUPDATA_QOS_POLICY_NAME */


/* End CONST: GROUPDATA_QOS_POLICY_NAME */


/* Begin CONST: TRANSPORTPRIORITY_QOS_POLICY_NAME */


/* End CONST: TRANSPORTPRIORITY_QOS_POLICY_NAME */


/* Begin CONST: LIFESPAN_QOS_POLICY_NAME */


/* End CONST: LIFESPAN_QOS_POLICY_NAME */


/* Begin CONST: DURABILITYSERVICE_POLICY_NAME */


/* End CONST: DURABILITYSERVICE_POLICY_NAME */


/* Begin CONST: INVALID_QOS_POLICY_ID */


/* End CONST: INVALID_QOS_POLICY_ID */


/* Begin CONST: USERDATA_QOS_POLICY_ID */


/* End CONST: USERDATA_QOS_POLICY_ID */


/* Begin CONST: DURABILITY_QOS_POLICY_ID */


/* End CONST: DURABILITY_QOS_POLICY_ID */


/* Begin CONST: PRESENTATION_QOS_POLICY_ID */


/* End CONST: PRESENTATION_QOS_POLICY_ID */


/* Begin CONST: DEADLINE_QOS_POLICY_ID */


/* End CONST: DEADLINE_QOS_POLICY_ID */


/* Begin CONST: LATENCYBUDGET_QOS_POLICY_ID */


/* End CONST: LATENCYBUDGET_QOS_POLICY_ID */


/* Begin CONST: OWNERSHIP_QOS_POLICY_ID */


/* End CONST: OWNERSHIP_QOS_POLICY_ID */


/* Begin CONST: OWNERSHIPSTRENGTH_QOS_POLICY_ID */


/* End CONST: OWNERSHIPSTRENGTH_QOS_POLICY_ID */


/* Begin CONST: LIVELINESS_QOS_POLICY_ID */


/* End CONST: LIVELINESS_QOS_POLICY_ID */


/* Begin CONST: TIMEBASEDFILTER_QOS_POLICY_ID */


/* End CONST: TIMEBASEDFILTER_QOS_POLICY_ID */


/* Begin CONST: PARTITION_QOS_POLICY_ID */


/* End CONST: PARTITION_QOS_POLICY_ID */


/* Begin CONST: RELIABILITY_QOS_POLICY_ID */


/* End CONST: RELIABILITY_QOS_POLICY_ID */


/* Begin CONST: DESTINATIONORDER_QOS_POLICY_ID */


/* End CONST: DESTINATIONORDER_QOS_POLICY_ID */


/* Begin CONST: HISTORY_QOS_POLICY_ID */


/* End CONST: HISTORY_QOS_POLICY_ID */


/* Begin CONST: RESOURCELIMITS_QOS_POLICY_ID */


/* End CONST: RESOURCELIMITS_QOS_POLICY_ID */


/* Begin CONST: ENTITYFACTORY_QOS_POLICY_ID */


/* End CONST: ENTITYFACTORY_QOS_POLICY_ID */


/* Begin CONST: WRITERDATALIFECYCLE_QOS_POLICY_ID */


/* End CONST: WRITERDATALIFECYCLE_QOS_POLICY_ID */


/* Begin CONST: READERDATALIFECYCLE_QOS_POLICY_ID */


/* End CONST: READERDATALIFECYCLE_QOS_POLICY_ID */


/* Begin CONST: TOPICDATA_QOS_POLICY_ID */


/* End CONST: TOPICDATA_QOS_POLICY_ID */


/* Begin CONST: GROUPDATA_QOS_POLICY_ID */


/* End CONST: GROUPDATA_QOS_POLICY_ID */


/* Begin CONST: TRANSPORTPRIORITY_QOS_POLICY_ID */


/* End CONST: TRANSPORTPRIORITY_QOS_POLICY_ID */


/* Begin CONST: LIFESPAN_QOS_POLICY_ID */


/* End CONST: LIFESPAN_QOS_POLICY_ID */


/* Begin CONST: DURABILITYSERVICE_QOS_POLICY_ID */


/* End CONST: DURABILITYSERVICE_QOS_POLICY_ID */


/* Begin INTERFACE: Entity */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::Entity_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::Entity_var &source, bool createNewObject = false);

class dcps_java_Export DDS_EntityJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual DDS::Entity
{
public:
  DDS_EntityJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

  DDS::ReturnCode_t enable ();

  DDS::StatusCondition_ptr get_statuscondition ();

  DDS::StatusMask get_status_changes ();

  DDS::InstanceHandle_t get_instance_handle ();

};


/* End INTERFACE: Entity */

/* End MODULE: DDS */


/* Begin MODULE: OpenDDS */



/* Begin CONST: TRANSPORTTYPE_QOS_POLICY_NAME */


/* End CONST: TRANSPORTTYPE_QOS_POLICY_NAME */


/* Begin CONST: TRANSPORTTYPE_QOS_POLICY_ID */


/* End CONST: TRANSPORTTYPE_QOS_POLICY_ID */


/* Begin CONST: MAX_USER_DOMAINID */


/* End CONST: MAX_USER_DOMAINID */


/* Begin MODULE: DCPS */



/* Begin CONST: ALL_STATUS_MASK */


/* End CONST: ALL_STATUS_MASK */


/* Begin CONST: NO_STATUS_MASK */


/* End CONST: NO_STATUS_MASK */


/* Begin CONST: DEFAULT_STATUS_MASK */


/* End CONST: DEFAULT_STATUS_MASK */

/* End MODULE: DCPS */

/* End MODULE: OpenDDS */
#endif /* IDL2JNI_GENERATED_DDSDCPSINFRASTRUCTUREJC_H */