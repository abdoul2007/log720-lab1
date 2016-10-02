package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueInfractions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class BanqueInfractionsPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, ca.etsmtl.log720.lab1.BanqueInfractionsOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "trouverInfractionsParDossier", new java.lang.Integer(0));
		m_opsHash.put ( "ajouterInfraction", new java.lang.Integer(1));
		m_opsHash.put ( "trouverInfractionParId", new java.lang.Integer(2));
		m_opsHash.put ( "_get_infractions", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:ca/etsmtl/log720/lab1/BanqueInfractions:1.0"};
	public ca.etsmtl.log720.lab1.BanqueInfractions _this()
	{
		return ca.etsmtl.log720.lab1.BanqueInfractionsHelper.narrow(_this_object());
	}
	public ca.etsmtl.log720.lab1.BanqueInfractions _this(org.omg.CORBA.ORB orb)
	{
		return ca.etsmtl.log720.lab1.BanqueInfractionsHelper.narrow(_this_object(orb));
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
			case 0: // trouverInfractionsParDossier
			{
				ca.etsmtl.log720.lab1.Dossier _arg0=ca.etsmtl.log720.lab1.DossierHelper.read(_input);
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.CollectionInfractionHelper.write(_out,trouverInfractionsParDossier(_arg0));
				break;
			}
			case 1: // ajouterInfraction
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				_out = handler.createReply();
				ajouterInfraction(_arg0,_arg1);
			}
			catch(ca.etsmtl.log720.lab1.NiveauHorsBornesException _ex0)
			{
				_out = handler.createExceptionReply();
				ca.etsmtl.log720.lab1.NiveauHorsBornesExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // trouverInfractionParId
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				ca.etsmtl.log720.lab1.InfractionHelper.write(_out,trouverInfractionParId(_arg0));
				break;
			}
			case 3: // _get_infractions
			{
			_out = handler.createReply();
			ca.etsmtl.log720.lab1.CollectionInfractionHelper.write(_out,infractions());
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
