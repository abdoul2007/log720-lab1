package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL definition of exception "NiveauHorsBornesException"
 *	@author JacORB IDL compiler 
 */

public final class NiveauHorsBornesExceptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.id(),"NiveauHorsBornesException",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.NiveauHorsBornesException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static ca.etsmtl.log720.lab1.NiveauHorsBornesException extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/NiveauHorsBornesException:1.0";
	}
	public static ca.etsmtl.log720.lab1.NiveauHorsBornesException read (final org.omg.CORBA.portable.InputStream in)
	{
		ca.etsmtl.log720.lab1.NiveauHorsBornesException result = new ca.etsmtl.log720.lab1.NiveauHorsBornesException();
		if (!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final ca.etsmtl.log720.lab1.NiveauHorsBornesException s)
	{
		out.write_string(id());
	}
}
