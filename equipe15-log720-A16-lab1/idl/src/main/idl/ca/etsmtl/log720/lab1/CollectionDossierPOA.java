package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/CollectionDossierPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dossier.idl
* Wednesday, October 12, 2016 5:43:37 PM PDT
*/

public abstract class CollectionDossierPOA extends org.omg.PortableServer.Servant
 implements ca.etsmtl.log720.lab1.CollectionDossierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getDossier", new java.lang.Integer (0));
    _methods.put ("_get_size", new java.lang.Integer (1));
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
       case 0:  // ca/etsmtl/log720/lab1/CollectionDossier/getDossier
       {
         int index = in.read_long ();
         ca.etsmtl.log720.lab1.Dossier $result = null;
         $result = this.getDossier (index);
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.DossierHelper.write (out, $result);
         break;
       }

       case 1:  // ca/etsmtl/log720/lab1/CollectionDossier/_get_size
       {
         int $result = (int)0;
         $result = this.size ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ca/etsmtl/log720/lab1/CollectionDossier:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CollectionDossier _this() 
  {
    return CollectionDossierHelper.narrow(
    super._this_object());
  }

  public CollectionDossier _this(org.omg.CORBA.ORB orb) 
  {
    return CollectionDossierHelper.narrow(
    super._this_object(orb));
  }


} // class CollectionDossierPOA
