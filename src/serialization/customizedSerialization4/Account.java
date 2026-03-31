package serialization.customizedSerialization4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account {
	private static final String FILE_PATH= "src/serialization/customizedSerialization4/userDetails.txt";

	public static void main(String[] args) throws Exception{
		//Serialization Process
		FileOutputStream fos=new FileOutputStream(FILE_PATH);
		ObjectOutputStream ous=new ObjectOutputStream(fos);
		ous.writeObject(new User());
		
		//Deserialization Process
		FileInputStream fis=new FileInputStream(FILE_PATH);
		ObjectInputStream ois=new ObjectInputStream(fis);
		User user=(User)ois.readObject();
		user.getDetails();
	}

}
class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String username="user@xyz.com";
	private transient String password="password@123";
	
	/*Called at a time of serialization by the JVM*/
	private void writeObject(ObjectOutputStream ous) throws Exception {
		ous.defaultWriteObject();		//default serialization
		
		/*Extra things to do*/
		//Encrypting password
		String ePsw="@@@"+password;
		ous.writeObject(ePsw);
	}
	
	/*Called at a time of de-serialization by the JVM*/
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();		//default de-serialization
		
		/*Extra things to do*/
		String ePsw=(String)ois.readObject();
		password=ePsw.substring(3);
	}
	public void getDetails() {
		System.out.println("Username: "+username+" Password: "+password);
	}
}