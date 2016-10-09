package ca.etsmtl.log720.lab1.infraction;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Serveur_Infraction {
	protected static org.omg.PortableServer.POA _poa;
	
	public static void main(String[] args) {
		// Initialize ORB
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
		
		try {
			org.omg.PortableServer.Servant servant;
			org.omg.CORBA.Object o;

			// Initialize POA
			_poa = org.omg.PortableServer.POAHelper
					.narrow(orb.resolve_initial_references("RootPOA"));
			_poa.the_POAManager().activate();

			// Initialize servant (Remote Object), convert to CORBA reference
			servant = new BanqueInfractionsImpl();
			o = _poa.servant_to_reference(servant);

			// Register Rermote Object with naming context
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));
			
			NameComponent[] nameInfraction = new NameComponent[] { new NameComponent(
					"BanqueInfractions", "service") };
			nc.rebind(nameInfraction, o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Start the ORB main thread
		orb.run();
	}
}
