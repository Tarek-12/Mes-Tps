package ma.education.tp4.abstractkeyword;

public abstract class FormeGeometrique {
	double surface;
	
	public abstract double calculerSurface();
	public void afficherSurface() {
		System.out.println(this.surface);
	}
}
