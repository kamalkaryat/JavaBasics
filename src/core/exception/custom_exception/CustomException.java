package core.exception.custom_exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		int age;
		Scanner read= new Scanner(System.in);
		System.out.println("Enter age: ");
		age= read.nextInt();
		try {
			if(age<18)
				throw new MyException("Age must be greater than 18");
		}catch(MyException e) {
			System.out.println(e);
		}
		System.out.println("Age entered by user is: "+age);
	}
}
class MyException extends Exception{
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
}
