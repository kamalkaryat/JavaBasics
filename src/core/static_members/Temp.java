package core.static_members;

class Inheritence_SM {
	static int var=5;
	public static void fun() {
		System.out.println("In static member of superclass");
		System.out.println("value of sucperclass static variable: "+var);
	}
}

class Temp extends Inheritence_SM{
	//Hiding of superclass function 
	static{
		var=10;
	}
	public static void fun() {
		System.out.println("In static member of subclass");
	}
}
