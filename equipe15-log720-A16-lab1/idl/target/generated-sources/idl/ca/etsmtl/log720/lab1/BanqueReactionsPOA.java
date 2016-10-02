package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueReactions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class BanqueReactionsPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.BanqueReactionsOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_reactions", new java.lang.Integer(0));
		m_opsHash.put ( "ajouterReaction", new java.lang.Integer(1));
		m_opsHash.put ( "trouverReactionParId", new java.lang.Integer(2));
		m_opsHash.put ( "trouverReactionsParDossier", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueReactions:1.0"};
	public ca.etsmtl.log720.lab1.BanqueReactions _this()
	{
		return ca.etsmtl.log720.lab1.BanqueReactionsHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueReactions _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueReactionsHelper.narrow(_this_object(orb));
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
			case 0: // _get_reactions
			{
			_out = handler.createReply();
			ca.etsmtl.log720.lab1.CollectionReactionHelper.write(_out,reactions());
				break;
			}
			case 1: // ajouterReaction
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				_out = handler.createReply();
				ajouterReaction(_arg0,_arg1);
				break;
			}
			case 2: // trouverReactionParId
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.ReactionHelper.write(_out,trouverReactionParId(_arg0));
				break;
			}
			case 3: // trouverReactionsParDossier
			{
				ca.etsmtl.log720.lab1.Dossier _arg0=ca.etsmtl.log720.lab1.DossierHelper.read(_input);
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.CollectionReactionHelper.write(_out,trouverReactionsParDossier(_arg0));
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
