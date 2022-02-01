package ma.education.tp2.reflection.rappel;

public class ConnectionDB {
	String url, user, password;

	private ConnectionDB() {
		System.out.println("Instanciation par reflection");
	}

}
