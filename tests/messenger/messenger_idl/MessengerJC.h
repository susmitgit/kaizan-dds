/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_MESSENGERJC_H
#define IDL2JNI_GENERATED_MESSENGERJC_H
#include "MessengerC.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "messenger_idl_test_Export.h"
/* Generated by ../../../../bin/idl2jni running on input file Messenger.idl */


/* Begin MODULE: Messenger */



/* Begin STRUCT: Message */

messenger_idl_test_Export
void copyToCxx (JNIEnv *jni, Messenger::Message &target, jobject source);
messenger_idl_test_Export
void copyToJava (JNIEnv *jni, jobject &target, const Messenger::Message &source, bool createNewObject = false);

/* End STRUCT: Message */

/* End MODULE: Messenger */
#endif /* IDL2JNI_GENERATED_MESSENGERJC_H */
