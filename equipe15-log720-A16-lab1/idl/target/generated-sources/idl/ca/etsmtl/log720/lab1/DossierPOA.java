package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "Dossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class DossierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.DossierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "ajouterInfractionAListe", new java.lang.Integer(0));
		m_opsHash.put ( "_get_niveau", new java.lang.Integer(1));
		m_opsHash.put ( "_get_noPlaque", new java.lang.Integer(2));
		m_opsHash.put ( "_get_prenom", new java.lang.Integer(3));
		m_opsHash.put ( "getListeInfraction", new java.lang.Integer(4));
		m_opsHash.put ( "_get_nom", new java.lang.Integer(5));
		m_opsHash.put ( "ajouterReactionAListe", new java.lang.Integer(6));
		m_opsHash.put ( "_get_id", new java.lang.Integer(7));
		m_opsHash.put ( "getListeReaction", new java.lang.Integer(8));
		m_opsHash.put ( "toString", new java.lang.Integer(9));
		m_opsHash.put ( "_get_noPermis", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/Dossier:1.0"};
	public ca.etsmtl.log720.lab1.Dossier _this()
	{
		return ca.etsmtl.log720.lab1.DossierHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.Dossier _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.DossierHelper.narrow(_this_object(orb));
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
			case 0: // ajouterInfractionAListe
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ajouterInfractionAListe(_arg0);
				break;
			}
			case 1: // _get_niveau
			{
			_out = handler.createReply();
			_out.write_long(niveau());
				break;
			}
			case 2: // _get_noPlaque
			{
			_out = handler.createReply();
			_out.write_string(noPlaque());
				break;
			}
			case 3: // _get_prenom
			{
			_out = handler.createReply();
			_out.write_string(prenom());
				break;
			}
			case 4: // getListeInfraction
			{
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.ListeInfractionHelper.write(_out,getListeInfraction());
				break;
			}
			case 5: // _get_nom
			{
			_out = handler.createReply();
			_out.write_string(nom());
				break;
			}
			case 6: // ajouterReactionAListe
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ajouterReactionAListe(_arg0);
				break;
			}
			case 7: // _get_id
			{
			_out = handler.createReply();
			_out.write_long(id());
				break;
			}
			case 8: // getListeReaction
			{
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.ListeReactionHelper.write(_out,getListeReaction());
				break;
			}
			case 9: // toString
			{
				_out = handler.createReply();
				_out.write_string(_toString());
				break;
			}
			case 10: // _get_noPermis
			{
			_out = handler.createReply();
			_out.write_string(noPermis());
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
