package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation3 {

	public static void main(String[] args) {
		//TerminalOpDemo.collectDemo();
		//TerminalOpDemo.forEachDemo();
		//TerminalOpDemo.reduceDemo();
		//TerminalOpDemo.xxxxMatchDemo();
		//TerminalOpDemo.findXXXXDemo();
		//TerminalOpDemo.usecases();
		//TerminalOpDemo.charStreamDemo();
		//TerminalOpDemo.toArrayDemo();
		//TerminalOpDemo.minOrMaxDemo();
		//TerminalOpDemo.streamNotReusedPostTerminalOpIsCalledDemo();
		TerminalOpDemo.forEachOrderedDemo();
	}

}
class TerminalOpDemo{
	private static List<Integer> noList= Arrays.asList(1,2,3,4,5,6);
	private static List<String> nameList= Arrays.asList("Bob", "Anna", "John", "David");
	
	public static void collectDemo() {
		//List<Integer> updatedList= list.stream().skip(1).collect(Collectors.toList());
		//OR
		List<Integer> updatedList= noList.stream().skip(1).toList();
		System.out.println(updatedList);
	}


	public static void xxxxMatchDemo() {
		noList.forEach(System.out::println);
		boolean isAleastOneEvenNoPresnet=noList.stream().anyMatch(n -> n%2==0);
		System.out.println("Is Atleast One Even No Present: "+isAleastOneEvenNoPresnet);
		
		boolean areAllGT1 =noList.stream().allMatch(n -> n>1);
		System.out.println("Are All Greater Than 1: "+areAllGT1);
		
		boolean allPositiveNo =noList.stream().noneMatch(n -> n<0);
		System.out.println("Are All +ve No: "+allPositiveNo);
	}

	public static void findXXXXDemo() {
		noList.forEach(System.out::println);
		Optional<Integer> firstElement=noList.stream().findFirst();
		System.out.println("Fist Element: "+firstElement.get());
		
		Optional<Integer> anyElement= noList.stream().findAny();
		System.out.println("Any Element: "+anyElement.get());
	}
	public static void forEachDemo() {
		noList.forEach(n -> System.out.println(n));
		//OR
		//list.forEach(System.out::println);
	}
 
	public static void reduceDemo() {
		//Optional<Integer> res =list.stream().reduce((n1, n2) -> n1+n2);
		//OR
		Optional<Integer> res= noList.stream().reduce(Integer::sum);
		System.out.println("Sum of all elements in list: "+res.get());
	}
	
	public static void usecases() {
		List<Integer> squaredAndSortedList= noList.stream()
				.map(n -> n*n).sorted().collect(Collectors.toList());

		System.out.println(noList);
		System.out.println("After Squaring & Sorting Elements are: ");
		System.out.println(squaredAndSortedList);
	}

	public static void charStreamDemo() {
		String text= "Process finished with exit code";
		int wordsWithI= (int) text.chars().filter(x -> x=='i').count();
		System.out.println("Total Occurrence of 'i': "+wordsWithI);


	}

	public static void toArrayDemo() {
		Object[] arr= Stream.of(1,2,3,4,5,7).toArray();
		for(Object o: arr)
			System.out.println((int)o);
	}

	public static void minOrMaxDemo() {
		//Using Natural Ordering
		Optional<Integer> max= Stream.of(1,2,234, 45,245).max(Comparator.naturalOrder());
		//OR
		//Optional<Integer> max= Stream.of(1,2,234, 45,245).max((x, y) -> x -y);
		System.out.println("Max: "+max.get());

		Optional<Integer> min= Stream.of(1,2,234, 45,245).min(Comparator.naturalOrder());
		System.out.println("Min: "+min.get());
	}

	public static void streamNotReusedPostTerminalOpIsCalledDemo() {
		Stream<String> nameStream = nameList.stream();
		nameStream.forEach(System.out::println);

		List<String> updatedNameList = nameStream.map(String::toUpperCase).toList();
		System.out.println(updatedNameList);
	}

	public static void forEachOrderedDemo() {
		Stream<Integer> noParallelStream = noList.parallelStream();
		System.out.println("Problem With ParallelStream when using forEach()");
		noParallelStream.forEach(System.out::println);

		System.out.println("Solution: Using forEachOrdered()");
		Stream<Integer> noParallelStream2 = noList.parallelStream();
		noParallelStream2.forEachOrdered(System.out::println);

	}
}