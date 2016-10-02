package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of alias "ListeInfraction"
 *	@author JacORB IDL compiler 
 */

public final class ListeInfractionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ListeInfractionHolder ()
	{
	}
	public ListeInfractionHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListeInfractionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListeInfractionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListeInfractionHelper.write (out,value);
	}
}
