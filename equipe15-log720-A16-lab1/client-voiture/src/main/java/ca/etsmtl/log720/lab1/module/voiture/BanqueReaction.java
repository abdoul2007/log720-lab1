package ca.etsmtl.log720.lab1.module.voiture;

import java.util.Collection;

import ca.etsmtl.log720.lab1.bean.Dossier;

public interface BanqueReaction {

	
	public void ajouterReaction(String Description, int niveau);
	
	public Collection<Reaction> trouverReactionParDossier(Dossier dossier);
	
	public Reaction trouverReactionParId(int id);
	
	public Collection<Reaction> reactions();
	
	
}
