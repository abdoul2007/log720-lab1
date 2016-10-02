package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BanqueReactions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BanqueReactionsPOATie
	extends BanqueReactionsPOA
{
	private BanqueReactionsOperations _delegate;

	private POA _poa;
	public BanqueReactionsPOATie(BanqueReactionsOperations delegate)
	{
		_delegate = delegate;
	}
	public BanqueReactionsPOATie(BanqueReactionsOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.BanqueReactions _this()
	{
		return ca.etsmtl.log720.lab1.BanqueReactionsHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueReactions _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueReactionsHelper.narrow(_this_object(orb));
	}
	public BanqueReactionsOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BanqueReactionsOperations delegate)
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
	public ca.etsmtl.log720.lab1.CollectionReaction reactions()
	{
		return _delegate.reactions();
	}

	public void ajouterReaction(java.lang.String reaction, int gravite)
	{
_delegate.ajouterReaction(reaction,gravite);
	}

	public ca.etsmtl.log720.lab1.Reaction trouverReactionParId(int idReaction)
	{
		return _delegate.trouverReactionParId(idReaction);
	}

	public ca.etsmtl.log720.lab1.CollectionReaction trouverReactionsParDossier(ca.etsmtl.log720.lab1.Dossier myDossier)
	{
		return _delegate.trouverReactionsParDossier(myDossier);
	}

}
