package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		
		ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.param");
		String value = rb.getString("key1");
		Class<?> c = Class.forName(value);
		Constructor<?>[] cons= c.getDeclaredConstructors();
		for(Constructor<?> cs: cons) {
			switch (cs.getParameterCount()) {
			case 0:
				cs.setAccessible(true);
				cs.newInstance(null);
				break;
			case 1:
				cs.setAccessible(true);
				cs.newInstance("Salle Informatique");
				break;
			case 2:
				cs.setAccessible(true);
				cs.newInstance(2, "Salle des cours");
				break;
			default:
				break;
			}
		}
	}
}
