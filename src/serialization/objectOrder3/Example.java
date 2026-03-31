package serialization.objectOrder3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example {

	private static final String FILE_PATH= "src/serialization/objectOrder3/file.ser";

	public static void main(String[] args) throws Exception {
		/*Serialization*/
		FileOutputStream fos= new FileOutputStream(FILE_PATH);
		ObjectOutputStream ous= new ObjectOutputStream(fos);
		ous.writeObject(new Tiger());
		ous.writeObject(new Lion());
		ous.writeObject(new Elephant());
		
		/*De-serialization*/
		FileInputStream fis=new FileInputStream(FILE_PATH);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		
		if(o instanceof Tiger) {
			Tiger tiger=(Tiger)o;
			tiger.tigerM();
		}
		if(o instanceof Lion) {
			Lion lion=(Lion)o;
			lion.lionrM();
		}
		if(o instanceof Elephant){
			Elephant elephant=(Elephant)o;
			elephant.elephantM();
		}
	}

}

/**
 * Stabilizability of a class is enabled by the class implementing the
 * java.io.Serializable interface
 */
class Tiger implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public void tigerM() {
		System.out.println("Hey I am a Tiger");
	}
}
class Lion implements Serializable{
	
	private static final long serialVersionUID = 2L;

	public void lionrM() {
		System.out.println("Hey I am a Lion");
	}
}
class Elephant implements Serializable{
	
	private static final long serialVersionUID = 3L;

	public void elephantM() {
		System.out.println("Hey I am a Elephant");
	}
}