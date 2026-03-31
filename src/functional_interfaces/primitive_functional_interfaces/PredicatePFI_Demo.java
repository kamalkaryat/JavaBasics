package functional_interfaces.primitive_functional_interfaces;

import java.util.function.IntPredicate;

public class PredicatePFI_Demo {
	public static void main(String[] args) {
		
		/*
		 * JVM will do 7 time auto-boxing and auto-unboxing which
		 * will impact the performance that why Primitive Functional
		 * Interface concept is came existence
		 */
		
		//Predicate<Integer> predicate= n -> n%2==0;
		
		IntPredicate predicate= n -> n%2==0;
		
		int[] no= {0,5,10,15,20,25,30};
		
		for(int n: no) {
			if(predicate.test(n))
				System.out.print(n+" ");
		}
	}
}
