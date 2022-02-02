package ma.education.tp4.lambdaexp;

public class Test {
	public static void main(String[] args) {
		Consumer c = i-> System.out.println(i+"1");
		Supplier s = ()-> 5;
		Predicate p = i-> i==5;
		Function f = i-> "ABC"+i;
		
		c.accept("A");
		System.out.println(s.get());
		System.out.println(p.test(5));
		System.out.println(f.apply(6));
	}
}
