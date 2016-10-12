package ca.etsmtl.log720.lab1.infraction;

import java.io.Serializable;

import ca.etsmtl.log720.lab1.InfractionPOA;

public class InfractionImpl extends InfractionPOA implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4395947180398788819L;
	private int id;
    private String description;
    private int niveauGravite;
    
	public InfractionImpl(String description, int niveauGravite) {
		this.id = id++;
		this.description = description;
		this.niveauGravite = niveauGravite;
	}

	public int id() {
		// TODO Auto-generated method stub
		return id;
	}

	public String description() {
		// TODO Auto-generated method stub
		return description;
	}

	public int niveau() {
		// TODO Auto-generated method stub
		return niveauGravite;
	}

	public String _toString() {
		// TODO Auto-generated method stub
		return "id= " + this.id + "description= " + this.description + "niveau= " + this.niveauGravite ;
	}

}
