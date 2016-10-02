package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "CollectionDossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class CollectionDossierHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionDossier value;
	public CollectionDossierHolder()
	{
	}
	public CollectionDossierHolder (final CollectionDossier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionDossierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionDossierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionDossierHelper.write (_out,value);
	}
}
