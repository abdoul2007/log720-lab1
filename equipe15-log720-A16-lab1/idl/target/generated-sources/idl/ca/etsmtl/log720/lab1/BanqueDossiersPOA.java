package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueDossiers"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class BanqueDossiersPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.BanqueDossiersOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "trouverDossierParPermis", new java.lang.Integer(0));
		m_opsHash.put ( "trouverDossiersParNom", new java.lang.Integer(1));
		m_opsHash.put ( "_get_dossiers", new java.lang.Integer(2));
		m_opsHash.put ( "ajouterReactionAuDossier", new java.lang.Integer(3));
		m_opsHash.put ( "trouverDossierParId", new java.lang.Integer(4));
		m_opsHash.put ( "ajouterInfractionAuDossier", new java.lang.Integer(5));
		m_opsHash.put ( "trouverDossiersParPlaque", new java.lang.Integer(6));
		m_opsHash.put ( "ajouterDossier", new java.lang.Integer(7));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueDossiers:1.0"};
	public ca.etsmtl.log720.lab1.BanqueDossiers _this()
	{
		return ca.etsmtl.log720.lab1.BanqueDossiersHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueDossiers _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueDossiersHelper.narrow(_this_object(orb));
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
			case 0: // trouverDossierParPermis
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.DossierHelper.write(_out,trouverDossierParPermis(_arg0));
				break;
			}
			case 1: // trouverDossiersParNom
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.CollectionDossierHelper.write(_out,trouverDossiersParNom(_arg0,_arg1));
				break;
			}
			case 2: // _get_dossiers
			{
			_out = handler.createReply();
			ca.etsmtl.log720.lab1.CollectionDossierHelper.write(_out,dossiers());
				break;
			}
			case 3: // ajouterReactionAuDossier
			{
			try
			{
				int _arg0=_input.read_long();
				int _arg1=_input.read_long();
				_out = handler.createReply();
				ajouterReactionAuDossier(_arg0,_arg1);
			}
			catch(ca.etsmtl.log720.lab1.InvalidIdException _ex0)
			{
				_out = handler.createExceptionReply();
				ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // trouverDossierParId
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.DossierHelper.write(_out,trouverDossierParId(_arg0));
				break;
			}
			case 5: // ajouterInfractionAuDossier
			{
			try
			{
				int _arg0=_input.read_long();
				int _arg1=_input.read_long();
				_out = handler.createReply();
				ajouterInfractionAuDossier(_arg0,_arg1);
			}
			catch(ca.etsmtl.log720.lab1.InvalidIdException _ex0)
			{
				_out = handler.createExceptionReply();
				ca.etsmtl.log720.lab1.InvalidIdExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // trouverDossiersParPlaque
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.CollectionDossierHelper.write(_out,trouverDossiersParPlaque(_arg0));
				break;
			}
			case 7: // ajouterDossier
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				_out = handler.createReply();
				ajouterDossier(_arg0,_arg1,_arg2,_arg3);
			}
			catch(ca.etsmtl.log720.lab1.NoPermisExisteDejaException _ex0)
			{
				_out = handler.createExceptionReply();
				ca.etsmtl.log720.lab1.NoPermisExisteDejaExceptionHelper.write(_out, _ex0);
			}
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
