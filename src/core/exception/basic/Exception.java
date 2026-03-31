package core.exception.basic;

import java.io.IOException;
import java.util.Scanner;

class Banking{
	private float balance=0.0f;
	private int amount;
	private float TxnLimit_Remaining=0.0f;
	public void DisplayBalance() {
		System.out.println("Current balance is: "+balance);
	}
	public void Withdrawl() {
		/**
		 * Insufficient balance
		 * No money is available
		 * Reached to daily limit
		 * Money is not available either in 100s,500s & 2000s multiple
		 */
		int atmBalance=1000000;
		int Total_100_Note=1000;  //Rs 1,00,000
		int Total_500_Note=600;  //Rs 3,00,000
		int Total_2000_Note=300; //Rs 6,00,000
		int required_100;
		int required_500;
		int required_2000;
		System.out.println("Enter withdrawl amount: ");
		Scanner refV=new Scanner(System.in);
		amount=refV.nextInt();
		/*Calculating total notes required to withdraw*/
		required_2000=amount/2000;
		required_500=amount/500;
		required_100=amount/100;
		/*Exceptions*/
		if((amount+2000)>balance) {
			System.out.println("Insufficient Balance");
		}
		else if(amount<atmBalance) {
			System.out.println("Currently cash not avilable");
		}
		else if(amount>TxnLimit_Remaining) {
			System.out.println("Reached to dali limit");
		}
		/*else if() {
			
		}*/
	}
}
public class Exception {

	public static void main(String[] args){
		//Exception example
		/*String refV=null;
		System.out.println("Before exception");
		System.out.println("Res: "+(refV.length()));
		System.out.println("After exception");
		----------------------------------------
		//Explicit throw of exception
		ExplicitThrow refV=new ExplicitThrow();
		refV.withdrawl();
		-----------------------------------------*/
		ChceckException refV=new ChceckException();
		refV.checkedException();
	} 

}
