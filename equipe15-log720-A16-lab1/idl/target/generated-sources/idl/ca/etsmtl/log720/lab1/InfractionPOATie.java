package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Infraction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class InfractionPOATie
	extends InfractionPOA
{
	private InfractionOperations _delegate;

	private POA _poa;
	public InfractionPOATie(InfractionOperations delegate)
	{
		_delegate = delegate;
	}
	public InfractionPOATie(InfractionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.Infraction _this()
	{
		return ca.etsmtl.log720.lab1.InfractionHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.Infraction _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.InfractionHelper.narrow(_this_object(orb));
	}
	public InfractionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(InfractionOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public int niveau()
	{
		return _delegate.niveau();
	}

	public java.lang.String description()
	{
		return _delegate.description();
	}

	public int id()
	{
		return _delegate.id();
	}

	public java.lang.String _toString()
	{
		return _delegate._toString();
	}

}
