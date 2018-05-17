/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_DDSDCPSDOMAINJC_H
#define IDL2JNI_GENERATED_DDSDCPSDOMAINJC_H
#include "DdsDcpsDomainC.h"
#include "dds/DdsDcpsInfrastructureJC.h"
#include "dds/DdsDcpsPublicationJC.h"
#include "dds/DdsDcpsSubscriptionJC.h"
#include "dds/DdsDcpsTopicJC.h"
#include "idl2jni_BaseJavaPeer.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "dcps_java_export.h"
/* Generated by ../../bin/idl2jni running on input file ../../dds/DdsDcpsDomain.idl */


/* Begin MODULE: DDS */



/* Begin INTERFACE: DomainParticipantListener */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::DomainParticipantListener_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::DomainParticipantListener_var &source, bool createNewObject = false);

class dcps_java_Export DDS_DomainParticipantListenerJavaPeer
  : public virtual DDS_TopicListenerJavaPeer, public virtual DDS_PublisherListenerJavaPeer, public virtual DDS_SubscriberListenerJavaPeer
  , public virtual DDS::DomainParticipantListener
{
public:
  DDS_DomainParticipantListenerJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , DDS_ListenerJavaPeer (jni, java)
    , DDS_TopicListenerJavaPeer (jni, java)
    , DDS_DataWriterListenerJavaPeer (jni, java)
    , DDS_PublisherListenerJavaPeer (jni, java)
    , DDS_DataReaderListenerJavaPeer (jni, java)
    , DDS_SubscriberListenerJavaPeer (jni, java)
  {}

  CORBA::Boolean _is_a (const char *type_id)
  {
    return DDS::DomainParticipantListener::_is_a (type_id);
  }

  const char* _interface_repository_id () const
  {
    return DDS::DomainParticipantListener::_interface_repository_id ();
  }

  CORBA::Boolean marshal (TAO_OutputCDR &cdr)
  {
    return DDS::DomainParticipantListener::marshal (cdr);
  }

};


/* End INTERFACE: DomainParticipantListener */


/* Begin INTERFACE: DomainParticipant */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::DomainParticipant_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::DomainParticipant_var &source, bool createNewObject = false);

