package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/NiveauHorsBornesExceptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Infraction.idl
* Wednesday, October 12, 2016 5:43:44 PM PDT
*/

abstract public class NiveauHorsBornesExceptionHelper
{
  private static String  _id = "IDL:ca/etsmtl/log720/lab1/NiveauHorsBornesException:1.0";

  public static void insert (org.omg.CORBA.Any a, ca.etsmtl.log720.lab1.NiveauHorsBornesException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ca.etsmtl.log720.lab1.NiveauHorsBornesException extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.id (), "NiveauHorsBornesException", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ca.etsmtl.log720.lab1.NiveauHorsBornesException read (org.omg.CORBA.portable.InputStream istream)
  {
    ca.etsmtl.log720.lab1.NiveauHorsBornesException value = new ca.etsmtl.log720.lab1.NiveauHorsBornesException ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ca.etsmtl.log720.lab1.NiveauHorsBornesException value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
