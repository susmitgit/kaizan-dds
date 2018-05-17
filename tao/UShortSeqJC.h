/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_USHORTSEQJC_H
#define IDL2JNI_GENERATED_USHORTSEQJC_H
#include "tao/UShortSeqC.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "tao_java_export.h"
/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/UShortSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: UShortSeq */

tao_java_Export
void copyToCxx (JNIEnv *jni, CORBA::UShortSeq &target, jshortArray source);
tao_java_Export
void copyToJava (JNIEnv *jni, jshortArray &target, const CORBA::UShortSeq &source, bool createNewObject = false);

/* End TYPEDEF: UShortSeq */

/* End MODULE: CORBA */
#endif /* IDL2JNI_GENERATED_USHORTSEQJC_H */