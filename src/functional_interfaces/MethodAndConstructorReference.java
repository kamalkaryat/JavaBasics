package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodAndConstructorReference {
	public static void main(String[] args) {
		References ref= new References();
		//ref.methodReference();
		ref.constructorReference();
	}

}

class References{
	private List<String> source=Arrays.asList("Mango", "Apple", "Pineapple" ,"Pomegranate",
			"DragaonFruit", "Litchi", "Papaya", "Banana", "Cherry", "Grapes");
	public void methodReference() {
		//source.forEach(f -> System.out.println(f));
		//OR
		source.forEach(System.out::println);			//Method Reference
	}
	
	public void constructorReference() {
		List<Fruit> cr= source.stream().map(Fruit::new).collect(Collectors.toList());
		cr.forEach(System.out::println);
	}
}
class Fruit{
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
}