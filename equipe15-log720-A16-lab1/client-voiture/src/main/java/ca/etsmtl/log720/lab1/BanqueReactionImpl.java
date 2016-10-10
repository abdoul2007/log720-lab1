package ca.etsmtl.log720.lab1;

import java.util.ArrayList;
import java.util.Collection;

public class BanqueReactionImpl extends BanqueReactionsPOA{


	CollectionReactionsImpl collectionReactionImpl = new CollectionReactionsImpl();


	public CollectionReaction reactions() {
		return (CollectionReaction) collectionReactionImpl;
	}

	public void ajouterReaction(String reaction, int gravite) {
		collectionReactionImpl.ajouterReaction(reaction, gravite);
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

}
