package ma.education.tp2.statickeyword;

public class Etudiant {
	long id;
	String nom;
	static int nbrEtd;
	
	public Etudiant(long id, String nom, int nbr) {
		this.id = id;
		this.nom = nom;
		nbrEtd += nbr;
	}
}
