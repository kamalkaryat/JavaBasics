package serialization.parentSerializable5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Inheritance in serialization
 * Case 1: What happen if Parent class is serializable but child is not
 */
public class Test {
	private static final String FILE_PATH= "src/serialization/parentSerializable5/account.txt";

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream(FILE_PATH);
		ObjectOutputStream ous=new ObjectOutputStream(fos);
		ous.writeObject(new SavingAccount());
		
		FileInputStream fis=new FileInputStream(FILE_PATH);
		ObjectInputStream ois=new ObjectInputStream(fis);
		SavingAccount sa=(SavingAccount)ois.readObject();
		
		System.out.println(sa);
	}

}
class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String accNo="12345678901";
	protected String c_name="abcdef";
}
class SavingAccount extends Account{
	private static final long serialVersionUID = 1L;
	private int wdt_limit=40000;
	private int trns_limit=200000;
	@Override
	public String toString() {
		return c_name+"-"+accNo+"-"+wdt_limit+"-"+trns_limit;
	}
}
