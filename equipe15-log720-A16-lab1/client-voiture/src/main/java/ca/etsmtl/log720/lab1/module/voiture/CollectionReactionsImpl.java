package ca.etsmtl.log720.lab1.module.voiture;

import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.CollectionReactionPOA;
import ca.etsmtl.log720.lab1.Reaction;

public class CollectionReactionsImpl extends CollectionReactionPOA{

	
	private ArrayList<ReactionImpl> _lisrReactions;
	
	
	public CollectionReactionsImpl() {
		_lisrReactions = new ArrayList<ReactionImpl>();
	}
	

	public Reaction getReaction(int index) {
		
		
		try{
			ReactionImpl reaction = _lisrReactions.get(index);

			//POA rootpoa = Server._poa;
			
		}catch (Exception e){
			System.out.println( "Erreur retour de l'objet Reaction : "+ e );
		}
		
		
		
		return null;
	}
	
	public int size() {
		return 0;
	}
	
}
