package ma.education.tp3.singleton;

public class Terre {
	double distanceSoleil;
	double surface;
	private static Terre instance;
	
	private Terre(double distanceSoleil, double surface) {
		this.distanceSoleil = distanceSoleil;
		this.surface = surface;
	}
	
	public static Terre getInstance(double distanceSoleil, double surface) {
		if(instance == null)
			instance = new Terre(distanceSoleil, surface);
		return instance;
	}
	
}
