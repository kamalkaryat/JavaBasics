package core.static_members;

public class StaticMemb {
	int var1=50;
	static int var2=100;
	void fun1() {
		System.out.println("Value of int var1: "+var1+"Value of static int var2: "+var2);
	}
	static void fun2() {
		System.out.println("Value of static int var2: "+var2);
	}
	
	
	static class Test1{
		static void fun3() {
			System.out.println("Value of static int var2: "+var2);
		}
	}
	
	public static void main(String args[]) {
		Test1.fun3();//Local members
		/*Members of other class*/
		Eg.fun5();
		Eg.Ex.fun4();
		
		/*static members in inheritance*/
		System.out.println("value of static variabl is: "+Temp.var);
		
	}

}

/*New class*/
class Eg{
	static int var3=30;
	int var4=40;
	static class Ex{
		public static void fun4() {
			System.out.println("Value of var3(inside Ex class): "+var3);
		}
	}
	public static void fun5() {
		System.out.println("Value of var3: "+var3);
	}
	public void fun6() {
		System.out.println("Value of var3: "+var3+"Value of var1: "+var4);
	}
	
}