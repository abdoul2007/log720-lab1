package ca.etsmtl.log720.lab1.infraction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.BanqueInfractionsPOA;
import ca.etsmtl.log720.lab1.CollectionInfraction;
import ca.etsmtl.log720.lab1.CollectionInfractionHelper;
import ca.etsmtl.log720.lab1.Dossier;
import ca.etsmtl.log720.lab1.Infraction;
import ca.etsmtl.log720.lab1.NiveauHorsBornesException;

public class BanqueInfractionsImpl extends BanqueInfractionsPOA implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6962171574176970717L;
	private static CollectionInfractionsImpl collectionInfractions;
	File fichier =  new File("../../infraction.ser");
	public BanqueInfractionsImpl() {
		this.collectionInfractions = new CollectionInfractionsImpl();
	}

	public CollectionInfraction infractions() {
		// TODO Auto-generated method stub
				try {
					// Recuperer le POA cree dans le serveur
					POA rootpoa = Serveur_Infraction._poa;
					
					//Mettre à jour la liste des dossier dans la memoire
					fileToMemory();
					
					// Activer l'objet et retourne l'objet CORBA
					org.omg.CORBA.Object obj = rootpoa
							.servant_to_reference(collectionInfractions);

					// Retourner une Collection d'etudiant
					return CollectionInfractionHelper.narrow(obj);

				} catch (Exception e) {
					System.out.println("Erreur retour de l'objet CollectionInfraction : "	+ e);
					return null;
				}
	}

	public CollectionInfraction trouverInfractionsParDossier(Dossier mydossier) {
		// TODO Auto-generated method stub
		CollectionInfractionsImpl collectionInf = new CollectionInfractionsImpl();
		int i=0;
		while(i <= mydossier.getListeInfraction().length){
			collectionInf.infraction().add((InfractionImpl) collectionInfractions.getInfraction(i));
			i++;
		}
		return (CollectionInfraction) collectionInf;
	}

	public Infraction trouverInfractionParId(int idInfraction) {
		// TODO Auto-generated method stub
		return collectionInfractions.getInfraction(idInfraction);
	}

	public void ajouterInfraction(String description, int niveau) throws NiveauHorsBornesException {
		// TODO Auto-generated method stub
	//try {
			InfractionImpl infraction = new InfractionImpl(description,niveau);	
			fileToMemory();
			collectionInfractions.infraction().add(infraction);
			memoryToFile(collectionInfractions.infraction());
		//} catch (Exception e) {
			// TODO: handle exception
			//throw new NiveauHorsBornesException();
		//}
	}
	
	public void serialiser(ArrayList<InfractionImpl> listInfractions){

		try{
			
			FileOutputStream fos= new FileOutputStream(fichier);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(listInfractions);
			oos.close();
			fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<InfractionImpl> deserialiser(){
		ArrayList<InfractionImpl> listInfractions= new ArrayList<InfractionImpl>();
		try
		{
			FileInputStream fis = new FileInputStream(fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			listInfractions = (ArrayList<InfractionImpl>) ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
		}
		return listInfractions;
	}
	
	//Pour deserialiser
	public void fileToMemory()
	{
		ArrayList<InfractionImpl> listInfractions= new ArrayList<InfractionImpl>();
		listInfractions = deserialiser();
		collectionInfractions.setListInfraction(listInfractions);
	}
	
	//Pour serialiser
	public void memoryToFile(ArrayList<InfractionImpl> listInfractions)
	{
		serialiser(listInfractions);
	}

}
