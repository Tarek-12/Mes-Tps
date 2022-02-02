package ma.education.tp3.Factory;

public class Jeu {
	public static void main(String[] args) {
		VehicleFactory vf = VehicleFactory.getInstance();
		Voiture v = vf.tester(300);
		v.afficher();
	}
}
