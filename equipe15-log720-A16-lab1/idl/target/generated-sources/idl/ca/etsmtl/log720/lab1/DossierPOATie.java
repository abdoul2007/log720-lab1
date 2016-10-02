package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Dossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class DossierPOATie
	extends DossierPOA
{
	private DossierOperations _delegate;

	private POA _poa;
	public DossierPOATie(DossierOperations delegate)
	{
		_delegate = delegate;
	}
	public DossierPOATie(DossierOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.Dossier _this()
	{
		return ca.etsmtl.log720.lab1.DossierHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.Dossier _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.DossierHelper.narrow(_this_object(orb));
	}
	public DossierOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DossierOperations delegate)
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
	public void ajouterInfractionAListe(int idInfraction)
	{
_delegate.ajouterInfractionAListe(idInfraction);
	}

	public int niveau()
	{
		return _delegate.niveau();
	}

	public java.lang.String noPlaque()
	{
		return _delegate.noPlaque();
	}

	public java.lang.String prenom()
	{
		return _delegate.prenom();
	}

	public int[] getListeInfraction()
	{
		return _delegate.getListeInfraction();
	}

	public java.lang.String nom()
	{
		return _delegate.nom();
	}

	public void ajouterReactionAListe(int idReaction)
	{
_delegate.ajouterReactionAListe(idReaction);
	}

	public int id()
	{
		return _delegate.id();
	}

	public int[] getListeReaction()
	{
		return _delegate.getListeReaction();
	}

	public java.lang.String _toString()
	{
		return _delegate._toString();
	}

	public java.lang.String noPermis()
	{
		return _delegate.noPermis();
	}

}
