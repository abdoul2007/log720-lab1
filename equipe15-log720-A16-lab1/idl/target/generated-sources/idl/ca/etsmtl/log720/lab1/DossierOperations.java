package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "Dossier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface DossierOperations
{
	/* constants */
	/* operations  */
	int id();
	java.lang.String nom();
	java.lang.String noPermis();
	java.lang.String noPlaque();
	java.lang.String prenom();
	int niveau();
	int[] getListeInfraction();
	int[] getListeReaction();
	void ajouterReactionAListe(int idReaction);
	void ajouterInfractionAListe(int idInfraction);
	java.lang.String _toString();
}
