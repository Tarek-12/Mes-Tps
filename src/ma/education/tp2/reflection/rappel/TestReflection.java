package ma.education.tp2.reflection.rappel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflection {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Lecture des fichiers param�tres
		ResourceBundle rb = ResourceBundle.getBundle("ma.education.ma.education.tp2.reflection.rappel.param");
		String value = rb.getString("keyClass1");
		// Convert String type to Class type
		@SuppressWarnings("rawtypes")
		Class c = Class.forName(value);
		// Tableau pour les constructeurs de la classe ConnectionDB
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = c.getDeclaredConstructors();
		// Modification de la visibilite du premier constructeur
		constructors[0].setAccessible(true);
		// Instanciation de l'Objet (o) par reflexion
		@SuppressWarnings("unused")
		Object o = constructors[0].newInstance(null);
	}
}
