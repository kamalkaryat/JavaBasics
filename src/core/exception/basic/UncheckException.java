package core.exception.basic;

public class UncheckException {
	private int balance=5000;
	private int wtdlAmount=6000;
	void withdrawl() {
		System.out.println("Before exception");
		try {
			if(wtdlAmount>balance) 
				throw new ArithmeticException("Insufficeient balance");	//Explicit throw of exception
			System.out.println("After exception");
		}
		catch(ArithmeticException e){
			System.out.println("Exception occured is: "+e.getMessage());
		}
		System.out.println("exception has handled");
	}
}