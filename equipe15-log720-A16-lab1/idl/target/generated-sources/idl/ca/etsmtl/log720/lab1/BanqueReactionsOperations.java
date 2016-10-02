package ca.etsmtl.log720.lab1;

/**
 *	Generated from IDL interface "BanqueReactions"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BanqueReactionsOperations
{
	/* constants */
	/* operations  */
	ca.etsmtl.log720.lab1.CollectionReaction reactions();
	void ajouterReaction(java.lang.String reaction, int gravite);
	ca.etsmtl.log720.lab1.CollectionReaction trouverReactionsParDossier(ca.etsmtl.log720.lab1.Dossier myDossier);
	ca.etsmtl.log720.lab1.Reaction trouverReactionParId(int idReaction);
}
