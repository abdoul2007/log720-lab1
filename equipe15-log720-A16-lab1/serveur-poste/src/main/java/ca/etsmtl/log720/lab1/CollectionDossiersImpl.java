package ca.etsmtl.log720.lab1;
import java.util.ArrayList;

public class CollectionDossiersImpl extends CollectionDossierPOA{
	
	private ArrayList<DossierImpl> dossier;
	
	public CollectionDossiersImpl() {
		super();
		this.dossier = new ArrayList<DossierImpl>();
	}

	public Dossier getDossier(int index) {
		// TODO Auto-generated method stub
		return (Dossier) this.dossier.get(index);
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.dossier.size();
	}

}
