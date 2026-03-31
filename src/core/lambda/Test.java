package core.lambda;

public class Test {
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Test test=new Test();
//		test.greet(new DoSomething());
//					OR
//		Greeting greeting=new Greeting() {
//			
//			@Override
//			public void perform() {
//				System.out.println("Welcome Viewers");
//			}
//		};
//					OR
		Greeting greeting=()->System.out.println("Welcome Viewers");
		test.greet(greeting);
	}
}

interface Greeting{
	void perform();
}
class DoSomething implements Greeting{

	@Override
	public void perform() {
		System.out.println("Welcome Viewers");
	}
	
}