package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of exception "InvalidIdException"
 *	@author JacORB IDL compiler 
 */

public final class InvalidIdExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ca.etsmtl.log720.lab1.InvalidIdException value;

	public InvalidIdExceptionHolder ()
	{
	}
	public InvalidIdExceptionHolder(final ca.etsmtl.log720.lab1.InvalidIdException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.write(_out, value);
	}
}
