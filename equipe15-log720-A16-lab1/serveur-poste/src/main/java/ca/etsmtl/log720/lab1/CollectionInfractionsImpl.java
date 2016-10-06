package ca.etsmtl.log720.lab1;

import java.util.ArrayList;

public class CollectionInfractionsImpl extends CollectionInfractionPOA{
	private ArrayList<InfractionImpl> infraction;
	
	
	public CollectionInfractionsImpl() {
		super();
		// TODO Auto-generated constructor stub
		infraction = new ArrayList<InfractionImpl>();
	}

	public Infraction getInfraction(int index) {
		// TODO Auto-generated method stub
		return (Infraction) this.infraction.get(index);
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return this.infraction.size();
	}

}
