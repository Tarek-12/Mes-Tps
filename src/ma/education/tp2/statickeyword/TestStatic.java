package ma.education.tp2.statickeyword;

public class TestStatic {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1L, "AHMED", 20);
		Etudiant e2 = new Etudiant(2L, "SAID", 30);
		
		System.out.println(e1.id+" "+e1.nom);
		System.out.println(e2.id+" "+e2.nom);
		System.out.println(Etudiant.nbrEtd);
	}
}
