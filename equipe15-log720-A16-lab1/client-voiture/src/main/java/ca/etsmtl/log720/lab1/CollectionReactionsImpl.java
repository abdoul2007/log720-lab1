package ca.etsmtl.log720.lab1;

import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.CollectionReactionPOA;
import ca.etsmtl.log720.lab1.Reaction;
import ca.etsmtl.log720.lab1.ReactionHelper;

public class CollectionReactionsImpl extends CollectionReactionPOA{


	private ArrayList<ReactionImpl> _lisrReactions;


	public CollectionReactionsImpl() {
		_lisrReactions = new ArrayList<ReactionImpl>();
	}


	public Reaction getReaction(int index) {


		try{
			ReactionImpl reaction = _lisrReactions.get(index);


			// Recuperer le POA cree dans le serveur
			POA rootpoa = ClientVoiture._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa.servant_to_reference(reaction);
			
			return ReactionHelper.narrow(obj);

		}catch (Exception e){
			System.out.println( "Erreur retour de l'objet Reaction : "+ e );
		}



		return null;
	}

	public int size() {
		return _lisrReactions.size();
	}

	protected ArrayList<ReactionImpl> getListeEtudiants() {
		return _lisrReactions;
	}
}
