package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation1 {

	public static void main(String[] args) {
		new StreamCreationDemo().create();
	}

}
class StreamCreationDemo{
	public void create() {
		//1- collection
		List<Integer> list= Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> s1= list.stream();		//stream of integer
		
		//2- From Array
		String[] arr= {"a", "b", "c", "d"};
		Stream<String> s2= Arrays.stream(arr);		//stream of string arr
		
		//3- Using Stream.of()
		Stream<String> s3= Stream.of("abc", "xyz", "pqr");		//stream of string
		
		//4- Using Generate
		Stream<Integer> s4= Stream.generate(() -> 1);		//infinite stream which contains 1
		
		//5- Using Iterate
		Stream<Integer> s5_1= Stream.iterate(1, n -> n+1);	//infinite stream contains 1, 2, 3, .....
		//OR
		Stream<Integer> s5_2= Stream.iterate(1, n -> n+1).limit(100);
		s5_2.forEach(System.out::println);
	}
}