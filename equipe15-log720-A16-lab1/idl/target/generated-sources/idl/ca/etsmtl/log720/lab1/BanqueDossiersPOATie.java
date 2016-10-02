package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BanqueDossiers"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BanqueDossiersPOATie
	extends BanqueDossiersPOA
{
	private BanqueDossiersOperations _delegate;

	private POA _poa;
	public BanqueDossiersPOATie(BanqueDossiersOperations delegate)
	{
		_delegate = delegate;
	}
	public BanqueDossiersPOATie(BanqueDossiersOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.BanqueDossiers _this()
	{
		return ca.etsmtl.log720.lab1.BanqueDossiersHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueDossiers _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueDossiersHelper.narrow(_this_object(orb));
	}
	public BanqueDossiersOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BanqueDossiersOperations delegate)
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
	public ca.etsmtl.log720.lab1.Dossier trouverDossierParPermis(java.lang.String noPermis)
	{
		return _delegate.trouverDossierParPermis(noPermis);
	}

	public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParNom(java.lang.String nom, java.lang.String prenom)
	{
		return _delegate.trouverDossiersParNom(nom,prenom);
	}

	public ca.etsmtl.log720.lab1.CollectionDossier dossiers()
	{
		return _delegate.dossiers();
	}

	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws ca.etsmtl.log720.lab1.InvalidIdException
	{
_delegate.ajouterReactionAuDossier(idDossier,idReaction);
	}

	public ca.etsmtl.log720.lab1.Dossier trouverDossierParId(int idDossier)
	{
		return _delegate.trouverDossierParId(idDossier);
	}

	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws ca.etsmtl.log720.lab1.InvalidIdException
	{
_delegate.ajouterInfractionAuDossier(idDossier,idInfraction);
	}

	public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParPlaque(java.lang.String plaque)
	{
		return _delegate.trouverDossiersParPlaque(plaque);
	}

	public void ajouterDossier(java.lang.String nom, java.lang.String prenom, java.lang.String noPermis, java.lang.String noPlaque) throws ca.etsmtl.log720.lab1.NoPermisExisteDejaException
	{
_delegate.ajouterDossier(nom,prenom,noPermis,noPlaque);
	}

}
