
package ca.etsmtl.log720.lab1;

import java.util.Scanner;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import ca.etsmtl.log720.lab1.BanqueDossiers;
import ca.etsmtl.log720.lab1.BanqueReactions;
import ca.etsmtl.log720.lab1.BanqueReactionsHelper;
import ca.etsmtl.log720.lab1.Reaction;

public class ClientVoiture{
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

			// get hold of the naming service
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			NameComponent[] nameBReaction = new NameComponent[] { new NameComponent(
					"BanqueReaction", "service") };

			// resolve name to get a reference to our server
			BanqueReactions reactions = BanqueReactionsHelper.narrow(nc.resolve(nameBReaction));


			/*NameComponent[] nameBReaction = new NameComponent[] { new NameComponent(
					"BanqueReaction", "service") };

			// resolve name to get a reference to our server
			BanqueReactions reactions = BanqueReactionsHelper.narrow(nc.resolve(nameBReaction));*/




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
					System.out.println(reactions.reactions().getReaction(1).toString());
					break;

				case 2:
					reactions.ajouterReaction("reaction1", 3);
					System.out.println("================ AJOUT REACTION ================");
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

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
