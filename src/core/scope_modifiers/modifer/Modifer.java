package core.scope_modifiers.modifer;

import core.scope_modifiers.primeNo.CheckPrimeNo;

public class Modifer {
	
	public static void main(String[] args) {
		CheckPrimeNo ref= new CheckPrimeNo();
		ref.PrimeNo_Check(11);
		
		Second ref1= new Second();
		ref1.method();
	}

}
class First{
	protected int var;
	private void method() {
		System.out.println("Inside superclass");
	}
}
class Second extends First{
	protected void method() {
	/**
	 * private void method(){}
	 * Not accessible by other function like main().
	 */
		var=10;
		System.out.println("Inside subclass"+var);
	}
}