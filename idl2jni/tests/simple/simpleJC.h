/* -*- C++ -*- */
#ifndef IDL2JNI_GENERATED_SIMPLEJC_H
#define IDL2JNI_GENERATED_SIMPLEJC_H
#include "simpleC.h"
#include "idl2jni_BaseJavaPeer.h"
#include "idl2jni_jni.h"
#include "idl2jni_runtime.h"
/* Generated by ../../../../bin/idl2jni running on input file simple.idl */


/* Begin MODULE: simple */



/* Begin TYPEDEF: TestTypedef */


/* End TYPEDEF: TestTypedef */


/* Begin TYPEDEF: StringTypedef */


/* End TYPEDEF: StringTypedef */


/* Begin TYPEDEF: TestSeqTypedef */

void copyToCxx (JNIEnv *jni, simple::TestSeqTypedef &target, jintArray source);
void copyToJava (JNIEnv *jni, jintArray &target, const simple::TestSeqTypedef &source, bool createNewObject = false);

/* End TYPEDEF: TestSeqTypedef */


/* Begin TYPEDEF: SeqOfTypedefedLong */

void copyToCxx (JNIEnv *jni, simple::SeqOfTypedefedLong &target, jintArray source);
void copyToJava (JNIEnv *jni, jintArray &target, const simple::SeqOfTypedefedLong &source, bool createNewObject = false);

/* End TYPEDEF: SeqOfTypedefedLong */


/* Begin TYPEDEF: StringSeq */

void copyToCxx (JNIEnv *jni, simple::StringSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::StringSeq &source, bool createNewObject = false);

/* End TYPEDEF: StringSeq */


/* Begin CONST: ArrayBounds */


/* End CONST: ArrayBounds */


/* Begin TYPEDEF: TestArrayTypedef */

void copyToCxx (JNIEnv *jni, simple::TestArrayTypedef &target, jintArray source);
void copyToJava (JNIEnv *jni, jintArray &target, const simple::TestArrayTypedef &source, bool createNewObject = false);
void copyToCxx (JNIEnv *jni, simple::TestArrayTypedef_var &target, jintArray source);
void copyToJava (JNIEnv *jni, jintArray &target, const simple::TestArrayTypedef_var &source, bool createNewObject = false);

/* End TYPEDEF: TestArrayTypedef */


/* Begin TYPEDEF: TestArrayTypedef2 */


/* End TYPEDEF: TestArrayTypedef2 */


/* Begin TYPEDEF: TestStringArray */

void copyToCxx (JNIEnv *jni, simple::TestStringArray &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestStringArray &source, bool createNewObject = false);
void copyToCxx (JNIEnv *jni, simple::TestStringArray_var &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestStringArray_var &source, bool createNewObject = false);

/* End TYPEDEF: TestStringArray */


/* Begin TYPEDEF: StringSeqSeq */

void copyToCxx (JNIEnv *jni, simple::StringSeqSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::StringSeqSeq &source, bool createNewObject = false);

/* End TYPEDEF: StringSeqSeq */


/* Begin TYPEDEF: StringSeqSeqSeq */

void copyToCxx (JNIEnv *jni, simple::StringSeqSeqSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::StringSeqSeqSeq &source, bool createNewObject = false);

/* End TYPEDEF: StringSeqSeqSeq */


/* Begin TYPEDEF: LongSeqSeq */

void copyToCxx (JNIEnv *jni, simple::LongSeqSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::LongSeqSeq &source, bool createNewObject = false);

/* End TYPEDEF: LongSeqSeq */


/* Begin TYPEDEF: LongSeqSeqSeq */

void copyToCxx (JNIEnv *jni, simple::LongSeqSeqSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::LongSeqSeqSeq &source, bool createNewObject = false);

/* End TYPEDEF: LongSeqSeqSeq */


/* Begin STRUCT: TestStruct */

void copyToCxx (JNIEnv *jni, simple::TestStruct &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestStruct &source, bool createNewObject = false);

/* End STRUCT: TestStruct */


/* Begin TYPEDEF: TestStructSequence */

void copyToCxx (JNIEnv *jni, simple::TestStructSequence &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestStructSequence &source, bool createNewObject = false);

/* End TYPEDEF: TestStructSequence */


/* Begin TYPEDEF: TestStructArray */

void copyToCxx (JNIEnv *jni, simple::TestStructArray &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestStructArray &source, bool createNewObject = false);
void copyToCxx (JNIEnv *jni, simple::TestStructArray_var &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestStructArray_var &source, bool createNewObject = false);

/* End TYPEDEF: TestStructArray */


/* Begin STRUCT: TestNestedStruct */

void copyToCxx (JNIEnv *jni, simple::TestNestedStruct &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestNestedStruct &source, bool createNewObject = false);

/* End STRUCT: TestNestedStruct */


/* Begin CONST: TestConstLong */


/* End CONST: TestConstLong */


/* Begin CONST: TIMESTAMP_INVALID_NSEC */


/* End CONST: TIMESTAMP_INVALID_NSEC */


/* Begin CONST: TestConstFloat */


/* End CONST: TestConstFloat */


/* Begin CONST: TestConstDouble */


/* End CONST: TestConstDouble */


/* Begin CONST: TestConstBool */


/* End CONST: TestConstBool */


/* Begin CONST: TestConstString */


/* End CONST: TestConstString */


/* Begin CONST: TestConstTypedef */


/* End CONST: TestConstTypedef */


/* Begin CONST: TestConstChar */


/* End CONST: TestConstChar */


/* Begin CONST: TestConstWchar */


/* End CONST: TestConstWchar */


/* Begin ENUM: TestEnum */

void copyToCxx (JNIEnv *jni, simple::TestEnum &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestEnum &source, bool createNewObject = false);

