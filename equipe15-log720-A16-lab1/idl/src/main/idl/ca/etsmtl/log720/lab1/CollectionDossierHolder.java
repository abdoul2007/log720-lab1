package ca.etsmtl.log720.lab1;

/**
* ca/etsmtl/log720/lab1/CollectionDossierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dossier.idl
* Wednesday, October 12, 2016 5:43:37 PM PDT
*/

public final class CollectionDossierHolder implements org.omg.CORBA.portable.Streamable
{
  public ca.etsmtl.log720.lab1.CollectionDossier value = null;

  public CollectionDossierHolder ()
  {
  }

  public CollectionDossierHolder (ca.etsmtl.log720.lab1.CollectionDossier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ca.etsmtl.log720.lab1.CollectionDossierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ca.etsmtl.log720.lab1.CollectionDossierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ca.etsmtl.log720.lab1.CollectionDossierHelper.type ();
  }

}
