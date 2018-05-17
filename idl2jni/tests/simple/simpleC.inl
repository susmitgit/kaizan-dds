// -*- C++ -*-
// $Id$

/**
 * Code generated by the The ACE ORB (TAO) IDL Compiler v2.2a_p9
 * TAO and the TAO IDL Compiler have been developed by:
 *       Center for Distributed Object Computing
 *       Washington University
 *       St. Louis, MO
 *       USA
 *       http://www.cs.wustl.edu/~schmidt/doc-center.html
 * and
 *       Distributed Object Computing Laboratory
 *       University of California at Irvine
 *       Irvine, CA
 *       USA
 * and
 *       Institute for Software Integrated Systems
 *       Vanderbilt University
 *       Nashville, TN
 *       USA
 *       http://www.isis.vanderbilt.edu/
 *
 * Information about TAO is available at:
 *     http://www.cs.wustl.edu/~schmidt/TAO.html
 **/


// TAO_IDL - Generated from
// be/be_visitor_array/array_ci.cpp:150

ACE_INLINE
void
TAO::Array_Traits<simple::TestArrayTypedef_forany>::free (
    simple::TestArrayTypedef_slice * _tao_slice
  )
{
  simple::TestArrayTypedef_free (_tao_slice);
}

ACE_INLINE
simple::TestArrayTypedef_slice *
TAO::Array_Traits<simple::TestArrayTypedef_forany>::dup (
    const simple::TestArrayTypedef_slice * _tao_slice
  )
{
  return simple::TestArrayTypedef_dup (_tao_slice);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestArrayTypedef_forany>::copy (
    simple::TestArrayTypedef_slice * _tao_to,
    const simple::TestArrayTypedef_slice * _tao_from
  )
{
  simple::TestArrayTypedef_copy (_tao_to, _tao_from);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestArrayTypedef_forany>::zero (
    simple::TestArrayTypedef_slice * _tao_slice
  )
{
  // Zero each individual element.
  for ( ::CORBA::ULong i0 = 0; i0 < 4; ++i0)
    {
      _tao_slice[i0] = ::CORBA::Long ();
    }
}

ACE_INLINE
simple::TestArrayTypedef_slice *
TAO::Array_Traits<simple::TestArrayTypedef_forany>::alloc (void)
{
  return simple::TestArrayTypedef_alloc ();
}

ACE_INLINE
simple::TestArrayTypedef2_slice *
simple::TestArrayTypedef2_alloc (void)
{
  return simple::TestArrayTypedef_alloc ();
}

ACE_INLINE
simple::TestArrayTypedef2_slice *
simple::TestArrayTypedef2_dup (
    const simple::TestArrayTypedef2_slice *_tao_src
  )
{
  return simple::TestArrayTypedef_dup (_tao_src);
}

ACE_INLINE
void
simple::TestArrayTypedef2_copy (
    simple::TestArrayTypedef2_slice *_tao_dest,
    const simple::TestArrayTypedef2_slice *_tao_src
  )
{
  simple::TestArrayTypedef_copy (_tao_dest, _tao_src);
}

ACE_INLINE
void
simple::TestArrayTypedef2_free (
    simple::TestArrayTypedef2_slice *_tao_src
  )
{
  simple::TestArrayTypedef_free (_tao_src);
}



// TAO_IDL - Generated from
// be/be_visitor_array/array_ci.cpp:150

ACE_INLINE
void
TAO::Array_Traits<simple::TestStringArray_forany>::free (
    simple::TestStringArray_slice * _tao_slice
  )
{
  simple::TestStringArray_free (_tao_slice);
}

ACE_INLINE
simple::TestStringArray_slice *
TAO::Array_Traits<simple::TestStringArray_forany>::dup (
    const simple::TestStringArray_slice * _tao_slice
  )
{
  return simple::TestStringArray_dup (_tao_slice);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestStringArray_forany>::copy (
    simple::TestStringArray_slice * _tao_to,
    const simple::TestStringArray_slice * _tao_from
  )
{
  simple::TestStringArray_copy (_tao_to, _tao_from);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestStringArray_forany>::zero (
    simple::TestStringArray_slice * _tao_slice
  )
{
  // Zero each individual element.
  for ( ::CORBA::ULong i0 = 0; i0 < 4; ++i0)
    {
      _tao_slice[i0] = ::TAO::String_Manager ();
    }
}

ACE_INLINE
simple::TestStringArray_slice *
TAO::Array_Traits<simple::TestStringArray_forany>::alloc (void)
{
  return simple::TestStringArray_alloc ();
}


// TAO_IDL - Generated from
// be/be_visitor_array/array_ci.cpp:150

ACE_INLINE
void
TAO::Array_Traits<simple::TestStructArray_forany>::free (
    simple::TestStructArray_slice * _tao_slice
  )
{
  simple::TestStructArray_free (_tao_slice);
}

ACE_INLINE
simple::TestStructArray_slice *
TAO::Array_Traits<simple::TestStructArray_forany>::dup (
    const simple::TestStructArray_slice * _tao_slice
  )
{
  return simple::TestStructArray_dup (_tao_slice);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestStructArray_forany>::copy (
    simple::TestStructArray_slice * _tao_to,
    const simple::TestStructArray_slice * _tao_from
  )
{
  simple::TestStructArray_copy (_tao_to, _tao_from);
}

ACE_INLINE
void
TAO::Array_Traits<simple::TestStructArray_forany>::zero (
    simple::TestStructArray_slice * _tao_slice
  )
{
  // Zero each individual element.
  for ( ::CORBA::ULong i0 = 0; i0 < 4; ++i0)
    {
      _tao_slice[i0] = simple::TestStruct ();
    }
}

ACE_INLINE
simple::TestStructArray_slice *
TAO::Array_Traits<simple::TestStructArray_forany>::alloc (void)
{
  return simple::TestStructArray_alloc ();
}


// TAO_IDL - Generated from
// be/be_visitor_union/union_ci.cpp:39

// *************************************************************
// Inline operations for union simple::TestUnion1
// *************************************************************

// TAO_IDL - Generated from
// be/be_visitor_union/discriminant_ci.cpp:58

ACE_INLINE
void
simple::TestUnion1::_default ()
{
  this->_reset ();
  this->disc_ = static_cast <simple::TestEnum> (-1);
}

// Accessor to set the discriminant.
ACE_INLINE
void
simple::TestUnion1::_d (simple::TestEnum discval)
{
  this->disc_ = discval;
}

// Accessor to get the discriminant.
ACE_INLINE
simple::TestEnum
simple::TestUnion1::_d (void) const
{
  return this->disc_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion1::o (CORBA::Octet val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::a;
  // Set the value.
  this->u_.o_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Octet
simple::TestUnion1::o (void) const
{
  return this->u_.o_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion1::s (CORBA::Short val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::b;
  // Set the value.
  this->u_.s_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Short
simple::TestUnion1::s (void) const
{
  return this->u_.s_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion1::l (CORBA::Long val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::c;
  // Set the value.
  this->u_.l_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Long
simple::TestUnion1::l (void) const
{
  return this->u_.l_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion1::n (CORBA::Boolean val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::d;
  // Set the value.
  this->u_.n_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Boolean
simple::TestUnion1::n (void) const
{
  return this->u_.n_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion1::u (CORBA::Double val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::e;
  // Set the value.
  this->u_.u_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Double
simple::TestUnion1::u (void) const
{
  return this->u_.u_;
}

// TAO_IDL - Generated from
// be/be_visitor_union/union_ci.cpp:39

// *************************************************************
// Inline operations for union simple::TestUnion2
// *************************************************************

// TAO_IDL - Generated from
// be/be_visitor_union/discriminant_ci.cpp:148



// Accessor to set the discriminant.
ACE_INLINE
void
simple::TestUnion2::_d ( ::CORBA::Short discval)
{
  this->disc_ = discval;
}

// Accessor to get the discriminant.
ACE_INLINE
::CORBA::Short
simple::TestUnion2::_d (void) const
{
  return this->disc_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:865

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::s (char *val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 0;
  this->u_.s_ = val;
}

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::s (const char *val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 0;
  // Set the value.
  this->u_.s_ = ::CORBA::string_dup (val);
}

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::s (const ::CORBA::String_var &val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 0;
  // Set the value.
  ::CORBA::String_var s_var = val;
  this->u_.s_ = s_var._retn ();
}

ACE_INLINE
const char *
simple::TestUnion2::s (void) const // get method
{
  return this->u_.s_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:1068

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::t (const simple::TestStruct &val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 1;
  ACE_NEW (
      this->u_.t_,
      simple::TestStruct (val)
    );
}

// Readonly get method.
ACE_INLINE
const simple::TestStruct &
simple::TestUnion2::t (void) const
{
  return *this->u_.t_;
}

// Read/write get method.
ACE_INLINE
simple::TestStruct &
simple::TestUnion2::t (void)
{
  return *this->u_.t_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:791

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::q (const simple::TestSeqTypedef &val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 2;
  ACE_NEW (
      this->u_.q_,
      simple::TestSeqTypedef (val)
    );
}

/// Readonly get method.
ACE_INLINE
const simple::TestSeqTypedef &
simple::TestUnion2::q (void) const
{
  return *this->u_.q_;
}

/// Read/write get method.
ACE_INLINE
simple::TestSeqTypedef &
simple::TestUnion2::q (void)
{
  return *this->u_.q_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:865

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::d (char *val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 4;
  this->u_.d_ = val;
}

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::d (const char *val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 4;
  // Set the value.
  this->u_.d_ = ::CORBA::string_dup (val);
}

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::d (const ::CORBA::String_var &val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = 4;
  // Set the value.
  ::CORBA::String_var d_var = val;
  this->u_.d_ = d_var._retn ();
}

ACE_INLINE
const char *
simple::TestUnion2::d (void) const // get method
{
  return this->u_.d_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:232

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion2::e (simple::TestEnum val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = -32768;
  // Set the value.
  this->u_.e_ = val;
}

/// Retrieve the member.
ACE_INLINE
simple::TestEnum
simple::TestUnion2::e (void) const
{
  return this->u_.e_;
}

// TAO_IDL - Generated from
// be/be_visitor_union/union_ci.cpp:39

// *************************************************************
// Inline operations for union simple::TestUnion4
// *************************************************************

// TAO_IDL - Generated from
// be/be_visitor_union/discriminant_ci.cpp:148

ACE_INLINE
void
simple::TestUnion4::_default ()
{
  this->_reset ();
  this->disc_ = false;
}

// Accessor to set the discriminant.
ACE_INLINE
void
simple::TestUnion4::_d ( ::CORBA::Boolean discval)
{
  this->disc_ = discval;
}

// Accessor to get the discriminant.
ACE_INLINE
::CORBA::Boolean
simple::TestUnion4::_d (void) const
{
  return this->disc_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion4::c (CORBA::Char val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = true;
  // Set the value.
  this->u_.c_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Char
simple::TestUnion4::c (void) const
{
  return this->u_.c_;
}

// TAO_IDL - Generated from
// be/be_visitor_array/array_ci.cpp:150

ACE_INLINE
void
TAO::Array_Traits<simple::EnumArray_forany>::free (
    simple::EnumArray_slice * _tao_slice
  )
{
  simple::EnumArray_free (_tao_slice);
}

ACE_INLINE
simple::EnumArray_slice *
TAO::Array_Traits<simple::EnumArray_forany>::dup (
    const simple::EnumArray_slice * _tao_slice
  )
{
  return simple::EnumArray_dup (_tao_slice);
}

ACE_INLINE
void
TAO::Array_Traits<simple::EnumArray_forany>::copy (
    simple::EnumArray_slice * _tao_to,
    const simple::EnumArray_slice * _tao_from
  )
{
  simple::EnumArray_copy (_tao_to, _tao_from);
}

ACE_INLINE
void
TAO::Array_Traits<simple::EnumArray_forany>::zero (
    simple::EnumArray_slice * _tao_slice
  )
{
  // Zero each individual element.
  for ( ::CORBA::ULong i0 = 0; i0 < 4; ++i0)
    {
      _tao_slice[i0] = simple::TestEnum ();
    }
}

ACE_INLINE
simple::EnumArray_slice *
TAO::Array_Traits<simple::EnumArray_forany>::alloc (void)
{
  return simple::EnumArray_alloc ();
}


// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ci.cpp:62

ACE_INLINE
simple::TestInterf::TestInterf (
    TAO_Stub *objref,
    ::CORBA::Boolean _tao_collocated,
    TAO_Abstract_ServantBase *servant,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (objref, _tao_collocated, servant, oc)
{
}

ACE_INLINE
simple::TestInterf::TestInterf (
    ::IOP::IOR *ior,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (ior, oc)
{
}

// TAO_IDL - Generated from
// be/be_visitor_union/union_ci.cpp:39

// *************************************************************
// Inline operations for union simple::TestUnion3
// *************************************************************

// TAO_IDL - Generated from
// be/be_visitor_union/discriminant_ci.cpp:58

// Accessor to set the discriminant.
ACE_INLINE
void
simple::TestUnion3::_d (simple::TestEnum discval)
{
  this->disc_ = discval;
}

// Accessor to get the discriminant.
ACE_INLINE
simple::TestEnum
simple::TestUnion3::_d (void) const
{
  return this->disc_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:160

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion3::sa (simple::TestStructArray val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::a;
  // Set the value.
  this->u_.sa_ = simple::TestStructArray_dup (val);
}

/// Retrieve the member.
ACE_INLINE
simple::TestStructArray_slice *
simple::TestUnion3::sa (void) const
{
  return this->u_.sa_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:303

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion3::obj (simple::TestInterf_ptr val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::b;
  typedef simple::TestInterf_var OBJECT_FIELD;
  ACE_NEW (
      this->u_.obj_,
      OBJECT_FIELD (
          simple::TestInterf::_duplicate (val)
        )
    );
}

/// Retrieve the member.
ACE_INLINE
simple::TestInterf_ptr
simple::TestUnion3::obj (void) const
{
  return this->u_.obj_->in ();
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:791

/// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion3::us (const simple::TestUnion2Seq &val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::c;
  ACE_NEW (
      this->u_.us_,
      simple::TestUnion2Seq (val)
    );
}

/// Readonly get method.
ACE_INLINE
const simple::TestUnion2Seq &
simple::TestUnion3::us (void) const
{
  return *this->u_.us_;
}

/// Read/write get method.
ACE_INLINE
simple::TestUnion2Seq &
simple::TestUnion3::us (void)
{
  return *this->u_.us_;
}

// TAO_IDL - Generated from
// be/be_visitor_union_branch/public_ci.cpp:580

// Accessor to set the member.
ACE_INLINE
void
simple::TestUnion3::fp (CORBA::Double val)
{
  // Set the discriminant value.
  this->_reset ();
  this->disc_ = simple::d;
  // Set the value.
  this->u_.fp_ = val;
}

/// Retrieve the member.
ACE_INLINE
::CORBA::Double
simple::TestUnion3::fp (void) const
{
  return this->u_.fp_;
}

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ci.cpp:62

ACE_INLINE
simple::TestInterf2::TestInterf2 (
    TAO_Stub *objref,
    ::CORBA::Boolean _tao_collocated,
    TAO_Abstract_ServantBase *servant,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (objref, _tao_collocated, servant, oc)
{
}

ACE_INLINE
simple::TestInterf2::TestInterf2 (
    ::IOP::IOR *ior,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (ior, oc)
{
}

// TAO_IDL - Generated from
// be/be_visitor_interface/interface_ci.cpp:62

ACE_INLINE
simple::TestInterf3::TestInterf3 (
    TAO_Stub *objref,
    ::CORBA::Boolean _tao_collocated,
    TAO_Abstract_ServantBase *servant,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (objref, _tao_collocated, servant, oc)
{
}

ACE_INLINE
simple::TestInterf3::TestInterf3 (
    ::IOP::IOR *ior,
    TAO_ORB_Core *oc)
  : ::CORBA::Object (ior, oc)
{
}
