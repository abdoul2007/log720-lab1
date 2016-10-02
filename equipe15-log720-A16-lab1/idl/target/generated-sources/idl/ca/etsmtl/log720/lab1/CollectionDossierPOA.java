package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "CollectionDossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CollectionDossierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.CollectionDossierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getDossier", new java.lang.Integer(0));
		m_opsHash.put ( "_get_size", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/CollectionDossier:1.0"};
	public ca.etsmtl.log720.lab1.CollectionDossier _this()
	{
		return ca.etsmtl.log720.lab1.CollectionDossierHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.CollectionDossier _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.CollectionDossierHelper.narrow(_this_object(orb));
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
			case 0: // getDossier
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.DossierHelper.write(_out,getDossier(_arg0));
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
