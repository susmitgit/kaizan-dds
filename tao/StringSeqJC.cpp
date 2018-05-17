#include "StringSeqJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file /mnt/openDDS/OpenDDS-3.8/ACE_wrappers/TAO/tao/StringSeq.pidl */


/* Begin MODULE: CORBA */



/* Begin TYPEDEF: StringSeq */

void copyToCxx (JNIEnv *jni, CORBA::StringSeq &target, jobjectArray source)
{
  jobjectArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  target.length (len);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      jobject obj = jni->GetObjectArrayElement (arr, i);
      copyToCxx (jni, target[i], obj);
      jni->DeleteLocalRef (obj);
    }
}

void copyToJava (JNIEnv *jni, jobjectArray &target, const CORBA::StringSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jobjectArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      jclass clazz = findClass (jni, "java/lang/String");
      arr = jni->NewObjectArray (len, clazz, 0);
    }
  else
    {
      arr = target;
    }
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      jobject obj = createNewObject ? 0 : jni->GetObjectArrayElement (arr, i);
      copyToJava (jni, obj, source[i], createNewObject);
      jni->SetObjectArrayElement (arr, i, obj);
      jni->DeleteLocalRef (obj);
    }
  target = arr;
}


/* End TYPEDEF: StringSeq */

/* End MODULE: CORBA */
