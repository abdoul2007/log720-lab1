package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueInfractions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BanqueInfractionsOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionInfraction infractions();
	ca.etsmtl.log720.lab1.CollectionInfraction trouverInfractionsParDossier(ca.etsmtl.log720.lab1.Dossier mydossier);
	ca.etsmtl.log720.lab1.Infraction trouverInfractionParId(int idInfraction);
	void ajouterInfraction(java.lang.String description, int niveau) throws ca.etsmtl.log720.lab1.NiveauHorsBornesException;
}
