package functional_interfaces.primitive_functional_interfaces;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s= () -> {
			StringBuilder sb= new StringBuilder();
			for(int i=0; i<6; i++)
				sb.append((int)(Math.random()*10));
			return sb.toString();
		};
		
		System.out.println(s.get());
	}

}
