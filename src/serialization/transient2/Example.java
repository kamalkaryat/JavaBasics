package serialization.transient2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example {

	private static final String FILE_PATH= "src/serialization/transient2/file.ser";

	public static void main(String[] args) throws Exception{
		/*Serialization*/
		FileOutputStream fos= new FileOutputStream(FILE_PATH);
		ObjectOutputStream ous= new ObjectOutputStream(fos);
		ous.writeObject(new Dog());
		
		/*De-serialization*/
		FileInputStream fis=new FileInputStream(FILE_PATH);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog dog=(Dog)ois.readObject();
		
		dog.display();
	}

}
/**
 * Serializability of a class is enabled by implementing the
 *  java.io.Serializable interface
 */
class Dog implements Serializable{
	private int a=5;
	transient private int b=10;
	transient static private int c;
	transient private  String name="Kamal";
	public void display() {
		System.out.println("Value of a[Instance variable]: "+a);
		System.out.println("Variable declared as Transient");
		System.out.println("Value of b[Instance variable]: "+b);
		System.out.println("Value of c[Static variable]: "+c);
		System.out.println("Value of name[Final variable]: "+name);
	}
}
