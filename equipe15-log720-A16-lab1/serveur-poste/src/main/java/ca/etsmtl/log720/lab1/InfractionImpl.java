package ca.etsmtl.log720.lab1;

public class InfractionImpl extends InfractionPOA{
	private int id;
    private String description;
    private int niveauGravite;
    
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
