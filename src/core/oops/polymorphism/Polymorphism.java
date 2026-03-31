package core.oops.polymorphism;

class A{
	public void perimeter(int len,int brd) {//Rectangle
		int res=len+brd;
		System.out.println("Perimeter of Rectangle is: "+2*res);
	}  
}
class B extends A{
	public void perimeter(int side) {//Square
		System.out.println("Perimeter of Square is: "+4*side);
	}
}
/*Overriding eg*/
class C extends A{
	public void perimeter(int side1,int side2) {//Parallelogram
		int tem=side1+side2;
		System.out.println("Perimeter of //gram is: "+2*tem);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new B();
		obj.perimeter(10,15);//Overloading
		obj.perimeter(10);//Overloading
		C obj1=new C();
		obj.perimeter(12,13);//Overriding rectangle_perimeter with //gram_perimeter
	}
	
	

}
