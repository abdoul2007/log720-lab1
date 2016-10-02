package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/BanqueDossiersPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dossier.idl
* samedi 1 octobre 2016 15 h 54 EDT
*/

public abstract class BanqueDossiersPOA extends org.omg.PortableServer.Servant
 implements ca.etsmtl.log720.lab1.BanqueDossiersOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_dossiers", new java.lang.Integer (0));
    _methods.put ("trouverDossiersParPlaque", new java.lang.Integer (1));
    _methods.put ("trouverDossiersParNom", new java.lang.Integer (2));
    _methods.put ("trouverDossierParPermis", new java.lang.Integer (3));
    _methods.put ("trouverDossierParId", new java.lang.Integer (4));
    _methods.put ("ajouterDossier", new java.lang.Integer (5));
    _methods.put ("ajouterInfractionAuDossier", new java.lang.Integer (6));
    _methods.put ("ajouterReactionAuDossier", new java.lang.Integer (7));
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
       case 0:  // ca/etsmtl/log720/lab1/BanqueDossiers/_get_dossiers
       {
         ca.etsmtl.log720.lab1.CollectionDossier $result = null;
         $result = this.dossiers ();
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.CollectionDossierHelper.write (out, $result);
         break;
       }

       case 1:  // ca/etsmtl/log720/lab1/BanqueDossiers/trouverDossiersParPlaque
       {
         String plaque = in.read_string ();
         ca.etsmtl.log720.lab1.CollectionDossier $result = null;
         $result = this.trouverDossiersParPlaque (plaque);
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.CollectionDossierHelper.write (out, $result);
         break;
       }

       case 2:  // ca/etsmtl/log720/lab1/BanqueDossiers/trouverDossiersParNom
       {
         String nom = in.read_string ();
         String prenom = in.read_string ();
         ca.etsmtl.log720.lab1.CollectionDossier $result = null;
         $result = this.trouverDossiersParNom (nom, prenom);
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.CollectionDossierHelper.write (out, $result);
         break;
       }

       case 3:  // ca/etsmtl/log720/lab1/BanqueDossiers/trouverDossierParPermis
       {
         String noPermis = in.read_string ();
         ca.etsmtl.log720.lab1.Dossier $result = null;
         $result = this.trouverDossierParPermis (noPermis);
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.DossierHelper.write (out, $result);
         break;
       }

       case 4:  // ca/etsmtl/log720/lab1/BanqueDossiers/trouverDossierParId
       {
         int idDossier = in.read_long ();
         ca.etsmtl.log720.lab1.Dossier $result = null;
         $result = this.trouverDossierParId (idDossier);
         out = $rh.createReply();
         ca.etsmtl.log720.lab1.DossierHelper.write (out, $result);
         break;
       }

       case 5:  // ca/etsmtl/log720/lab1/BanqueDossiers/ajouterDossier
       {
         try {
           String nom = in.read_string ();
           String prenom = in.read_string ();
           String noPermis = in.read_string ();
           String noPlaque = in.read_string ();
           this.ajouterDossier (nom, prenom, noPermis, noPlaque);
           out = $rh.createReply();
         } catch (ca.etsmtl.log720.lab1.NoPermisExisteDejaException $ex) {
           out = $rh.createExceptionReply ();
           ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // ca/etsmtl/log720/lab1/BanqueDossiers/ajouterInfractionAuDossier
       {
         try {
           int idDossier = in.read_long ();
           int idInfraction = in.read_long ();
           this.ajouterInfractionAuDossier (idDossier, idInfraction);
           out = $rh.createReply();
         } catch (ca.etsmtl.log720.lab1.InvalidIdException $ex) {
           out = $rh.createExceptionReply ();
           ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 7:  // ca/etsmtl/log720/lab1/BanqueDossiers/ajouterReactionAuDossier
       {
         try {
           int idDossier = in.read_long ();
           int idReaction = in.read_long ();
           this.ajouterReactionAuDossier (idDossier, idReaction);
           out = $rh.createReply();
         } catch (ca.etsmtl.log720.lab1.InvalidIdException $ex) {
           out = $rh.createExceptionReply ();
           ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BanqueDossiers _this() 
  {
    return BanqueDossiersHelper.narrow(
    super._this_object());
  }

  public BanqueDossiers _this(org.omg.CORBA.ORB orb) 
  {
    return BanqueDossiersHelper.narrow(
    super._this_object(orb));
  }


} // class BanqueDossiersPOA