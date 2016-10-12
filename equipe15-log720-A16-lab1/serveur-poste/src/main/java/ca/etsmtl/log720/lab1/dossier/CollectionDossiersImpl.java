package ca.etsmtl.log720.lab1.dossier;
import java.io.Serializable;
import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.CollectionDossierHelper;
import ca.etsmtl.log720.lab1.CollectionDossierPOA;
import ca.etsmtl.log720.lab1.Dossier;
import ca.etsmtl.log720.lab1.DossierHelper;

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
		//return (Dossier) this.dossiers.get(index);
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = Serveur_Dossier._poa;
			
			//Mettre à jour la liste des dossier dans la memoire
			
			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(dossiers.get(index));

			// Retourner une Collection d'etudiant
			return DossierHelper.narrow(obj);

		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionDossier : "	+ e);
			return null;
		}
	}
	
	public int size() {
		// TODO Auto-generated method stub
		size = this.dossiers.size();
		return size;
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
