package ca.etsmtl.log720.lab1.dossier;
import java.io.Serializable;
import java.util.ArrayList;

import ca.etsmtl.log720.lab1.CollectionDossierPOA;
import ca.etsmtl.log720.lab1.Dossier;

public class CollectionDossiersImpl extends CollectionDossierPOA implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8153106587767302112L;
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
	
	public void setListDossier(ArrayList<DossierImpl> newList){
		this.dossiers = newList;
	}
	
	public void listerDossier(){
		for (DossierImpl dossier : dossiers) {
			dossier.toString();
		}
	}
}