class dcps_java_Export DDS_DomainParticipantJavaPeer
  : public virtual DDS_EntityJavaPeer
  , public virtual DDS::DomainParticipant
{
public:
  DDS_DomainParticipantJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , DDS_EntityJavaPeer (jni, java)
  {}

  DDS::Publisher_ptr create_publisher (const DDS::PublisherQos& qos, DDS::PublisherListener_ptr a_listener, DDS::StatusMask mask);

  DDS::ReturnCode_t delete_publisher (DDS::Publisher_ptr p);

  DDS::Subscriber_ptr create_subscriber (const DDS::SubscriberQos& qos, DDS::SubscriberListener_ptr a_listener, DDS::StatusMask mask);

  DDS::ReturnCode_t delete_subscriber (DDS::Subscriber_ptr s);

  DDS::Subscriber_ptr get_builtin_subscriber ();

  DDS::Topic_ptr create_topic (const char * topic_name, const char * type_name, const DDS::TopicQos& qos, DDS::TopicListener_ptr a_listener, DDS::StatusMask mask);

  DDS::ReturnCode_t delete_topic (DDS::Topic_ptr a_topic);

  DDS::Topic_ptr find_topic (const char * topic_name, const DDS::Duration_t& timeout);

  DDS::TopicDescription_ptr lookup_topicdescription (const char * name);

  DDS::ContentFilteredTopic_ptr create_contentfilteredtopic (const char * name, DDS::Topic_ptr related_topic, const char * filter_expression, const DDS::StringSeq& expression_parameters);

  DDS::ReturnCode_t delete_contentfilteredtopic (DDS::ContentFilteredTopic_ptr a_contentfilteredtopic);

  DDS::MultiTopic_ptr create_multitopic (const char * name, const char * type_name, const char * subscription_expression, const DDS::StringSeq& expression_parameters);

  DDS::ReturnCode_t delete_multitopic (DDS::MultiTopic_ptr a_multitopic);

  DDS::ReturnCode_t delete_contained_entities ();

  CORBA::Boolean contains_entity (DDS::InstanceHandle_t a_handle);

  DDS::ReturnCode_t set_qos (const DDS::DomainParticipantQos& qos);

  DDS::ReturnCode_t get_qos (DDS::DomainParticipantQos& qos);

  DDS::ReturnCode_t set_listener (DDS::DomainParticipantListener_ptr a_listener, DDS::StatusMask mask);

  DDS::DomainParticipantListener_ptr get_listener ();

  DDS::ReturnCode_t ignore_participant (DDS::InstanceHandle_t handle);

  DDS::ReturnCode_t ignore_topic (DDS::InstanceHandle_t handle);

  DDS::ReturnCode_t ignore_publication (DDS::InstanceHandle_t handle);

  DDS::ReturnCode_t ignore_subscription (DDS::InstanceHandle_t handle);

  DDS::DomainId_t get_domain_id ();

  DDS::ReturnCode_t assert_liveliness ();

  DDS::ReturnCode_t set_default_publisher_qos (const DDS::PublisherQos& qos);

  DDS::ReturnCode_t get_default_publisher_qos (DDS::PublisherQos& qos);

  DDS::ReturnCode_t set_default_subscriber_qos (const DDS::SubscriberQos& qos);

  DDS::ReturnCode_t get_default_subscriber_qos (DDS::SubscriberQos& qos);

  DDS::ReturnCode_t set_default_topic_qos (const DDS::TopicQos& qos);

  DDS::ReturnCode_t get_default_topic_qos (DDS::TopicQos& qos);

  DDS::ReturnCode_t get_current_time (DDS::Time_t& current_time);

  DDS::ReturnCode_t get_discovered_participants (DDS::InstanceHandleSeq& participant_handles);

  DDS::ReturnCode_t get_discovered_participant_data (DDS::ParticipantBuiltinTopicData& participant_data, DDS::InstanceHandle_t participant_handle);

  DDS::ReturnCode_t get_discovered_topics (DDS::InstanceHandleSeq& topic_handles);

  DDS::ReturnCode_t get_discovered_topic_data (DDS::TopicBuiltinTopicData& topic_data, DDS::InstanceHandle_t topic_handle);

};


/* End INTERFACE: DomainParticipant */


/* Begin INTERFACE: DomainParticipantFactory */

dcps_java_Export
void copyToCxx (JNIEnv *jni, DDS::DomainParticipantFactory_var &target, jobject source);
dcps_java_Export
void copyToJava (JNIEnv *jni, jobject &target, const DDS::DomainParticipantFactory_var &source, bool createNewObject = false);

class dcps_java_Export DDS_DomainParticipantFactoryJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual DDS::DomainParticipantFactory
{
public:
  DDS_DomainParticipantFactoryJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

  DDS::DomainParticipant_ptr create_participant (DDS::DomainId_t domainId, const DDS::DomainParticipantQos& qos, DDS::DomainParticipantListener_ptr a_listener, DDS::StatusMask mask);

  DDS::ReturnCode_t delete_participant (DDS::DomainParticipant_ptr a_participant);

  DDS::DomainParticipant_ptr lookup_participant (DDS::DomainId_t domainId);

  DDS::ReturnCode_t set_default_participant_qos (const DDS::DomainParticipantQos& qos);

  DDS::ReturnCode_t get_default_participant_qos (DDS::DomainParticipantQos& qos);

  DDS::DomainParticipantFactory_ptr get_instance ();

  DDS::ReturnCode_t set_qos (const DDS::DomainParticipantFactoryQos& qos);

  DDS::ReturnCode_t get_qos (DDS::DomainParticipantFactoryQos& qos);

};


/* End INTERFACE: DomainParticipantFactory */

/* End MODULE: DDS */
#endif /* IDL2JNI_GENERATED_DDSDCPSDOMAINJC_H */