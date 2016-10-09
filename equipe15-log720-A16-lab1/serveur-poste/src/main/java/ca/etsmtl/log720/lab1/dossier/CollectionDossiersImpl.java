package ca.etsmtl.log720.lab1.dossier;
import java.util.ArrayList;

import ca.etsmtl.log720.lab1.CollectionDossierPOA;
import ca.etsmtl.log720.lab1.Dossier;

public class CollectionDossiersImpl extends CollectionDossierPOA{
	
	private int size;
	private ArrayList<DossierImpl> dossiers;
	
	public CollectionDossiersImpl() {
		this.dossiers = new ArrayList<DossierImpl>();
		this.size =this.dossiers.size();
	}

	public Dossier getDossier(int index) {
		// TODO Auto-generated method stub
		return (Dossier) this.dossiers.get(index);
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	public ArrayList<DossierImpl> dossier() {
		// TODO Auto-generated method stub
		return this.dossiers;
	}
}
