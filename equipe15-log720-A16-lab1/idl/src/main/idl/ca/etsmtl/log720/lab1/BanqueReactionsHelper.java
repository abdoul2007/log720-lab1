package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/BanqueReactionsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reaction.idl
* samedi 1 octobre 2016 17 h 18 EDT
*/

abstract public class BanqueReactionsHelper
{
  private static String  _id = "IDL:ca/etsmtl/log720/lab1/BanqueReactions:1.0";

  public static void insert (org.omg.CORBA.Any a, ca.etsmtl.log720.lab1.BanqueReactions that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ca.etsmtl.log720.lab1.BanqueReactions extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ca.etsmtl.log720.lab1.BanqueReactionsHelper.id (), "BanqueReactions");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ca.etsmtl.log720.lab1.BanqueReactions read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BanqueReactionsStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ca.etsmtl.log720.lab1.BanqueReactions value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ca.etsmtl.log720.lab1.BanqueReactions narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ca.etsmtl.log720.lab1.BanqueReactions)
      return (ca.etsmtl.log720.lab1.BanqueReactions)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ca.etsmtl.log720.lab1._BanqueReactionsStub stub = new ca.etsmtl.log720.lab1._BanqueReactionsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ca.etsmtl.log720.lab1.BanqueReactions unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ca.etsmtl.log720.lab1.BanqueReactions)
      return (ca.etsmtl.log720.lab1.BanqueReactions)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ca.etsmtl.log720.lab1._BanqueReactionsStub stub = new ca.etsmtl.log720.lab1._BanqueReactionsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
