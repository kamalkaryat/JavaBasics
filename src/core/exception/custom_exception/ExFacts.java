package core.exception.custom_exception;
//Throwing 2 times the exception
/*public class ExFacts {
	static void Test() {
		
		try {
			throw new ArithmeticException("Throwing from Test()");
		}catch(ArithmeticException refV) {
			System.out.println("Caught 1st time : "+refV.getMessage());
			throw refV;
		}
	}
	public static void main(String[] args) {
		try {
			Test();
		}catch(ArithmeticException refV) {
			System.out.println("Caught 2nd Time: "+refV.getMessage());
		}
	}

}*/

//Nested try & catch
public class ExFacts {
	public static void main(String[] args) {
		int a=1,b=0;
		int[] arr= {1};
		arr[0]=1214;
		try {
			arr[0]=10;
			a=a/b;
			try {
				arr[10]=20;
			}//Inner Try
			catch(NullPointerException e) {
			//Inner catch
			}}//Outer Try
		catch(ArrayIndexOutOfBoundsException refV1) {
			System.out.println("Inner try-catch: ");
		}
		catch(ArithmeticException refV2) {
			System.out.println("ArrayIndexOutOfBound: Outer try-catch: ");
		}
	}
}