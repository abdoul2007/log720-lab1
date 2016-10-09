package ca.etsmtl.log720.lab1;

import ca.etsmtl.log720.lab1.ReactionPOA;

public class ReactionImpl extends ReactionPOA{
	
	private int _id;
	private String _description;
	private int _niveauGravite;

	
	public ReactionImpl(String descriptionReaction, int niveauGravite) {
		_niveauGravite = niveauGravite;
		_description = descriptionReaction;
	}
	
	
	public int id() {
		return _id;
	}

	public String description() {
		return _description;
	}

	public int niveau() {
		return _niveauGravite;
	}

	public String _toString() {
		return (_id + " - " + _description + " - " + _niveauGravite);
	}


	
}
