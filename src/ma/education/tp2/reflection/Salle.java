package ma.education.tp2.reflection;

public class Salle {
	//Attribute
	protected long id; 
	protected String nom;
	//Constructors
	private Salle() {
		System.out.println("o1 instancie");
	}
	private Salle(String nom) { 
		this.nom = nom; 
		System.out.println("o2 instancie");
	}
	private Salle(long id, String nom) { 
		this.id = id;
		this.nom = nom;
		System.out.println("o3 instancie");
	}
	//Methods
	public void afficher() {}
	public void nbrEtudiant() {}
	//Initial Blocs
}
