#include "LongLongSeqJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/LongLongSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: LongLongSeq */

void copyToCxx (JNIEnv *jni, CORBA::LongLongSeq &target, jlongArray source)
{
  jlongArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  target.length (len);
  jlong *buf = jni->GetLongArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseLongArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jlongArray &target, const CORBA::LongLongSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jlongArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      arr = jni->NewLongArray (len);
    }
  else
    {
      arr = target;
    }
  jlong *buf = jni->GetLongArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      buf[i] = source[i];
    }
  jni->ReleaseLongArrayElements (arr, buf, 0);
  target = arr;
}


/* End TYPEDEF: LongLongSeq */

/* End MODULE: CORBA */
