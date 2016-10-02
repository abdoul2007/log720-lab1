package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of alias "ListeReaction"
 *	@author JacORB IDL compiler 
 */

public final class ListeReactionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ListeReactionHolder ()
	{
	}
	public ListeReactionHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListeReactionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListeReactionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListeReactionHelper.write (out,value);
	}
}
