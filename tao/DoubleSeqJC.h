/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_DOUBLESEQJC_H
#define IDL2JNI_GENERATED_DOUBLESEQJC_H
#include "tao/DoubleSeqC.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
#include "tao_java_export.h"
/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/DoubleSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: DoubleSeq */

tao_java_Export
void copyToCxx (JNIEnv *jni, CORBA::DoubleSeq &target, jdoubleArray source);
tao_java_Export
void copyToJava (JNIEnv *jni, jdoubleArray &target, const CORBA::DoubleSeq &source, bool createNewObject = false);

/* End TYPEDEF: DoubleSeq */

/* End MODULE: CORBA */
#endif /* IDL2JNI_GENERATED_DOUBLESEQJC_H */