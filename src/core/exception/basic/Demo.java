package core.exception.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws IOException , ArithmeticException{
		int res=0,n1=10,n2;
		try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter a no: ");
			n2= Integer.parseInt(br.readLine());
			res= n1 / n2;
		}
		System.out.println("After Try Block");
		System.out.println("Result: "+res);
	}
}
