package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL definition of exception "NiveauHorsBornesException"
 *	@author JacORB IDL compiler 
 */

public final class NiveauHorsBornesExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ca.etsmtl.log720.lab1.NiveauHorsBornesException value;

	public NiveauHorsBornesExceptionHolder ()
	{
	}
	public NiveauHorsBornesExceptionHolder(final ca.etsmtl.log720.lab1.NiveauHorsBornesException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.write(_out, value);
	}
}
