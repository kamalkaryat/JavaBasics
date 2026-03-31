package core.annotation;
//User-defined annotation 
@interface Author{
	String name();
	String date();
} 
//User defined annotation with default values.
@interface Author1{
	String name() default "kamal";
	String date() default "12/02/15";
}
public class AnnotationDemo {
	public static void main(String[] args) {
		//@NonNull String name;
		Child child = new Child();
		child.showData();
		//Deprecated annotation ex
		Tem tem= new Tem();//This class is deprecated so avoid it
		tem.depr();//This method is deprecated so avoid it
		
	}

}
class Parent{
	
	void showData() {
		System.out.println("In Parent class");
	}
}

/*Multiple annotation example*/
class Child extends Parent{
	@Override
	@SuppressWarnings("unchecked")
	void showData() {
		System.out.println("In Child class");
	}
}
@Deprecated
@SuppressWarnings({"unchecked","deprecation"})
class Tem{
	@Deprecated
	
	void depr() {
		System.out.println("This is a deprecated method");
	}
}


/*User defined annotation*/
class UserDefinedAnnot{
	@Author(name="kamal",date="15,02,2020")
	//We can also overwrite default values of Author1.
	@Author1
	void userDefined() {
		System.out.println("This is a user defined annotation");
	}
}