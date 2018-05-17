#include "LongSeqJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/LongSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: LongSeq */

void copyToCxx (JNIEnv *jni, CORBA::LongSeq &target, jintArray source)
{
  jintArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  target.length (len);
  jint *buf = jni->GetIntArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseIntArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jintArray &target, const CORBA::LongSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jintArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      arr = jni->NewIntArray (len);
    }
  else
    {
      arr = target;
    }
  jint *buf = jni->GetIntArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      buf[i] = source[i];
    }
  jni->ReleaseIntArrayElements (arr, buf, 0);
  target = arr;
}


/* End TYPEDEF: LongSeq */

/* End MODULE: CORBA */
