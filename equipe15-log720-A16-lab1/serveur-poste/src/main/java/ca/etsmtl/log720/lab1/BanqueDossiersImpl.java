package ca.etsmtl.log720.lab1;

import org.omg.PortableServer.POA;

public class BanqueDossiersImpl extends BanqueDossiersPOA{
	
	private CollectionDossiersImpl collectionDossiers;	
	
	public BanqueDossiersImpl() {
		this.collectionDossiers = new CollectionDossiersImpl();
	}

	public CollectionDossier dossiers() {
		// TODO Auto-generated method stub
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = Serveur_Poste._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(collectionDossiers);

			// Retourner une Collection d'etudiant
			return CollectionDossierHelper.narrow(obj);
			
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionDossier : "	+ e);
			return null;
		}
		//return (CollectionDossier) this.collectionDossiers;
	}

	public CollectionDossier trouverDossiersParPlaque(String plaque) {
		CollectionDossiersImpl collectionD = null;
		int i = 0;
		while(i <= collectionDossiers.size()){
			if(collectionDossiers.getDossier(i).noPlaque().equals(plaque)){
				collectionD = collectionDossiers;	
			}
			i++;
		}
		return (CollectionDossier) collectionD;
	}

	public CollectionDossier trouverDossiersParNom(String nom, String prenom) {
		CollectionDossiersImpl collectionD = null;
		int i = 0;
		while(i <= collectionDossiers.size()){
			if((collectionDossiers.getDossier(i).nom().equals(nom)) && 
					(collectionDossiers.getDossier(i).prenom().equals(prenom))){
				collectionD = collectionDossiers;	
			}
			i++;
		}
		return (CollectionDossier) collectionD;
	}

	public Dossier trouverDossierParPermis(String noPermis) {
		DossierImpl dossier = null;
		int i = 0;
		int pos = -1;
		while((i <= collectionDossiers.size())&& (pos==-1)){
			if(collectionDossiers.getDossier(i).noPermis().equals(noPermis)){
				dossier = (DossierImpl) collectionDossiers.getDossier(i);
				pos=i;
			}
			i++;
		}
		return (Dossier) dossier;
	}

	public Dossier trouverDossierParId(int idDossier) {
		Dossier dossier = null;
		int i = 0;
		int pos = -1;
		while((i <= collectionDossiers.size())&& (pos==-1)){
			if(collectionDossiers.getDossier(i).id()==idDossier){
				dossier = collectionDossiers.getDossier(i);	
				pos=i;
			}
			i++;
		}
		return dossier;
	}

	public void ajouterDossier(String nom, String prenom, String noPermis, String noPlaque)
			throws NoPermisExisteDejaException {
		DossierImpl dossier= new DossierImpl(nom, prenom, noPermis, noPlaque);
		if(trouverDossierParPermis(noPermis) != null){
			throw new NoPermisExisteDejaException();
		}else{
			this.collectionDossiers.dossier().add(dossier);
		}
	}
	
	public void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws InvalidIdException {
		// TODO Auto-generated method stub	
		try {
			this.collectionDossiers.getDossier(idDossier).ajouterInfractionAListe(idInfraction);			
		} catch (Exception e) {
			throw new InvalidIdException();
		}
	}

	public void ajouterReactionAuDossier(int idDossier, int idReaction) throws InvalidIdException {
		// TODO Auto-generated method stub	
		try {
			this.collectionDossiers.getDossier(idDossier).ajouterReactionAListe(idReaction);
		} catch (Exception e) {
			// TODO: handle exception
			throw new InvalidIdException();
		}
	}

}
