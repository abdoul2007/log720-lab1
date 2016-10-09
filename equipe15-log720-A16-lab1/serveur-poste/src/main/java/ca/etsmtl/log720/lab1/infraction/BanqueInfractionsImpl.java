package ca.etsmtl.log720.lab1.infraction;

import ca.etsmtl.log720.lab1.BanqueInfractionsPOA;
import ca.etsmtl.log720.lab1.CollectionInfraction;
import ca.etsmtl.log720.lab1.Dossier;
import ca.etsmtl.log720.lab1.Infraction;
import ca.etsmtl.log720.lab1.NiveauHorsBornesException;

public class BanqueInfractionsImpl extends BanqueInfractionsPOA{
	private CollectionInfractionsImpl collectionInfractions;
	
	public BanqueInfractionsImpl() {
		this.collectionInfractions = new CollectionInfractionsImpl();
	}

	public CollectionInfraction infractions() {
		// TODO Auto-generated method stub
		return (CollectionInfraction) this.collectionInfractions;
	}

	public CollectionInfraction trouverInfractionsParDossier(Dossier mydossier) {
		// TODO Auto-generated method stub
		CollectionInfractionsImpl collectionInf = new CollectionInfractionsImpl();
		int i=0;
		while(i <= mydossier.getListeInfraction().length){
			collectionInf.infraction().add((InfractionImpl) collectionInfractions.getInfraction(i));
			i++;
		}
		return (CollectionInfraction) collectionInf;
	}

	public Infraction trouverInfractionParId(int idInfraction) {
		// TODO Auto-generated method stub
		return collectionInfractions.getInfraction(idInfraction);
	}

	public void ajouterInfraction(String description, int niveau) throws NiveauHorsBornesException {
		// TODO Auto-generated method stub
		InfractionImpl infraction = new InfractionImpl(description,niveau);	
		try {
			collectionInfractions.infraction().add(infraction);
		} catch (Exception e) {
			// TODO: handle exception
			throw new NiveauHorsBornesException();
		}
	}

}
