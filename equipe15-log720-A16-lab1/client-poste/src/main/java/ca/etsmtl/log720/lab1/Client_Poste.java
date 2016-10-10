package ca.etsmtl.log720.lab1;

import java.util.Scanner;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client_Poste {

	public static void main(String[] args) {
		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

			// get hold of the naming service
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			NameComponent[] nameDossier = new NameComponent[] { new NameComponent(
					"BanqueDossier", "service") };
			NameComponent[] nameInfraction = new NameComponent[] { new NameComponent(
					"BanqueInfraction", "service") };

			// resolve name to get a reference to our server
			BanqueDossiers banqueDossiers = BanqueDossiersHelper.narrow(nc.resolve(nameDossier));
			BanqueInfractions banqueInfractions = BanqueInfractionsHelper.narrow(nc.resolve(nameInfraction));
			
			// Ajout d'un dossier
						banqueDossiers.ajouterDossier("Soumahoro", "Abdoul Aziz", "A13221", "G25Y14");
						Dossier dossier = banqueDossiers.trouverDossierParPermis("A13221");
						System.out.println("Contenu Dossier: "+ dossier.id()+ dossier.nom()+ dossier.prenom()+
								dossier.noPermis()+ dossier.noPlaque());
			/*boolean rep = true;
			do{
				System.out.println("Que voulez-vous faire ? :");
				System.out.println("1. Ajouter des dossiers dans la banque de dossiers ? :");
				System.out.println("2. Ajouter des infractions dans la banque d'infractions ? :");
				System.out.println("3. Visualiser une liste des dossiers compris dans la banque de dossiers ? :");
				System.out.println("4. Visualiser une liste des infractions comprises dans la banque d'infractions ? :");
				Scanner scanIn = new Scanner(System.in);
				int valeurChoisie = scanIn.nextInt();				
			}while( rep = false);8*/
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
