
package ca.etsmtl.log720.lab1;

import java.util.Scanner;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import ca.etsmtl.log720.lab1.BanqueDossiers;
import ca.etsmtl.log720.lab1.BanqueInfractions;
import ca.etsmtl.log720.lab1.BanqueReactions;
import ca.etsmtl.log720.lab1.BanqueReactionsHelper;
import ca.etsmtl.log720.lab1.CollectionDossier;
import ca.etsmtl.log720.lab1.CollectionReaction;
import ca.etsmtl.log720.lab1.NiveauHorsBornesException;

public class ClientVoiture{

	static BanqueDossiers banqueDossiers;
	static BanqueInfractions banqueInfractions;
	static BanqueReactions banqueReactions;
	public static Scanner sc = null;
	public static void main(String[] args) throws NiveauHorsBornesException, InvalidIdException {
		sc = new Scanner(System.in);

		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			NameComponent[] nameDossier = new NameComponent[] { new NameComponent(
					"BanqueDossiers", "service") };		
			NameComponent[] nameInfraction = new NameComponent[] { new NameComponent(
					"BanqueInfractions", "service") };

			NameComponent[] nameReaction = new NameComponent[] { new NameComponent(
					"BanqueReactions", "service") };

			// resolve name to get a reference to our server
			banqueDossiers = BanqueDossiersHelper.narrow(nc.resolve(nameDossier));

			banqueInfractions = BanqueInfractionsHelper.narrow(nc.resolve(nameInfraction));

			banqueReactions = BanqueReactionsHelper.narrow(nc.resolve(nameReaction));

		} catch (Exception e) {
			e.printStackTrace();
		}

		while(true){
			System.out.println("			-- Client Voiture--				  ");
			System.out.println("=========================================================");
			
			
			System.out.println("	Veuillez faire un choix : ");
			System.out.println("	1. Obtenir liste de réactions possibles");
			System.out.println("	2. Ajouter reaction dans le dossier");
			System.out.println("	3. Ajouter réaction dans la banques des reactions");
			System.out.println("	4. Obtenir liste des dossiers par nom & prenom");
			System.out.println("	5. Obtenir liste des dossiers par num de permis");
			System.out.println("	6. Obtenir liste des dossiers par num de plaque");			
			System.out.println("	7. Visualiser un dossier");
			System.out.println("	8. Obtenir liste infraction");
			System.out.println("	9. Ajouter une infraction au dossier ");
			System.out.println("	0. Pour quitter");
			System.out.println("=========================================================");

			int key = sc.nextInt();

			if(key == 0){
				break;
			}

			switch (key) {
			case 1:
				visualiserListeReaction();
				break;

			case 2:
				ajoutReactionAuDossier();
				break;

			case 3:
				ajouterReaction();
				//visualiserListeDossier();
				break;

			case 4:
				obtenirListDossierParNonEtPrenom();
				break;

			case 5:

				break;


			default :
				System.out.println("Ivalid input !!");
				break;
			}

		}
		//ajouterReaction();
	}

	private static void obtenirListDossierParNonEtPrenom() {
		
		System.out.println("Entrer nom conducteur : ");
		String nom = sc.next();
		System.out.println("Entrer prenom : ");
		String prenom = sc.next();
		
		CollectionDossier collectionD = banqueDossiers.trouverDossiersParNom(nom, prenom);
		for(int i=0; i<=collectionD.size(); i++){
			System.out.println(collectionD.getDossier(i)._toString());
		}
	}

	private static void ajoutReactionAuDossier() throws InvalidIdException {
		
		System.out.println("Entrer id du dossier : ");
		int idDossier = sc.nextInt();
		System.out.println("Entrer id du reaction : ");
		int idReaction = sc.nextInt();
		
		banqueDossiers.ajouterReactionAuDossier(idDossier, idReaction);
		
	}

	private static void visualiserListeReaction() {
		CollectionReaction collectionReaction = banqueReactions.reactions();

		for(int i=0; i<=collectionReaction.size(); i++){
			System.out.println(collectionReaction.getReaction(i)._toString());
		}
	}

	private static void ajouterReaction() {

		System.out.println("--		Ajout Reaction		--");
		System.out.println("==============================");

		System.out.println("Entrer Description : ");
		String description = sc.next(); 

		System.out.println("Entrer niveau de gravite (1 to 10) : ");
		int niveau = sc.nextInt();

		banqueReactions.ajouterReaction(description, niveau);

	}

	public static void visualiserListeDossier(){
		CollectionDossier collectionD = banqueDossiers.dossiers();
		for(int i=0; i<=collectionD.size(); i++){
			System.out.println(collectionD.getDossier(i)._toString());
		}
	}



}
