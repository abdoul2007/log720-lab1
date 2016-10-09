package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.BanqueReactionsPOA;
import ca.etsmtl.log720.lab1.CollectionReaction;
import ca.etsmtl.log720.lab1.CollectionReactionHelper;
import ca.etsmtl.log720.lab1.Reaction;

public class BanqueReactionImpl extends BanqueReactionsPOA{

	
	
	private CollectionReactionsImpl _collectionReactionImpl;
	
	public BanqueReactionImpl() {
		_collectionReactionImpl = new CollectionReactionsImpl();
	}
	
	
	public CollectionReaction reactions() {
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = ClientVoiture._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(_collectionReactionImpl);

			// Retourner une Collection d'etudiant
			return CollectionReactionHelper.narrow(obj);
			
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionReaction : "	+ e);
			return null;
		}
	}

	public void ajouterReaction(String reaction, int gravite) {
		ReactionImpl _reaction = new ReactionImpl(reaction, gravite);
		_collectionReactionImpl.getListeEtudiants().add(_reaction);
	}

	public CollectionReaction trouverReactionsParDossier(ca.etsmtl.log720.lab1.Dossier myDossier) {
		return null;
	}

	public Reaction trouverReactionParId(int idReaction) {
 		return null;
	}

	
	
}
