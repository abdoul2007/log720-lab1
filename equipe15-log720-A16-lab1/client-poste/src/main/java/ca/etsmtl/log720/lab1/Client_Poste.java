package ca.etsmtl.log720.lab1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.spec.DESedeKeySpec;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client_Poste {
	static BanqueDossiers banqueDossiers;
	static BanqueInfractions banqueInfractions;

	public static void main(String[] args) {
		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

			// get hold of the naming service
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));
			
			NameComponent[] nameDossier = new NameComponent[] { new NameComponent(
					"BanqueDossiers", "service") };		
			NameComponent[] nameInfraction = new NameComponent[] { new NameComponent(
					"BanqueInfraction", "service") };

			// resolve name to get a reference to our server
			banqueDossiers = BanqueDossiersHelper.narrow(nc.resolve(nameDossier));
			banqueInfractions = BanqueInfractionsHelper.narrow(nc.resolve(nameInfraction));
			
			// Ajout d'un dossier
			System.out.println("debut ajout") ;
			banqueDossiers.ajouterDossier("Anouar", "Lazrak", "A13221", "G25Y14");
			banqueDossiers.ajouterDossier("Abdoul", "Aziz", "G33Q78", "R65J20");
			System.out.println("fin ajout") ;
			System.out.println("\n");
			
			System.out.println("Affichage de l'objet serialiser");
			
			visualiserListeDossier();
			
			/*boolean rep = true;
			do{
				System.out.println("Que voulez-vous faire ? :");
				System.out.println("1. Ajouter des dossiers dans la banque de dossiers ? :");
				System.out.println("2. Ajouter des infractions dans la banque d'infractions ? :");
				System.out.println("3. Visualiser une liste des dossiers compris dans la banque de dossiers ? :");
				System.out.println("4. Visualiser une liste des infractions comprises dans la banque d'infractions ? :");
				Scanner scanIn = new Scanner(System.in);
				int valeurChoisie = scanIn.nextInt();
				switch (va) {
				case value:
					
					break;

				default:
					break;
				}
			}while( rep = false);*/
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ajoutDossier(String nom, String prenom, String noPermis, String noPlaque){
		try {
			banqueDossiers.ajouterDossier(nom, prenom, noPermis, noPlaque);
		} catch (NoPermisExisteDejaException e) {
			e.printStackTrace();
		}
	}
	
	public static void ajoutInfraction(String description, int niveau){
		try {
			banqueInfractions.ajouterInfraction(description, niveau);
		} catch (NiveauHorsBornesException e) {
			e.printStackTrace();
		}
	}
	
	public static void visualiserListeDossier(){
		CollectionDossier collectionD = banqueDossiers.dossiers();
		// Attention: size() est une fonction implementee dans la classe CollectionDossierImpl
		for(int i=0; i<=collectionD.size(); i++){
			collectionD.getDossier(i)._toString();
		}
	}
	
	public static void visualiserListeInfraction(){
		CollectionInfraction collectionI = banqueInfractions.infractions();
		// Attention: size() est une fonction implementee dans la classe CollectionInfractionImpl
		for(int i=0; i<=collectionI.size(); i++){
			collectionI.getInfraction(i)._toString();
		}
	}
	
}
