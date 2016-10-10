package ca.etsmtl.log720.lab1;

import java.util.ArrayList;

public class CollectionReactionsImpl extends CollectionReactionPOA{


	private ArrayList<ReactionImpl> _lisrReactions;


	public CollectionReactionsImpl() {
		_lisrReactions = new ArrayList<ReactionImpl>();
	}

	
	
	public Reaction getReaction(int index) {

		return (Reaction) _lisrReactions.get(index);
	}

	
	
	public int size() {
		return _lisrReactions.size();
	}

	
	
	protected ArrayList<ReactionImpl> getListeReactions() {
		return _lisrReactions;
	}
	
	
	
	public void ajouterReaction(String description, int niveau){
		ReactionImpl reaction = new ReactionImpl(_lisrReactions.size(), description, niveau);
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
}
