package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/ReactionPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reaction.idl
* samedi 1 octobre 2016 15 h 57 EDT
*/

public abstract class ReactionPOA extends org.omg.PortableServer.Servant
 implements ca.etsmtl.log720.lab1.ReactionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_id", new java.lang.Integer (0));
    _methods.put ("_get_description", new java.lang.Integer (1));
    _methods.put ("_get_niveau", new java.lang.Integer (2));
    _methods.put ("toString", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ca/etsmtl/log720/lab1/Reaction/_get_id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // ca/etsmtl/log720/lab1/Reaction/_get_description
       {
         String $result = null;
         $result = this.description ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // ca/etsmtl/log720/lab1/Reaction/_get_niveau
       {
         int $result = (int)0;
         $result = this.niveau ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // ca/etsmtl/log720/lab1/Reaction/_toString
       {
         String $result = null;
         $result = this._toString ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ca/etsmtl/log720/lab1/Reaction:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Reaction _this() 
  {
    return ReactionHelper.narrow(
    super._this_object());
  }

  public Reaction _this(org.omg.CORBA.ORB orb) 
  {
    return ReactionHelper.narrow(
    super._this_object(orb));
  }


} // class ReactionPOA
