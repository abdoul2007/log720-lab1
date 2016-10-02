package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL interface "BanqueDossiers"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _BanqueDossiersStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements ca.etsmtl.log720.lab1.BanqueDossiers
{
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = ca.etsmtl.log720.lab1.BanqueDossiersOperations.class;
	public ca.etsmtl.log720.lab1.Dossier trouverDossierParPermis(java.lang.String noPermis)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverDossierParPermis", true);
				_os.write_string(noPermis);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.Dossier _result = ca.etsmtl.log720.lab1.DossierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverDossierParPermis", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			ca.etsmtl.log720.lab1.Dossier _result;			try
			{
			_result = _localServant.trouverDossierParPermis(noPermis);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParNom(java.lang.String nom, java.lang.String prenom)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverDossiersParNom", true);
				_os.write_string(nom);
				_os.write_string(prenom);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.CollectionDossier _result = ca.etsmtl.log720.lab1.CollectionDossierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverDossiersParNom", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionDossier _result;			try
			{
			_result = _localServant.trouverDossiersParNom(nom,prenom);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public ca.etsmtl.log720.lab1.CollectionDossier dossiers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_dossiers",true);
				_is = _invoke(_os);
				return ca.etsmtl.log720.lab1.CollectionDossierHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_dossiers", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionDossier _result;
		try
		{
			_result = _localServant.dossiers();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws ca.etsmtl.log720.lab1.InvalidIdException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterReactionAuDossier", true);
				_os.write_long(idDossier);
				_os.write_long(idReaction);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:ca/etsmtl/log720/lab1/InvalidIdException:1.0"))
				{
					throw ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterReactionAuDossier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			try
			{
			_localServant.ajouterReactionAuDossier(idDossier,idReaction);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public ca.etsmtl.log720.lab1.Dossier trouverDossierParId(int idDossier)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverDossierParId", true);
				_os.write_long(idDossier);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.Dossier _result = ca.etsmtl.log720.lab1.DossierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverDossierParId", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			ca.etsmtl.log720.lab1.Dossier _result;			try
			{
			_result = _localServant.trouverDossierParId(idDossier);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws ca.etsmtl.log720.lab1.InvalidIdException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterInfractionAuDossier", true);
				_os.write_long(idDossier);
				_os.write_long(idInfraction);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:ca/etsmtl/log720/lab1/InvalidIdException:1.0"))
				{
					throw ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterInfractionAuDossier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			try
			{
			_localServant.ajouterInfractionAuDossier(idDossier,idInfraction);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParPlaque(java.lang.String plaque)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverDossiersParPlaque", true);
				_os.write_string(plaque);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.CollectionDossier _result = ca.etsmtl.log720.lab1.CollectionDossierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverDossiersParPlaque", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionDossier _result;			try
			{
			_result = _localServant.trouverDossiersParPlaque(plaque);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void ajouterDossier(java.lang.String nom, java.lang.String prenom, java.lang.String noPermis, java.lang.String noPlaque) throws ca.etsmtl.log720.lab1.NoPermisExisteDejaException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterDossier", true);
				_os.write_string(nom);
				_os.write_string(prenom);
				_os.write_string(noPermis);
				_os.write_string(noPlaque);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:ca/etsmtl/log720/lab1/NoPermisExisteDejaException:1.0"))
				{
					throw ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterDossier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueDossiersOperations _localServant = (BanqueDossiersOperations)_so.servant;
			try
			{
			_localServant.ajouterDossier(nom,prenom,noPermis,noPlaque);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
