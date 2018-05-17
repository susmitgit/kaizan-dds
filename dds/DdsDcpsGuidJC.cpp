#include "DdsDcpsGuidJC.h"
#include "idl2jni_runtime.h"

/* Generated by ../../bin/idl2jni running on input file ../../dds/DdsDcpsGuid.idl */


/* Begin MODULE: OpenDDS */



/* Begin MODULE: DCPS */



/* Begin TYPEDEF: GuidVendorId_t */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GuidVendorId_t &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::GuidVendorId_t &source, bool createNewObject)
{
  jsize len = 2;
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

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GuidVendorId_t_var &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::GuidVendorId_t_var &source, bool createNewObject)
{
  jsize len = 2;
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


/* End TYPEDEF: GuidVendorId_t */


/* Begin TYPEDEF: GuidPrefix_t */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GuidPrefix_t &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::GuidPrefix_t &source, bool createNewObject)
{
  jsize len = 12;
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

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GuidPrefix_t_var &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::GuidPrefix_t_var &source, bool createNewObject)
{
  jsize len = 12;
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


/* End TYPEDEF: GuidPrefix_t */


/* Begin TYPEDEF: EntityKey_t */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::EntityKey_t &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::EntityKey_t &source, bool createNewObject)
{
  jsize len = 3;
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

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::EntityKey_t_var &target, jbyteArray source)
{
  jbyteArray arr = source;
  jsize len = jni->GetArrayLength (arr);
  jbyte *buf = jni->GetByteArrayElements (arr, 0);
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      target[i] = buf[i];
    }
  jni->ReleaseByteArrayElements (arr, buf, JNI_ABORT);
}

void copyToJava (JNIEnv *jni, jbyteArray &target, const OpenDDS::DCPS::EntityKey_t_var &source, bool createNewObject)
{
  jsize len = 3;
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


/* End TYPEDEF: EntityKey_t */


/* Begin STRUCT: EntityId_t */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::EntityId_t &target, jobject source)
{
  jclass clazz = jni->GetObjectClass (source);
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityKey", "[B");
    jbyteArray obj = static_cast<jbyteArray> (jni->GetObjectField (source, fid));
    copyToCxx (jni, target.entityKey, obj);
    jni->DeleteLocalRef (obj);
  }
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityKind", "B");
    target.entityKind = jni->GetByteField (source, fid);
  }
}

void copyToJava (JNIEnv *jni, jobject &target, const OpenDDS::DCPS::EntityId_t &source, bool createNewObject)
{
  jclass clazz;
  if (createNewObject)
    {
      clazz = findClass (jni, "OpenDDS/DCPS/EntityId_t");
      jmethodID ctor = jni->GetMethodID (clazz, "<init>", "()V");
      target = jni->NewObject (clazz, ctor);
    }
  else
    {
      clazz = jni->GetObjectClass (target);
    }
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityKey", "[B");
    jbyteArray obj = createNewObject ? 0 : static_cast<jbyteArray> (jni->GetObjectField (target, fid));
    copyToJava (jni, obj, source.entityKey, createNewObject);
    jni->SetObjectField (target, fid, obj);
    jni->DeleteLocalRef (obj);
  }
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityKind", "B");
    jni->SetByteField (target, fid, source.entityKind);
  }
}


/* End STRUCT: EntityId_t */


/* Begin CONST: ENTITYKIND_BUILTIN_UNKNOWN */


/* End CONST: ENTITYKIND_BUILTIN_UNKNOWN */


/* Begin CONST: ENTITYKIND_BUILTIN_PARTICIPANT */


/* End CONST: ENTITYKIND_BUILTIN_PARTICIPANT */


/* Begin CONST: ENTITYKIND_BUILTIN_WRITER_WITH_KEY */


/* End CONST: ENTITYKIND_BUILTIN_WRITER_WITH_KEY */


/* Begin CONST: ENTITYKIND_BUILTIN_WRITER_NO_KEY */


/* End CONST: ENTITYKIND_BUILTIN_WRITER_NO_KEY */


/* Begin CONST: ENTITYKIND_BUILTIN_READER_NO_KEY */


/* End CONST: ENTITYKIND_BUILTIN_READER_NO_KEY */


/* Begin CONST: ENTITYKIND_BUILTIN_READER_WITH_KEY */


/* End CONST: ENTITYKIND_BUILTIN_READER_WITH_KEY */


/* Begin CONST: ENTITYKIND_USER_UNKNOWN */


/* End CONST: ENTITYKIND_USER_UNKNOWN */


/* Begin CONST: ENTITYKIND_USER_WRITER_WITH_KEY */


