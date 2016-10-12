package ca.etsmtl.log720.lab1;

import java.util.Scanner;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client_Poste {
	static BanqueDossiers banqueDossiers;
	static BanqueInfractions banqueInfractions;
	public static Scanner sc = null;
	public static void main(String[] args) {
		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
			if(args.length == 1){
				banqueDossiers = BanqueDossiersHelper.narrow(orb.string_to_object(args[0]));
				banqueInfractions = BanqueInfractionsHelper.narrow(orb.string_to_object(args[0]));
			}
			else{
				// get hold of the naming service
				NamingContextExt nc = NamingContextExtHelper.narrow(orb
						.resolve_initial_references("NameService"));
				
				NameComponent[] nameDossier = new NameComponent[] { new NameComponent(
						"BanqueDossiers", "service") };		
				NameComponent[] nameInfraction = new NameComponent[] { new NameComponent(
						"BanqueInfractions", "service") };
	
				// resolve name to get a reference to our server
				banqueDossiers = BanqueDossiersHelper.narrow(nc.resolve(nameDossier));
				banqueInfractions = BanqueInfractionsHelper.narrow(nc.resolve(nameInfraction));
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc = new Scanner(System.in);
		int optionChoisi=0;
		boolean reponse=false;
		do{
			optionChoisi=afficherMenu();
			switch(optionChoisi){
				case 1:
					ajoutDossier();
					break;
				case 2:
					ajoutInfraction();
					break;
				case 3:
					visualiserListeDossier();
					break;
				case 4:
					visualiserListeInfraction();
					break;
				case 5:
					reponse=quitter();
				break;					
			}
		}while(reponse==false); // On quitte le main lorsque la fonction quitter retournera true;
		System.out.println("Au revoir!");
		sc.close();	
	}
	
	public static int afficherMenu() {
		System.out.println("");
		System.out.println("");
		System.out.println("**********************************************************************************");
		
		System.out.println("* "+"Choisissez une des options suivantes :"+"                                         *");
		System.out.println("* "+"1) "+"Ajouter des dossiers dans la banque de dossiers"+"                             *");
		System.out.println("* "+"2) "+"Ajouter des infractions dans la banque d'infractions"+"                        *");
		System.out.println("* "+"3) "+"Visualiser une liste des dossiers compris dans la banque de dossiers"+"        *");
		System.out.println("* "+"4) "+"Visualiser une liste des infractions comprises dans la banque d'infractions"+" *");
		System.out.println("* "+"5) "+"Quitter"+"                                                                     *");
		
		System.out.println("**********************************************************************************");		
		int optionMenu=sc.nextInt();
		sc.nextLine();	
		return optionMenu;
	}
	public static Boolean quitter() {
		char reponse;
		do{
			System.out.println("Voulez vous vraiment quitter ? O/N");
			reponse=sc.nextLine().charAt(0);
			
			while(reponse!='O'&&reponse!='N'){
				System.out.println("Erreur: Vous devez saisir O ou N en majuscule");
				reponse=sc.nextLine().charAt(0);
			}
				
		}while(reponse!='O'&&reponse!='N');
		if(reponse=='O')
			return true;
		else{return false;}
	
	}
	public static void ajoutDossier(){
		Scanner scanIn = new Scanner(System.in);
		try {
			System.out.println("entrer le nom:");
			String nom = scanIn.next();
			System.out.println("entrer le prenom:");
			String prenom = scanIn.next();
			System.out.println("entrer le numero Permis:");
			String noPermis = scanIn.next();
			System.out.println("entrer le numero plaque:");
			String noPlaque = scanIn.next();
			banqueDossiers.ajouterDossier(nom, prenom, noPermis, noPlaque);
		} catch (NoPermisExisteDejaException e) {
			e.printStackTrace();
		}
		scanIn.close();
	}
	
	public static void ajoutInfraction(){
		Scanner scanIn = new Scanner(System.in);
		try {
			System.out.println("entrer la description:");
			String description = scanIn.next();
			System.out.println("entrer le niveau:");
			int niveau = scanIn.nextInt();
			banqueInfractions.ajouterInfraction(description, niveau);
		} catch (NiveauHorsBornesException e) {
			e.printStackTrace();
		}
		scanIn.close();
	}
	
	public static void visualiserListeDossier(){
		CollectionDossier collectionD = banqueDossiers.dossiers();
		// Attention: size() est une fonction implementee dans la classe CollectionDossierImpl
		for(int i=0; i<=collectionD.size(); i++){
			System.out.println(collectionD.getDossier(i)._toString());
		}
	}
	
	public static void visualiserListeInfraction(){
		CollectionInfraction collectionI = banqueInfractions.infractions();
		// Attention: size() est une fonction implementee dans la classe CollectionInfractionImpl
		for(int i=0; i<=collectionI.size(); i++){
			System.out.println(collectionI.getInfraction(i)._toString());
		}
	}
	
}
