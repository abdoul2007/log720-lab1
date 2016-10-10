package ca.etsmtl.log720.lab1;

import ca.etsmtl.log720.lab1.ReactionPOA;

public class ReactionImpl extends ReactionPOA{
	
	private int _id;
	private String _descriptionReaction;
	private int _niveauGravite;

	
	public ReactionImpl(int id ,String descriptionReaction, int niveauGravite) {
		_id = id; 
		_niveauGravite = niveauGravite;
		_descriptionReaction = descriptionReaction;
	}
	
	
	public int id() {
		return _id;
	}

	public String description() {
		return _descriptionReaction;
	}

	public int niveau() {
		return _niveauGravite;
	}


	public String _toString() {
		return (_id + " - " + _descriptionReaction + " - " + _niveauGravite);
	}
	
}
