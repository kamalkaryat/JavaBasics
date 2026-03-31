package core.final_keyword;

public class Demo {
    private final int var;//instance member variable
    private static final int var1;
    static{
        var1=10;
    }
    {
        var=5;
    }

    	/*Initialization ways:
	1--->private final int var=5;
	2--->
	{
		var=5;
	}
	3--->Test(){ var=5}*/

    void display() {
        //var=1;Not possible
        System.out.println("Value of instance var: "+var);
    }
    static void display1() {
        System.out.println("Value of static var1: "+var1);
    }

    public static void main(String[] args) {
        Demo referenceVar=new Demo();
        referenceVar.display();
        display1();
    }
}
class first{
    final void fun() {
        System.out.println("Inside first class member fun");
    }
}
final class second extends first{

	/*void fun() {	Cannot override the fun() as it is constant
		System.out.println("Inside first class member fun");
	}*/
}

/*class third extends second{	second class cannot be inherited here

}*/