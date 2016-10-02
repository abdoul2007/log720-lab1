package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL definition of exception "NoPermisExisteDejaException"
 *	@author JacORB IDL compiler 
 */

public final class NoPermisExisteDejaExceptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.id(),"NoPermisExisteDejaException",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.NoPermisExisteDejaException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static ca.etsmtl.log720.lab1.NoPermisExisteDejaException extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/NoPermisExisteDejaException:1.0";
	}
	public static ca.etsmtl.log720.lab1.NoPermisExisteDejaException read (final org.omg.CORBA.portable.InputStream in)
	{
		ca.etsmtl.log720.lab1.NoPermisExisteDejaException result = new ca.etsmtl.log720.lab1.NoPermisExisteDejaException();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final ca.etsmtl.log720.lab1.NoPermisExisteDejaException s)
	{
		out.write_string(id());
	}
}
