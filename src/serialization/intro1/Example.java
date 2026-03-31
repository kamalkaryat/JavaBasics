package serialization.intro1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example {

	private static final String FILE_PATH="src/serialization/intro1/file.ser";

	public static void main(String[] args) throws Exception {
		/*Serialization*/
		FileOutputStream fos= new FileOutputStream(FILE_PATH);
		ObjectOutputStream ous= new ObjectOutputStream(fos);
		ous.writeObject(new Dog());

		fos.close();
		ous.close();

		/*De-Serialization*/
		FileInputStream fis=new FileInputStream(FILE_PATH);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog dog=(Dog)ois.readObject();
		
		dog.display();

		fis.close();
		ois.close();
	}

}

/**
 * Stabilizability of a class is enabled by implementing the
 * java.io.Serializable interface
 */
class Dog implements Serializable{
	private int a=5;
	private int b=10;
	public void display() {
		System.out.println("Value of a: "+a+" & b: "+b);
	}
}
