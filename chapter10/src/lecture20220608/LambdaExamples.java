package lecture20220608;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExamples {
	public static void main(String[] args) {
//		someThing.test(null); // -> false
//		someThing.test("Hello"); // -> true
//		
//		
//		doSomething.accept("Hello");
		
		

		// Person hat name und alter, zzgl. Konstruktor und Getter
//		Predicate<Person> alterCheck = (t) -> t.getAlter() > 18;
//		Consumer<Person> print = (v) -> System.out.println(v);
		
		List<Person> example = new ArrayList<>();
		example.add(new Person("Peter", 20));
		example.add(new Person("Maria", 32));
		example.add(new Person("...", 17));
		
		// iteration, die das predicate nutzt und mittels consumer ausgibt
		// wenn das predicate true liefert
		
//		for(Person p : example) {
//			if(alterCheck.test(p)) {
//				print.accept(p);
//			}
//		}
		
		LambdaExamples examples = new LambdaExamples();
		
		// Fancy Thing, nicht prüfungsrelevant :)
		examples.smffac(example, (p) -> p.getAlter() > 18, (p) -> System.out.println(p));
		examples.smffac(example, (p) -> p.getName().equals("Maria"), (p) -> System.out.println(p));
		
		examples.smffac2(example, (p) -> p.getAlter() > 18, (p) -> System.out.println(p));
		examples.smffac2(example, (p) -> p.getName().equals("Maria"), (p) -> System.out.println(p));
		
		
		// Stream-API-Example
		Stream<Person> stream = example.stream();
		Stream<Person> filteredStream = stream.filter((p) -> p.getAlter() > 18);
		filteredStream.forEach((p) -> System.out.println(p));
		
		example.stream().filter((p) -> 
			p.getAlter() > 18
		).forEach((p) -> System.out.println(p));
		
		
		
		example.stream().filter((p) -> p.getAlter() > 18).forEach(System.out::println);
		
	}
	
	// someMethodForFilterAndConsuming
	public <T> void smffac(List<T> list, Predicate<T> filter, Consumer<T> consumer) {
		for(T p : list) {
			if(filter.test(p)) {
				consumer.accept(p);
			}
		}
	}
	public void smffac2(List<Person> list, Predicate<Person> filter, Consumer<Person> consumer) {
		for(Person p : list) {
			if(filter.test(p)) {
				consumer.accept(p);
			}
		}
	}
	
	
	
	
	
}















