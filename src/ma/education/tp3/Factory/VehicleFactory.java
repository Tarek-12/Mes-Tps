package ma.education.tp3.Factory;

public class VehicleFactory {
	int v;
	private static VehicleFactory instance;
	
	private VehicleFactory() {}

	public static VehicleFactory getInstance() {
		if(instance == null) instance = new VehicleFactory();
		return instance;
	}
	
	public Voiture tester(int v) {
		if(v < 80)
			return new PoidLourd();
		if(v >= 80 && v < 200)
			return new PoidLeger();
		if(v >= 200)
			return new Express();
		return null;
	}
}
