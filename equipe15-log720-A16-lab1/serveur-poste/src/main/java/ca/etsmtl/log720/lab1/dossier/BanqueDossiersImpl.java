package ca.etsmtl.log720.lab1.dossier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.BanqueDossiersPOA;
import ca.etsmtl.log720.lab1.CollectionDossier;
import ca.etsmtl.log720.lab1.CollectionDossierHelper;
import ca.etsmtl.log720.lab1.Dossier;
import ca.etsmtl.log720.lab1.InvalidIdException;
import ca.etsmtl.log720.lab1.NoPermisExisteDejaException;

public class BanqueDossiersImpl extends BanqueDossiersPOA implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2952740905007213865L;
	private CollectionDossiersImpl collectionDossiers;	
	File fichier =  new File("../../dossier.ser");

	public BanqueDossiersImpl() {
		this.collectionDossiers = new CollectionDossiersImpl();
		deserialiser();
		collectionDossiers.setListDossier(deserialiser());
	}

	public CollectionDossier dossiers() {
		// TODO Auto-generated method stub
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = Serveur_Dossier._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(collectionDossiers);

			// Retourner une Collection d'etudiant
			return CollectionDossierHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionDossier : "	+ e);
			return null;
		}
	}

	public CollectionDossier trouverDossiersParPlaque(String plaque) {
		CollectionDossiersImpl collectionD = null;
		int i = 0;
		while(i <= collectionDossiers.size()){
			if(collectionDossiers.getDossier(i).noPlaque().equals(plaque)){
				collectionD = collectionDossiers;	
			}
			i++;
		}
		return (CollectionDossier) collectionD;
	}

	public CollectionDossier trouverDossiersParNom(String nom, String prenom) {
		CollectionDossiersImpl collectionD = null;
		deserialiser();
		int i = 0;
		while(i <= collectionDossiers.size()){
			if((collectionDossiers.getDossier(i).nom().equals(nom)) && 
					(collectionDossiers.getDossier(i).prenom().equals(prenom))){
				collectionD = collectionDossiers;	
			}
			i++;
		}
		return (CollectionDossier) collectionD;
	}

	public Dossier trouverDossierParPermis(String noPermis) {
		DossierImpl dossier = null;
		int i = 0;
		int pos = -1;
		while((i <= collectionDossiers.size())&& (pos==-1)){
			if(collectionDossiers.getDossier(i).noPermis().equals(noPermis)){
				dossier = (DossierImpl) collectionDossiers.getDossier(i);
				pos=i;
			}
			i++;
		}
		return (Dossier) dossier;
	}

	public Dossier trouverDossierParId(int idDossier) {
		Dossier dossier = null;
		int i = 0;
		int pos = -1;
		while((i <= collectionDossiers.size())&& (pos==-1)){
			if(collectionDossiers.getDossier(i).id()==idDossier){
				dossier = collectionDossiers.getDossier(i);	
				pos=i;
			}
			i++;
		}
		return dossier;
	}

	public void ajouterDossier(String nom, String prenom, String noPermis, String noPlaque)
			throws NoPermisExisteDejaException {
		DossierImpl dossier= new DossierImpl(nom, prenom, noPermis, noPlaque);
		
		deserialiser();
		collectionDossiers.dossier().add(dossier);
		serialiser(collectionDossiers);
	}

	/*public void listerDossier(){
		int i=0;
		while(!collectionDossiers.dossier().isEmpty()){

			DossierImpl dossier = (DossierImpl) collectionDossiers.dossier().get(i);
			deserialiser(dossier);
			dossier.toString();
			i++;
		}
	}*/


	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws InvalidIdException {
		// TODO Auto-generated method stub	
		try {
			this.collectionDossiers.getDossier(idDossier).ajouterInfractionAListe(idInfraction);			
		} catch (Exception e) {
			throw new InvalidIdException();
		}
	}

	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws InvalidIdException {
		// TODO Auto-generated method stub	
		try {
			this.collectionDossiers.getDossier(idDossier).ajouterReactionAListe(idReaction);
		} catch (Exception e) {
			// TODO: handle exception
			throw new InvalidIdException();
		}
	}

	public void serialiser(CollectionDossiersImpl collectionDossiers){

		try{
			FileOutputStream fos= new FileOutputStream(fichier);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(collectionDossiers.dossier());
			oos.close();
			fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<DossierImpl> deserialiser(){
		ArrayList<DossierImpl> listDossiers= new ArrayList<DossierImpl>();
		try
		{
			FileInputStream fis = new FileInputStream(fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			listDossiers = (ArrayList<DossierImpl>) ois.readObject();
			//collectionDossiers.setListDossier(listDossiers);
			ois.close();
			fis.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
		}
		return listDossiers;

	}


}