/* End ENUM: TestEnum */


/* Begin UNION: TestUnion1 */

void copyToCxx (JNIEnv *jni, simple::TestUnion1 &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestUnion1 &source, bool createNewObject = false);

/* End UNION: TestUnion1 */


/* Begin UNION: TestUnion2 */

void copyToCxx (JNIEnv *jni, simple::TestUnion2 &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestUnion2 &source, bool createNewObject = false);

/* End UNION: TestUnion2 */


/* Begin UNION: TestUnion4 */

void copyToCxx (JNIEnv *jni, simple::TestUnion4 &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestUnion4 &source, bool createNewObject = false);

/* End UNION: TestUnion4 */


/* Begin TYPEDEF: EnumSeq */

void copyToCxx (JNIEnv *jni, simple::EnumSeq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::EnumSeq &source, bool createNewObject = false);

/* End TYPEDEF: EnumSeq */


/* Begin TYPEDEF: EnumArray */

void copyToCxx (JNIEnv *jni, simple::EnumArray &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::EnumArray &source, bool createNewObject = false);
void copyToCxx (JNIEnv *jni, simple::EnumArray_var &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::EnumArray_var &source, bool createNewObject = false);

/* End TYPEDEF: EnumArray */


/* Begin STRUCT: TestStructWithEnum */

void copyToCxx (JNIEnv *jni, simple::TestStructWithEnum &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestStructWithEnum &source, bool createNewObject = false);

/* End STRUCT: TestStructWithEnum */


/* Begin INTERFACE: TestInterf */

void copyToCxx (JNIEnv *jni, simple::TestInterf_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestInterf_var &source, bool createNewObject = false);

/* End INTERFACE: TestInterf */


/* Begin TYPEDEF: TestUnion2Seq */

void copyToCxx (JNIEnv *jni, simple::TestUnion2Seq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::TestUnion2Seq &source, bool createNewObject = false);

/* End TYPEDEF: TestUnion2Seq */


/* Begin UNION: TestUnion3 */

void copyToCxx (JNIEnv *jni, simple::TestUnion3 &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestUnion3 &source, bool createNewObject = false);

/* End UNION: TestUnion3 */


/* Begin INTERFACE: TestInterf2 */

void copyToCxx (JNIEnv *jni, simple::TestInterf2_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestInterf2_var &source, bool createNewObject = false);

/* End INTERFACE: TestInterf2 */


/* Begin INTERFACE: TestInterf3 */

void copyToCxx (JNIEnv *jni, simple::TestInterf3_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestInterf3_var &source, bool createNewObject = false);

/* End INTERFACE: TestInterf3 */


/* Begin INTERFACE: TestLI */

void copyToCxx (JNIEnv *jni, simple::TestLI_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::TestLI_var &source, bool createNewObject = false);

class simple_TestLIJavaPeer
  : public virtual IDL2JNI_BaseJavaPeer
  , public virtual simple::TestLI
{
public:
  simple_TestLIJavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
  {}

  CORBA::Long attr1 ();

  void attr1 (CORBA::Long attr1_);

  CORBA::Double attr2 ();

  void attr2 (CORBA::Double attr2_);

  CORBA::Boolean localOp (simple::EnumSeq& p1, simple::TestStructSequence_out p2);

  CORBA::Boolean localOp2 (simple::TestStructSequence& s1);

  simple::EnumSeq* returnASequence (CORBA::Short& p1, simple::TestStruct& p2);

  void primitive (CORBA::Boolean& p1, CORBA::Char& p2, CORBA::Octet& p3, CORBA::Short& p4, CORBA::ULong& p5, CORBA::LongLong& p6, CORBA::Float& p7, CORBA::Double& p8);

};


/* End INTERFACE: TestLI */


/* Begin INTERFACE: Local2 */

void copyToCxx (JNIEnv *jni, simple::Local2_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::Local2_var &source, bool createNewObject = false);

class simple_Local2JavaPeer
  : public virtual simple_TestLIJavaPeer
  , public virtual simple::Local2
{
public:
  simple_Local2JavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , simple_TestLIJavaPeer (jni, java)
  {}

  simple::TestLI_ptr op (simple::TestLI_ptr p1, simple::TestLI_ptr& p2, simple::TestLI_out p3);

};


/* End INTERFACE: Local2 */


/* Begin TYPEDEF: Local2Seq */

void copyToCxx (JNIEnv *jni, simple::Local2Seq &target, jobjectArray source);
void copyToJava (JNIEnv *jni, jobjectArray &target, const simple::Local2Seq &source, bool createNewObject = false);

/* End TYPEDEF: Local2Seq */


/* Begin STRUCT: StructWithObjref */

void copyToCxx (JNIEnv *jni, simple::StructWithObjref &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::StructWithObjref &source, bool createNewObject = false);

/* End STRUCT: StructWithObjref */


/* Begin INTERFACE: Local3 */

void copyToCxx (JNIEnv *jni, simple::Local3_var &target, jobject source);
void copyToJava (JNIEnv *jni, jobject &target, const simple::Local3_var &source, bool createNewObject = false);

class simple_Local3JavaPeer
  : public virtual simple_Local2JavaPeer
  , public virtual simple::Local3
{
public:
  simple_Local3JavaPeer (JNIEnv *jni, jobject java)
    : IDL2JNI_BaseJavaPeer (jni, java)
    , simple_TestLIJavaPeer (jni, java)
    , simple_Local2JavaPeer (jni, java)
  {}

  simple::StructWithObjref* op3 (const simple::StructWithObjref& p1, simple::StructWithObjref& p2, simple::StructWithObjref_out p3);

};


/* End INTERFACE: Local3 */

/* End MODULE: simple */
#endif /* IDL2JNI_GENERATED_SIMPLEJC_H */
