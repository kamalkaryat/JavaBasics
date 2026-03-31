package functional_interfaces.primitive_functional_interfaces;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FunctionPFI_Demo {
	public static void main(String[] args) {
		String name= "Kamal Singh";
		//Problem: auto-boxing & auto-unboxing problem
		/*
		Function<String, Integer> function= s -> s.length();
		System.out.println("Length of "+name+" is: "+function.apply(name));
		*/
		
		ToIntFunction<String> function= s -> s.length();
		System.out.println("Length of "+name+" is: "+function.applyAsInt(name));
		
		//Input & output are both same
		//Function<Integer, Integer> square= n -> n*n;
		
		UnaryOperator<Integer> sq= n -> n*n;
		System.out.println("Square is: "+sq.apply(3));
		
	}
}
