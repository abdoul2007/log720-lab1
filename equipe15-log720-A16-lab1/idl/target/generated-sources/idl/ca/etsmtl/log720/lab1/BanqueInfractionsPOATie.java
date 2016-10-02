package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BanqueInfractions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BanqueInfractionsPOATie
	extends BanqueInfractionsPOA
{
	private BanqueInfractionsOperations _delegate;

	private POA _poa;
	public BanqueInfractionsPOATie(BanqueInfractionsOperations delegate)
	{
		_delegate = delegate;
	}
	public BanqueInfractionsPOATie(BanqueInfractionsOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ca.etsmtl.log720.lab1.BanqueInfractions _this()
	{
		return ca.etsmtl.log720.lab1.BanqueInfractionsHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueInfractions _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueInfractionsHelper.narrow(_this_object(orb));
	}
	public BanqueInfractionsOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BanqueInfractionsOperations delegate)
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
	public ca.etsmtl.log720.lab1.CollectionInfraction trouverInfractionsParDossier(ca.etsmtl.log720.lab1.Dossier mydossier)
	{
		return _delegate.trouverInfractionsParDossier(mydossier);
	}

	public void ajouterInfraction(java.lang.String description, int niveau) throws ca.etsmtl.log720.lab1.NiveauHorsBornesException
	{
_delegate.ajouterInfraction(description,niveau);
	}

	public ca.etsmtl.log720.lab1.Infraction trouverInfractionParId(int idInfraction)
	{
		return _delegate.trouverInfractionParId(idInfraction);
	}

	public ca.etsmtl.log720.lab1.CollectionInfraction infractions()
	{
		return _delegate.infractions();
	}

}
