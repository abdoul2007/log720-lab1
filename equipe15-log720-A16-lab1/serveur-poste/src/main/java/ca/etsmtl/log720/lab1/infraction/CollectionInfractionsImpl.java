package ca.etsmtl.log720.lab1.infraction;

import java.util.ArrayList;

import ca.etsmtl.log720.lab1.CollectionInfractionPOA;
import ca.etsmtl.log720.lab1.Infraction;

public class CollectionInfractionsImpl extends CollectionInfractionPOA{
	
	private ArrayList<InfractionImpl> infractions;	
	private int size;
	
	public CollectionInfractionsImpl() {
		super();
		// TODO Auto-generated constructor stub
		infractions = new ArrayList<InfractionImpl>();
		this.size = infractions.size();
	}

	public Infraction getInfraction(int index) {
		// TODO Auto-generated method stub
		return (Infraction) this.infractions.get(index);
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	public ArrayList<InfractionImpl> infraction() {
		// TODO Auto-generated method stub
		return this.infractions;
	}

}
