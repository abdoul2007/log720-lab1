package ca.etsmtl.log720.lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import org.omg.PortableServer.POA;

public class BanqueReactionImpl extends BanqueReactionsPOA implements Serializable{



	

	/**
	 * 
	 */
	private static final long serialVersionUID = -740353999327390863L;
	private static CollectionReactionsImpl collectionReactions;	
	File fichier =  new File("../../reaction.ser");
	
	public BanqueReactionImpl() {
		// TODO Auto-generated constructor stub
		collectionReactions = new CollectionReactionsImpl();
	}
	
	public CollectionReaction reactions() {
		// TODO Auto-generated method stub
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = ServeurReaction._poa;
			
			//Mettre à jour la liste des dossier dans la memoire
			fileToMemory();
			
			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(collectionReactions);

			// Retourner une Collection d'etudiant
			return CollectionReactionHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionReaction : "	+ e);
			return null;
		}
	}

	public void ajouterReaction(String reaction, int gravite) {
		// TODO Auto-generated method stub
		ReactionImpl reactionImpl = new ReactionImpl(collectionReactions.size()+1, reaction, gravite);
		fileToMemory();
		collectionReactions.listReaction().add(reactionImpl);
		memoryToFile(collectionReactions.listReaction());
	}

	public CollectionReaction trouverReactionsParDossier(Dossier myDossier) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reaction trouverReactionParId(int idReaction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public void serialiser(ArrayList<ReactionImpl> listReactions){

		try{

			FileOutputStream fos= new FileOutputStream(fichier);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(listReactions);
			oos.close();
			fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<ReactionImpl> deserialiser(){

		ArrayList<ReactionImpl> listReactions= new ArrayList<ReactionImpl>();
		try
		{
			FileInputStream fis = new FileInputStream(fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			listReactions = (ArrayList<ReactionImpl>) ois.readObject();
			//collectionDossiers.setListDossier(listDossiers);
			ois.close();
			fis.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
		}
		return listReactions;
	}

	//Pour deserialiser
	public void fileToMemory()
	{
		ArrayList<ReactionImpl> listReactions= new ArrayList<ReactionImpl>();
		listReactions = deserialiser();
		collectionReactions.setListReaction(listReactions);
	}

	//Pour serialiser
	public void memoryToFile(ArrayList<ReactionImpl> listReactions)
	{
		serialiser(listReactions);
	}


	/*public BanqueReactionImpl() {
		this.collectionReactionImpl = new CollectionReactionsImpl();
	}

	public CollectionReaction reactions() {

		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = ServeurReaction._poa;

			//Mettre à jour la liste des dossier dans la memoire
			fileToMemory();

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(collectionReactionImpl);

			// Retourner une Collection d'etudiant
			return CollectionReactionHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionReaction : "	+ e);
			return null;
		}
	}


	public void ajouterReaction(String reaction, int gravite) {		
		fileToMemory();
		collectionReactionImpl.ajouterReaction(reaction, gravite);
		memoryToFile(collectionReactionImpl.getListeReactions());
	}

	public CollectionReaction trouverReactionsParDossier(Dossier myDossier) {

		int[] listeReaction = myDossier.getListeReaction();
		CollectionReactionsImpl collectionDossier = new CollectionReactionsImpl();

		for (int reaction : listeReaction) {

			Reaction currentReaction  = trouverReactionParId(reaction);
			if(currentReaction != null){
				collectionDossier.ajouterReaction(currentReaction.description(), currentReaction.niveau());
			}
		}
		return (CollectionReaction) collectionDossier;
	}

	public Reaction trouverReactionParId(int idReaction) {
		return collectionReactionImpl.trouverReactionParId(idReaction);
	}


	public void serialiser(ArrayList<ReactionImpl> listReactions){

		try{

			FileOutputStream fos= new FileOutputStream(fichier);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(listReactions);
			oos.close();
			fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public ArrayList<ReactionImpl> deserialiser(){

		ArrayList<ReactionImpl> listReactions= new ArrayList<ReactionImpl>();
		try
		{
			FileInputStream fis = new FileInputStream(fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			listReactions = (ArrayList<ReactionImpl>) ois.readObject();
			//collectionDossiers.setListDossier(listDossiers);
			ois.close();
			fis.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
		}
		return listReactions;
	}

	//Pour deserialiser
	public void fileToMemory()
	{
		ArrayList<ReactionImpl> listReactions= new ArrayList<ReactionImpl>();
		listReactions = deserialiser();
		collectionReactionImpl.setListReaction(listReactions);
	}

	//Pour serialiser
	public void memoryToFile(ArrayList<ReactionImpl> listReactions)
	{
		serialiser(listReactions);
	}
*/
}
