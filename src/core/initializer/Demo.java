package core.initializer;

public class Demo {
	private int var1;
	private static int var2;

	{
		System.out.println("Value of var1[instance initializer block]= "+var1);
		var1=5;
	}
	
	public Demo() {
		System.out.println("Value of var1[constructor block]= "+var1);
	}
	/*Initialization block for the static members*/
	static{
		System.out.println("Value of var2[static initializer block]= "+var2);
		var2=5;
	}
	public static void main(String[] args) {
		Demo obj1=new Demo();
		Demo obj2=new Demo();
	}

}
