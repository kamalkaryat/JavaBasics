package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		SingleIorOFunctionalInterfaces features= new SingleIorOFunctionalInterfaces();
		//features.predicatesDemo();
		features.functionDemo();
		//features.consumerDemo();
		//features.supplierDemo();
		//features.combinedDemo();
		
		//DoubleIorOFunctionalInterfaces moreFeatures= new DoubleIorOFunctionalInterfaces();
		//moreFeatures.demo();
		//moreFeatures.functionSimplification();
	}
}

class SingleIorOFunctionalInterfaces{
	//Predicate- Test Condition
	public void predicatesDemo() {
		Predicate<Integer> predicate= n -> n%2==0;
		System.out.println("Even condition: "+predicate.test(4));
	}

	//Function- Take I/P & provide O/P
	public void functionDemo() {
		Function<Integer, Integer> doubleIt= n -> 2*n;
		Function<Integer, Integer> tripleIt= n -> 3*n;
		
		System.out.println("andThen: "+doubleIt.andThen(tripleIt).apply(10));
		//OR
		System.out.println("compose: "+doubleIt.compose(tripleIt).apply(20));
		
	}
	
	//Consumer- Take only I/P
	public void consumerDemo() {
		List<String> list= Arrays.asList("Mango", "Apple", "Pineapple" ,"Pomegranate",
				"DragaonFruit", "Litchi", "Papaya", "Banana", "Cherry", "Grapes");
		
		Consumer<List<String>> print= fruits -> {
			fruits.stream()
			.sorted()
			.forEach(System.out::println);
		};
		
		print.accept(list);
	}
	
	//Supplier- Provide only O/P
	public void supplierDemo() {
		Supplier<String> source= () -> "Learning Java8 Functional Interfaces";
		System.out.println(source.get());
	}
	
	//Combined
	public void combinedDemo() {
		Supplier<List<String>> source= ()-> Arrays.asList("Mango", "Apple", "Pineapple" ,"Pomegranate",
				"DragaonFruit", "Litchi", "Papaya", "Banana", "Cherry", "Grapes");
		
		Predicate<List<String>> isValidString= list -> 
				list.stream().allMatch(name -> name.trim().length() > 3);
				
		Function<List<String>, List<String>> filterFruits= fruits -> fruits.stream()
					.filter(name -> name.endsWith("e"))
					.collect(Collectors.toList());
		
		Consumer<List<String>> print= fruits -> fruits.forEach(System.out::println);
		
		if(!isValidString.test(source.get())) {
			System.out.println("Invalid Strings!!");
			return;
		}
		print.accept(filterFruits.apply(source.get()));
	}

}

class DoubleIorOFunctionalInterfaces{
	//Bi-Predicate
	//Bi-Consumer
	//Bi-Function
	
	public void demo() {
		BiPredicate<Integer, Integer> isSumEven= (n1, n2) -> (n1+n2)%2 == 0;
		System.out.println("Bi-Predicate[1+2 is even?]: "+ isSumEven.test(1, 2));
		
		//param1- I/P1, param2- I/P2, param3- ReturnType
		BiFunction<Integer, Integer, Integer> sum= (n1, n2) -> n1+n2;
		System.out.println("Bi-Functional[3 + 5]: "+sum.apply(3, 5));
		
		BiConsumer<Integer, String> display= (id, name) ->{
			System.out.println("Id: "+id+" Name: "+name);
		};
		display.accept(1234, "John");
	}
	
	public void functionSimplification() {
		Function<Integer, Integer> square= n -> n*n;
		//OR
		UnaryOperator<Integer> square1= n -> n*n;
		System.out.println("square: "+square1.apply(5));
		
		BiFunction<Integer, Integer, Integer> sum= (n1, n2) -> n1 + n2;
		//OR
		BinaryOperator<Integer> sum1= (n1, n2) -> n1 + n2;
		System.out.println("10+15: "+sum1.apply(10, 15));
		
		
	}
}