/* End CONST: ENTITYKIND_USER_WRITER_WITH_KEY */


/* Begin CONST: ENTITYKIND_USER_WRITER_NO_KEY */


/* End CONST: ENTITYKIND_USER_WRITER_NO_KEY */


/* Begin CONST: ENTITYKIND_USER_READER_NO_KEY */


/* End CONST: ENTITYKIND_USER_READER_NO_KEY */


/* Begin CONST: ENTITYKIND_USER_READER_WITH_KEY */


/* End CONST: ENTITYKIND_USER_READER_WITH_KEY */


/* Begin CONST: ENTITYKIND_OPENDDS_SUBSCRIBER */


/* End CONST: ENTITYKIND_OPENDDS_SUBSCRIBER */


/* Begin CONST: ENTITYKIND_OPENDDS_PUBLISHER */


/* End CONST: ENTITYKIND_OPENDDS_PUBLISHER */


/* Begin CONST: ENTITYKIND_OPENDDS_TOPIC */


/* End CONST: ENTITYKIND_OPENDDS_TOPIC */


/* Begin CONST: ENTITYKIND_OPENDDS_USER */


/* End CONST: ENTITYKIND_OPENDDS_USER */


/* Begin CONST: ENTITYKIND_OPENDDS_NIL_WRITER */


/* End CONST: ENTITYKIND_OPENDDS_NIL_WRITER */


/* Begin STRUCT: GUID_t */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GUID_t &target, jobject source)
{
  jclass clazz = jni->GetObjectClass (source);
  {
    jfieldID fid = jni->GetFieldID (clazz, "guidPrefix", "[B");
    jbyteArray obj = static_cast<jbyteArray> (jni->GetObjectField (source, fid));
    copyToCxx (jni, target.guidPrefix, obj);
    jni->DeleteLocalRef (obj);
  }
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityId", "LOpenDDS/DCPS/EntityId_t;");
    jobject obj = jni->GetObjectField (source, fid);
    copyToCxx (jni, target.entityId, obj);
    jni->DeleteLocalRef (obj);
  }
}

void copyToJava (JNIEnv *jni, jobject &target, const OpenDDS::DCPS::GUID_t &source, bool createNewObject)
{
  jclass clazz;
  if (createNewObject)
    {
      clazz = findClass (jni, "OpenDDS/DCPS/GUID_t");
      jmethodID ctor = jni->GetMethodID (clazz, "<init>", "()V");
      target = jni->NewObject (clazz, ctor);
    }
  else
    {
      clazz = jni->GetObjectClass (target);
    }
  {
    jfieldID fid = jni->GetFieldID (clazz, "guidPrefix", "[B");
    jbyteArray obj = createNewObject ? 0 : static_cast<jbyteArray> (jni->GetObjectField (target, fid));
    copyToJava (jni, obj, source.guidPrefix, createNewObject);
    jni->SetObjectField (target, fid, obj);
    jni->DeleteLocalRef (obj);
  }
  {
    jfieldID fid = jni->GetFieldID (clazz, "entityId", "LOpenDDS/DCPS/EntityId_t;");
    jobject obj = createNewObject ? 0 : jni->GetObjectField (target, fid);
    copyToJava (jni, obj, source.entityId, createNewObject);
    jni->SetObjectField (target, fid, obj);
    jni->DeleteLocalRef (obj);
  }
}


/* End STRUCT: GUID_t */


/* Begin TYPEDEF: GUIDSeq */

void copyToCxx (JNIEnv *jni, OpenDDS::DCPS::GUIDSeq &target, jobjectArray source)
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

void copyToJava (JNIEnv *jni, jobjectArray &target, const OpenDDS::DCPS::GUIDSeq &source, bool createNewObject)
{
  jsize len = source.length ();
  jobjectArray arr;
  if (!createNewObject && jni->GetArrayLength (target) != len) createNewObject = true;
  if (createNewObject)
    {
      jclass clazz = findClass (jni, "OpenDDS/DCPS/GUID_t");
      arr = jni->NewObjectArray (len, clazz, 0);
    }
  else
    {
      arr = target;
    }
  for (CORBA::ULong i = 0; i < static_cast<CORBA::ULong> (len); ++i)
    {
      jobject obj = createNewObject ? 0 : jni->GetObjectArrayElement (arr, i);
      OpenDDS::DCPS::GUID_t var = source[i];
      copyToJava (jni, obj, var, createNewObject);
      jni->SetObjectArrayElement (arr, i, obj);
      jni->DeleteLocalRef (obj);
    }
  target = arr;
}


/* End TYPEDEF: GUIDSeq */

/* End MODULE: DCPS */

/* End MODULE: OpenDDS */
