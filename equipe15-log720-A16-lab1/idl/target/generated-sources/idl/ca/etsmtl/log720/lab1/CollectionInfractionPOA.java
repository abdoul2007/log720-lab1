package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "CollectionInfraction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CollectionInfractionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.CollectionInfractionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getInfraction", new java.lang.Integer(0));
		m_opsHash.put ( "_get_size", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/CollectionInfraction:1.0"};
	public ca.etsmtl.log720.lab1.CollectionInfraction _this()
	{
		return ca.etsmtl.log720.lab1.CollectionInfractionHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.CollectionInfraction _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.CollectionInfractionHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getInfraction
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.InfractionHelper.write(_out,getInfraction(_arg0));
				break;
			}
			case 1: // _get_size
			{
			_out = handler.createReply();
			_out.write_long(size());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
