package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "Infraction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class InfractionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.InfractionOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_niveau", new java.lang.Integer(0));
		m_opsHash.put ( "_get_description", new java.lang.Integer(1));
		m_opsHash.put ( "_get_id", new java.lang.Integer(2));
		m_opsHash.put ( "toString", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/Infraction:1.0"};
	public ca.etsmtl.log720.lab1.Infraction _this()
	{
		return ca.etsmtl.log720.lab1.InfractionHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.Infraction _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.InfractionHelper.narrow(_this_object(orb));
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
			case 0: // _get_niveau
			{
			_out = handler.createReply();
			_out.write_long(niveau());
				break;
			}
			case 1: // _get_description
			{
			_out = handler.createReply();
			_out.write_string(description());
				break;
			}
			case 2: // _get_id
			{
			_out = handler.createReply();
			_out.write_long(id());
				break;
			}
			case 3: // toString
			{
				_out = handler.createReply();
				_out.write_string(_toString());
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
