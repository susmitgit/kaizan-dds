#include "OctetSeqJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/OctetSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: OctetSeq */

void copyToCxx (JNIEnv *jni, CORBA::OctetSeq &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  target.length (len);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const CORBA::OctetSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jbyteArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      arr = jni->NewByteArray (len);
    }
  else
    {
      arr = target;
    }
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      buf[i] = source[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, 0);
  target = arr;
}


/* End TYPEDEF: OctetSeq */

/* End MODULE: CORBA */
