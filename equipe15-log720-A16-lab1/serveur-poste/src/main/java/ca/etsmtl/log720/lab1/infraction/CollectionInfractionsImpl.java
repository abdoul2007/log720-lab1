package ca.etsmtl.log720.lab1.infraction;

import java.util.ArrayList;

import org.omg.PortableServer.POA;

import ca.etsmtl.log720.lab1.CollectionInfractionPOA;
import ca.etsmtl.log720.lab1.DossierHelper;
import ca.etsmtl.log720.lab1.Infraction;
import ca.etsmtl.log720.lab1.InfractionHelper;
import ca.etsmtl.log720.lab1.dossier.DossierImpl;
import ca.etsmtl.log720.lab1.dossier.Serveur_Dossier;

public class CollectionInfractionsImpl extends CollectionInfractionPOA{
	
	private ArrayList<InfractionImpl> infractions;	
	private int size;
	
	public CollectionInfractionsImpl() {
		// TODO Auto-generated constructor stub
		infractions = new ArrayList<InfractionImpl>();
		this.size = infractions.size();
	}

	public Infraction getInfraction(int index) {
		// TODO Auto-generated method stub
				try {
					// Recuperer le POA cree dans le serveur
					POA rootpoa = Serveur_Infraction._poa;
					
					//Mettre à jour la liste des dossier dans la memoire
					
					// Activer l'objet et retourne l'objet CORBA
					org.omg.CORBA.Object obj = rootpoa
							.servant_to_reference(infractions.get(index));

					// Retourner une Collection d'etudiant
					return InfractionHelper.narrow(obj);

				} catch (Exception e) {
					System.out.println("Erreur retour de l'objet CollectionInfraction : "	+ e);
					return null;
				}
	}
	
	public int size() {
		// TODO Auto-generated method stub
		size = infractions.size(); 
		return size;
	}
	public ArrayList<InfractionImpl> infraction() {
		// TODO Auto-generated method stub
		return this.infractions;
	}
	
	public void setListInfraction(ArrayList<InfractionImpl> newList){
		this.infractions = newList;
	}

}
