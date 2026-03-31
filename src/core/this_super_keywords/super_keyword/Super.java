package core.this_super_keywords.super_keyword;
class A{
	int var;
	void fun() {
		System.out.println("In superclass");
	}
}
class B extends A{
	void fun() {
		super.fun();
	}
	int var;
	void fun1() {
		int var;
		super.var=10;
		this.var=15;
		var=5;
		System.out.println("superclass variable: "+super.var+"instance variable: "+this.var+"local varible: "+var);
	}
}
public class Super {

	public static void main(String[] args) {
		B refV=new B();
		refV.fun1();
		
	}

}
