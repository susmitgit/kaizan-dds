#include "UShortSeqJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/UShortSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: UShortSeq */

void copyToCxx (JNIEnv *jni, CORBA::UShortSeq &target, jshortArray source)
{
  jshortArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  target.length (len);
  jshort *buf = jni->GetShortArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseShortArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jshortArray &target, const CORBA::UShortSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jshortArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      arr = jni->NewShortArray (len);
    }
  else
    {
      arr = target;
    }
  jshort *buf = jni->GetShortArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      buf[i] = source[i];
    }
  jni->ReleaseShortArrayElements (arr, buf, 0);
  target = arr;
}


/* End TYPEDEF: UShortSeq */

/* End MODULE: CORBA */
