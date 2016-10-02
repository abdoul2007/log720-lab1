package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CollectionReaction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CollectionReactionPOATie
	extends CollectionReactionPOA
{
	private CollectionReactionOperations _delegate;

	private POA _poa;
	public CollectionReactionPOATie(CollectionReactionOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionReactionPOATie(CollectionReactionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.CollectionReaction _this()
	{
		return ca.etsmtl.log720.lab1.CollectionReactionHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.CollectionReaction _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.CollectionReactionHelper.narrow(_this_object(orb));
	}
	public CollectionReactionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionReactionOperations delegate)
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
	public ca.etsmtl.log720.lab1.Reaction getReaction(int index)
	{
		return _delegate.getReaction(index);
	}

	public int size()
	{
		return _delegate.size();
	}

}
