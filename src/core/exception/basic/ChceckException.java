package core.exception.basic;

import java.io.IOException;

public class ChceckException{
	void checkedException(){
		try{
			throw new IOException();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
			//Default catch block will triggered
		//System.out.println("After the exception");
	}
}
