package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueInfractions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class BanqueInfractionsHolder	implements org.omg.CORBA.portable.Streamable{
	 public BanqueInfractions value;
	public BanqueInfractionsHolder()
	{
	}
	public BanqueInfractionsHolder (final BanqueInfractions initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BanqueInfractionsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BanqueInfractionsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BanqueInfractionsHelper.write (_out,value);
	}
}
