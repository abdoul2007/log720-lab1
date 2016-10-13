package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/_BanqueDossiersStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dossier.idl
* Wednesday, October 12, 2016 5:43:37 PM PDT
*/

public class _BanqueDossiersStub extends org.omg.CORBA.portable.ObjectImpl implements ca.etsmtl.log720.lab1.BanqueDossiers
{

  public ca.etsmtl.log720.lab1.CollectionDossier dossiers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_dossiers", true);
                $in = _invoke ($out);
                ca.etsmtl.log720.lab1.CollectionDossier $result = ca.etsmtl.log720.lab1.CollectionDossierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return dossiers (        );
            } finally {
                _releaseReply ($in);
            }
  } // dossiers

  public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParPlaque (String plaque)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("trouverDossiersParPlaque", true);
                $out.write_string (plaque);
                $in = _invoke ($out);
                ca.etsmtl.log720.lab1.CollectionDossier $result = ca.etsmtl.log720.lab1.CollectionDossierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return trouverDossiersParPlaque (plaque        );
            } finally {
                _releaseReply ($in);
            }
  } // trouverDossiersParPlaque

  public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParNom (String nom, String prenom)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("trouverDossiersParNom", true);
                $out.write_string (nom);
                $out.write_string (prenom);
                $in = _invoke ($out);
                ca.etsmtl.log720.lab1.CollectionDossier $result = ca.etsmtl.log720.lab1.CollectionDossierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return trouverDossiersParNom (nom, prenom        );
            } finally {
                _releaseReply ($in);
            }
  } // trouverDossiersParNom

  public ca.etsmtl.log720.lab1.Dossier trouverDossierParPermis (String noPermis)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("trouverDossierParPermis", true);
                $out.write_string (noPermis);
                $in = _invoke ($out);
                ca.etsmtl.log720.lab1.Dossier $result = ca.etsmtl.log720.lab1.DossierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return trouverDossierParPermis (noPermis        );
            } finally {
                _releaseReply ($in);
            }
  } // trouverDossierParPermis

  public ca.etsmtl.log720.lab1.Dossier trouverDossierParId (int idDossier)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("trouverDossierParId", true);
                $out.write_long (idDossier);
                $in = _invoke ($out);
                ca.etsmtl.log720.lab1.Dossier $result = ca.etsmtl.log720.lab1.DossierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return trouverDossierParId (idDossier        );
            } finally {
                _releaseReply ($in);
            }
  } // trouverDossierParId

  public void ajouterDossier (String nom, String prenom, String noPermis, String noPlaque) throws ca.etsmtl.log720.lab1.NoPermisExisteDejaException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ajouterDossier", true);
                $out.write_string (nom);
                $out.write_string (prenom);
                $out.write_string (noPermis);
                $out.write_string (noPlaque);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:ca/etsmtl/log720/lab1/NoPermisExisteDejaException:1.0"))
                    throw ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                ajouterDossier (nom, prenom, noPermis, noPlaque        );
            } finally {
                _releaseReply ($in);
            }
  } // ajouterDossier

  public void ajouterInfractionAuDossier (int idDossier, int idInfraction) throws ca.etsmtl.log720.lab1.InvalidIdException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ajouterInfractionAuDossier", true);
                $out.write_long (idDossier);
                $out.write_long (idInfraction);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:ca/etsmtl/log720/lab1/InvalidIdException:1.0"))
                    throw ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                ajouterInfractionAuDossier (idDossier, idInfraction        );
            } finally {
                _releaseReply ($in);
            }
  } // ajouterInfractionAuDossier

  public void ajouterReactionAuDossier (int idDossier, int idReaction) throws ca.etsmtl.log720.lab1.InvalidIdException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ajouterReactionAuDossier", true);
                $out.write_long (idDossier);
                $out.write_long (idReaction);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:ca/etsmtl/log720/lab1/InvalidIdException:1.0"))
                    throw ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                ajouterReactionAuDossier (idDossier, idReaction        );
            } finally {
                _releaseReply ($in);
            }
  } // ajouterReactionAuDossier

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _BanqueDossiersStub
