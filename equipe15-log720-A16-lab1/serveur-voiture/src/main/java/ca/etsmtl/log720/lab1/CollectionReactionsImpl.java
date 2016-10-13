package ca.etsmtl.log720.lab1;

import java.io.Serializable;
import java.util.ArrayList;

import org.omg.PortableServer.POA;


public class CollectionReactionsImpl extends CollectionReactionPOA implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4232593711203808150L;
	private int size;
	private ArrayList<ReactionImpl> _lisrReactions;
	
	
	public int size() {
		// TODO Auto-generated method stub
		size = _lisrReactions.size();
		return this.size;
	}
	public Reaction getReaction(int index) {
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = ServeurReaction._poa;
			
			//Mettre à jour la liste des dossier dans la memoire
			
			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(_lisrReactions.get(index));

			// Retourner une Collection d'etudiant
			return ReactionHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionDossier : "	+ e);
			return null;
		}
	}
	
	public ArrayList<ReactionImpl> listReaction(){
		return this._lisrReactions;
	}
	
	public void setListReaction(ArrayList<ReactionImpl> newList){
		_lisrReactions = newList;
	}
	
	public void listerReaction(){
		for (ReactionImpl reactionImpl : _lisrReactions) {
			reactionImpl.toString();
		}
	}
	
/*	public int size() {
		// TODO Auto-generated method stub
		return _lisrReactions.size();
	}
	public Reaction getReaction(int index) {
		// TODO Auto-generated method stub
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = ServeurReaction._poa;

			//Mettre à jour la liste des dossier dans la memoire

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(_lisrReactions.get(index));

			// Retourner une Collection d'etudiant
			return ReactionHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionDossier : "	+ e);
			return null;
		}
	}
	
	protected ArrayList<ReactionImpl> getListeReactions() {
		return _lisrReactions;
	}



	public void ajouterReaction(String description, int niveau){
		ReactionImpl reaction = new ReactionImpl(_lisrReactions.size()+1, description, niveau);
		_lisrReactions.add(reaction);
	}



	public Reaction trouverReactionParId(int idReaction) {
		for (ReactionImpl reactionImpl : _lisrReactions) {
			if( reactionImpl.id() == idReaction ){
				return (Reaction) reactionImpl;
			}
		}
		return null;
	}

	public void setListReaction(ArrayList<ReactionImpl> newList){
		this._lisrReactions = newList;
	}

	public void listerDossier(){
		for (ReactionImpl reaction : _lisrReactions) {
			reaction.toString();
		}
	}*/
	
	

}
