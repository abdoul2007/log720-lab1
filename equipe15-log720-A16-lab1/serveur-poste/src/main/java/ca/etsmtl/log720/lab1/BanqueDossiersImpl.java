package ca.etsmtl.log720.lab1;

import java.util.ArrayList;

public class BanqueDossiersImpl extends BanqueDossiersPOA{
	
	private ArrayList<CollectionDossiersImpl> dossiers;
	
	
	public BanqueDossiersImpl() {
		this.dossiers = new ArrayList<CollectionDossiersImpl>();
	}

	public CollectionDossier dossiers() {
		// TODO Auto-generated method stub
		return (CollectionDossier) this.dossiers;
	}

	public CollectionDossier trouverDossiersParPlaque(String plaque) {
		CollectionDossier collectionDossier = null;
		int i = 0;
		while(i <= dossiers.size()){
			if(dossiers.get(i).getDossier(i).noPlaque().equals(plaque)){
				collectionDossier = (CollectionDossier) dossiers.get(i);	
			}
			i++;
		}
		return collectionDossier;
	}

	public CollectionDossier trouverDossiersParNom(String nom, String prenom) {
		CollectionDossier collectionDossier = null;
		int i = 0;
		while(i <= dossiers.size()){
			if((dossiers.get(i).getDossier(i).nom().equals(nom)) && 
					(dossiers.get(i).getDossier(i).prenom().equals(prenom))){
				collectionDossier = (CollectionDossier) dossiers.get(i);	
			}
			i++;
		}
		return collectionDossier;
	}

	public Dossier trouverDossierParPermis(String noPermis) {
		Dossier dossier = null;
		int i = 0;
		while(i <= dossiers.size()){
			if(dossiers.get(i).getDossier(i).noPermis().equals(noPermis)){
				dossier = dossiers.get(i).getDossier(i);	
			}
			i++;
		}
		return dossier;
	}

	public Dossier trouverDossierParId(int idDossier) {
		Dossier dossier = null;
		int i = 0;
		while(i <= dossiers.size()){
			if(dossiers.get(i).getDossier(i).id()==idDossier){
				dossier = dossiers.get(i).getDossier(i);	
			}
			i++;
		}
		return dossier;
	}

	public void ajouterDossier(String nom, String prenom, String noPermis, String noPlaque)
			throws NoPermisExisteDejaException {
		DossierImpl dossier= new DossierImpl(nom, prenom, noPermis, noPlaque);	
		
		try {
			for(int i=0; i<= dossiers.size(); i++){
				if(dossiers.get(i).equals(null)){
					//dossiers.get(i).
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws InvalidIdException {
		// TODO Auto-generated method stub
		
	}

	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws InvalidIdException {
		// TODO Auto-generated method stub
		
	}

}
