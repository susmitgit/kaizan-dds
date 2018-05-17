/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_STRINGSEQJC_H
#define IDL2JNI_GENERATED_STRINGSEQJC_H
#include "tao/StringSeqC.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "tao_java_export.h"
/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/StringSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: StringSeq */

tao_java_Export
void copyToCxx (JNIEnv *jni, CORBA::StringSeq &target, jobjectArray source);
tao_java_Export
void copyToJava (JNIEnv *jni, jobjectArray &target, const CORBA::StringSeq &source, bool createNewObject = false);

/* End TYPEDEF: StringSeq */

/* End MODULE: CORBA */
#endif /* IDL2JNI_GENERATED_STRINGSEQJC_H */
