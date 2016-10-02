package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL interface "CollectionReaction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _CollectionReactionStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements ca.etsmtl.log720.lab1.CollectionReaction
{
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/CollectionReaction:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = ca.etsmtl.log720.lab1.CollectionReactionOperations.class;
	public ca.etsmtl.log720.lab1.Reaction getReaction(int index)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getReaction", true);
				_os.write_long(index);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getReaction", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionReactionOperations _localServant = (CollectionReactionOperations)_so.servant;
			ca.etsmtl.log720.lab1.Reaction _result;			try
			{
			_result = _localServant.getReaction(index);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int size()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_size",true);
				_is = _invoke(_os);
				return _is.read_long();
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_size", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionReactionOperations _localServant = (CollectionReactionOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.size();
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
