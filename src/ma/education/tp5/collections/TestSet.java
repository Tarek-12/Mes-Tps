package ma.education.tp5.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		// Les doublons n'existent pas, l'ordre n'est pas respecter
		set1.forEach(i-> System.out.println(i));
		
		Set<Client> set2 = new HashSet<Client>();
		set2.add(new Client(1,"ALAMI"));
		set2.add(new Client(1,"ALAMI"));
		set2.add(new Client(2,"SOUHAIL"));
		// HashSet se base sur hashCode() et equals() pour la definition des doublons
		set2.forEach(i-> System.out.println(i));
	}
}
