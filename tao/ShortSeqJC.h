/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_SHORTSEQJC_H
#define IDL2JNI_GENERATED_SHORTSEQJC_H
#include "tao/ShortSeqC.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "tao_java_export.h"
/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/ShortSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: ShortSeq */

tao_java_Export
void copyToCxx (JNIEnv *jni, CORBA::ShortSeq &target, jshortArray source);
tao_java_Export
void copyToJava (JNIEnv *jni, jshortArray &target, const CORBA::ShortSeq &source, bool createNewObject = false);

/* End TYPEDEF: ShortSeq */

/* End MODULE: CORBA */
#endif /* IDL2JNI_GENERATED_SHORTSEQJC_H */
