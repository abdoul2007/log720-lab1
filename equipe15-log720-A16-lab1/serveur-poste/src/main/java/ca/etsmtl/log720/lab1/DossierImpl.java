package ca.etsmtl.log720.lab1;

public class DossierImpl extends DossierPOA{
	final int NB_MAX = 100;
	private int id;
    private String nom;
    private String noPermis;
    private String noPlaque;
    private String prenom;
    private int niveau;
    private int[] listeInfraction;
    private int[] listeReaction;
	
    public int id() {
		// TODO Auto-generated method stub
		return id;
	}
	public String nom() {
		// TODO Auto-generated method stub
		return nom;
	}
	public String noPermis() {
		// TODO Auto-generated method stub
		return noPermis;
	}
	public String noPlaque() {
		// TODO Auto-generated method stub
		return noPlaque;
	}
	public String prenom() {
		// TODO Auto-generated method stub
		return prenom;
	}
	public int niveau() {
		// TODO Auto-generated method stub
		return niveau;
	}
	public int[] getListeInfraction() {
		// TODO Auto-generated method stub
		return listeInfraction;
	}
	public int[] getListeReaction() {
		// TODO Auto-generated method stub
		return listeReaction;
	}
	public void ajouterReactionAListe(int idReaction) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i <= NB_MAX){
			if(listeReaction[i]==0){
				listeInfraction[i]=idReaction;	
				break;
			}
			i++;			
		}		
	}
	
	public void ajouterInfractionAListe(int idInfraction) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i <= NB_MAX){
			if(listeInfraction[i]==0){
				listeInfraction[i]=idInfraction;	
				break;
			}
			i++;			
		}	
		
	}
	public String _toString() {
		// TODO Auto-generated method stub
		return null;
	}

}