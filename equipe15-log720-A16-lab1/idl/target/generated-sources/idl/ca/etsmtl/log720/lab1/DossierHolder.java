package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "Dossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class DossierHolder	implements org.omg.CORBA.portable.Streamable{
	 public Dossier value;
	public DossierHolder()
	{
	}
	public DossierHolder (final Dossier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DossierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DossierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DossierHelper.write (_out,value);
	}
}
