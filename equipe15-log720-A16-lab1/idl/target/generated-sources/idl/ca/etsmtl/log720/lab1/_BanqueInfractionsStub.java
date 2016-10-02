package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL interface "BanqueInfractions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _BanqueInfractionsStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements ca.etsmtl.log720.lab1.BanqueInfractions
{
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueInfractions:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = ca.etsmtl.log720.lab1.BanqueInfractionsOperations.class;
	public ca.etsmtl.log720.lab1.CollectionInfraction trouverInfractionsParDossier(ca.etsmtl.log720.lab1.Dossier mydossier)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverInfractionsParDossier", true);
				ca.etsmtl.log720.lab1.DossierHelper.write(_os,mydossier);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.CollectionInfraction _result = ca.etsmtl.log720.lab1.CollectionInfractionHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverInfractionsParDossier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueInfractionsOperations _localServant = (BanqueInfractionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionInfraction _result;			try
			{
			_result = _localServant.trouverInfractionsParDossier(mydossier);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void ajouterInfraction(java.lang.String description, int niveau) throws ca.etsmtl.log720.lab1.NiveauHorsBornesException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterInfraction", true);
				_os.write_string(description);
				_os.write_long(niveau);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:ca/etsmtl/log720/lab1/NiveauHorsBornesException:1.0"))
				{
					throw ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterInfraction", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueInfractionsOperations _localServant = (BanqueInfractionsOperations)_so.servant;
			try
			{
			_localServant.ajouterInfraction(description,niveau);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public ca.etsmtl.log720.lab1.Infraction trouverInfractionParId(int idInfraction)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverInfractionParId", true);
				_os.write_long(idInfraction);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.Infraction _result = ca.etsmtl.log720.lab1.InfractionHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverInfractionParId", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueInfractionsOperations _localServant = (BanqueInfractionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.Infraction _result;			try
			{
			_result = _localServant.trouverInfractionParId(idInfraction);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public ca.etsmtl.log720.lab1.CollectionInfraction infractions()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_infractions",true);
				_is = _invoke(_os);
				return ca.etsmtl.log720.lab1.CollectionInfractionHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_infractions", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueInfractionsOperations _localServant = (BanqueInfractionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionInfraction _result;
		try
		{
			_result = _localServant.infractions();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

}
