package ca.etsmtl.log720.lab1;

import java.util.Scanner;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class ClientVoiture {

	protected static org.omg.PortableServer.POA _poa;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
		
		try {
			org.omg.PortableServer.Servant servant;
			org.omg.CORBA.Object o;

			// Initialize POA
			_poa = org.omg.PortableServer.POAHelper
					.narrow(orb.resolve_initial_references("RootPOA"));
			_poa.the_POAManager().activate();

			// Initialize servant (Remote Object), convert to CORBA reference
			servant = new BanqueReactionImpl();
			o = _poa.servant_to_reference(servant);

			// Register Rermote Object with naming context
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));
			NameComponent[] name = new NameComponent[] { new NameComponent(
					"BanqueReaction", "service") };
			nc.rebind(name, o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Start the ORB main thread
		orb.run();

		menu();
	}

	
	
	public static void menu(){
		
		Scanner input = new Scanner(System.in);
		
		while(true){
		
			System.out.println("Veuillez faire un choix : ");
			System.out.println("1. Obtenir liste de réactions possibles");
			System.out.println("2. Ajouter réaction");
			System.out.println("3. Obtenir liste de dossiers");
			System.out.println("4. Visualiser dossier");
			System.out.println("5. Obtenir liste d'infraction");
			System.out.println("0. Pour quitter");
			
			int key = input.nextInt();
	
			if(key == 0){
				break;
			}
			
			switch (key) {
			case 1:
				
				break;
	
			case 2:
				
				break;
	
			case 3:
	
				break;
	
			case 4:
	
				break;
	
			case 5:
	
				break;
				
			
			default :
				System.out.println("Ivalid input !!");
				break;
			}

		}
		
	}
	
	
}
