package core.this_super_keywords.this_keyword;


public class This {
	private int l,b,h;
	This(int l,int b,int h){
		/*1st use of this*/
		this.l=l;
		this.b=b;
		this.h=h;
		System.out.println("1nd use of this");
	}
	/*2nd use of this*/
	This fun() {
		System.out.println("2nd use of this");
		return(this);
	}
	public static void main(String[] args) {
		This obj=new This(5,10,15);
		This obj2=obj.fun();
		System.out.println("l="+obj.l+"b="+obj2.b+"h="+obj2.h);/*here instance varivable's value is copied in anohter 
		instance variable*/
	}

}
