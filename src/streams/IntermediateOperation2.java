package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation2 {

	public static void main(String[] args) {
	//	IntermediateOps.filterDemo();
		//IntermediateOps.mapDemo();
		//IntermediateOps.sortedDemo();
		//IntermediateOps.distinctDemo();
		//IntermediateOps.limitDemo();
		//IntermediateOps.skipDemo();
		//IntermediateOps.peekDemo();
		IntermediateOps.flatMapDemo();
	}

}

class IntermediateOps{
	private static List<String> list= Arrays.asList("Mango", "Apple", "Pineapple" ,"Pomegranate",
			"DragaonFruit", "Litchi", "Papaya", "Banana", "Cherry", "Grapes", "Mango", "Apple", "Banana");
	
	public static void filterDemo() {
		Stream<String> filteredStream =list.stream().filter(f -> f.endsWith("e"));
		//no filtering at this point
		
		int count= (int) filteredStream.count();	//now filter() is executed, as terminal method is invoked
		System.out.println("Total Fruit Name End With e: "+count);
	}

	public static void mapDemo() {
//		Stream<String> uppercaseFruitNameStream= list.stream().map(f -> f.toUpperCase());
		Stream<String> uppercaseFruitNameStream= list.stream().map(String::toUpperCase);
		String res= uppercaseFruitNameStream.collect(Collectors.joining(" | "));
		System.out.println(res);
	}
	
	public static void sortedDemo() {
		Consumer<Stream<String>> listPrinter= fruits ->{
			String res= fruits.collect(Collectors.joining(" | "));
			System.out.println(res);
		};
		
		Stream<String> sortedStream= list.stream().sorted();
		listPrinter.accept(sortedStream);

		System.out.println("---Using Custom Comparator-----------");
		
		Stream<String> sortedStreamUsingComparator= list.stream().sorted((name1, name2) -> name1.length() - name2.length());
		listPrinter.accept(sortedStreamUsingComparator);
	}

	public static void distinctDemo() {
		System.out.println("Distinct Fruits are: "+list.stream().distinct().count());
	}
	
	public static void limitDemo() {
		System.out.println("Total Elements in a Stream from 1-100: "+Stream.iterate(1, n -> n+1).limit(100).count());
	}

	public static void skipDemo() {
		//Skip 10 elements from a Stream of 100 elements
		System.out.println("Total Element in Stream after skipping first 10 elements: "+Stream.iterate(1, n -> n+1).limit(100).skip(10).count());
		
		//Skip 10 elements from a Infinite Stream & post that put limit of 100
		System.out.println("Total Element in Stream after skipping first 10 elements: "+Stream.iterate(1, n -> n+1).skip(10).limit(100).count());
	}

	public static void peekDemo() {
		list.stream().filter(x -> x.endsWith("e")).peek(System.out::println).count();
	}

	public static void flatMapDemo() {
		List<List<String>> listOfList= Arrays.asList(
				Arrays.asList("apple", "mango"),
				Arrays.asList("pineapple", "litchi"),
				Arrays.asList("orange", "grapes", "cheery")
		);

		List<String> flatMapList= listOfList.stream().flatMap(Collection::stream)
				.map(String::toUpperCase).toList();
		System.out.println(flatMapList);

		List<String> sentence= Arrays.asList(
				"hello world",
				"java streams are very powerful",
				"flatmap reduce the dimension of a list"
		);

		List<String> flatSentenceList=sentence.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))
						.map(String::toUpperCase).toList();
		System.out.println(flatSentenceList);
	}
}
