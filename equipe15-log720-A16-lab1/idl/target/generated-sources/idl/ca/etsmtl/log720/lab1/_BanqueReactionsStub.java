package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL interface "BanqueReactions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _BanqueReactionsStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements ca.etsmtl.log720.lab1.BanqueReactions
{
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueReactions:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = ca.etsmtl.log720.lab1.BanqueReactionsOperations.class;
	public ca.etsmtl.log720.lab1.CollectionReaction reactions()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_reactions",true);
				_is = _invoke(_os);
				return ca.etsmtl.log720.lab1.CollectionReactionHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_reactions", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueReactionsOperations _localServant = (BanqueReactionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionReaction _result;
		try
		{
			_result = _localServant.reactions();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void ajouterReaction(java.lang.String reaction, int gravite)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterReaction", true);
				_os.write_string(reaction);
				_os.write_long(gravite);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterReaction", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueReactionsOperations _localServant = (BanqueReactionsOperations)_so.servant;
			try
			{
			_localServant.ajouterReaction(reaction,gravite);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public ca.etsmtl.log720.lab1.Reaction trouverReactionParId(int idReaction)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverReactionParId", true);
				_os.write_long(idReaction);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.Reaction _result = ca.etsmtl.log720.lab1.ReactionHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverReactionParId", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueReactionsOperations _localServant = (BanqueReactionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.Reaction _result;			try
			{
			_result = _localServant.trouverReactionParId(idReaction);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public ca.etsmtl.log720.lab1.CollectionReaction trouverReactionsParDossier(ca.etsmtl.log720.lab1.Dossier myDossier)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "trouverReactionsParDossier", true);
				ca.etsmtl.log720.lab1.DossierHelper.write(_os,myDossier);
				_is = _invoke(_os);
				ca.etsmtl.log720.lab1.CollectionReaction _result = ca.etsmtl.log720.lab1.CollectionReactionHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "trouverReactionsParDossier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BanqueReactionsOperations _localServant = (BanqueReactionsOperations)_so.servant;
			ca.etsmtl.log720.lab1.CollectionReaction _result;			try
			{
			_result = _localServant.trouverReactionsParDossier(myDossier);
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
