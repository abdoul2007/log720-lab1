package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueDossiers"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BanqueDossiersOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionDossier dossiers();
	ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParPlaque(java.lang.String plaque);
	ca.etsmtl.log720.lab1.CollectionDossier trouverDossiersParNom(java.lang.String nom, java.lang.String prenom);
	ca.etsmtl.log720.lab1.Dossier trouverDossierParPermis(java.lang.String noPermis);
	ca.etsmtl.log720.lab1.Dossier trouverDossierParId(int idDossier);
	void ajouterDossier(java.lang.String nom, java.lang.String prenom, java.lang.String noPermis, java.lang.String noPlaque) throws ca.etsmtl.log720.lab1.NoPermisExisteDejaException;
	void ajouterInfractionAuDossier(int idDossier, int idInfraction) throws ca.etsmtl.log720.lab1.InvalidIdException;
	void ajouterReactionAuDossier(int idDossier, int idReaction) throws ca.etsmtl.log720.lab1.InvalidIdException;
}
