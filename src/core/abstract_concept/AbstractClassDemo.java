package core.abstract_concept;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Student refV=new Student();
		refV.setAge(15);
		refV.setName("arjun");
		refV.setID(12);

		refV.getAge();
		refV.getName();
		refV.getID();
	}

}

/*It will be a prototype for all the real world object like student,teacher,sponser,etc*/
abstract class Person{
	String name;
	int age;
	String mobileNo;
	void setAge(int A) {
		age=A;
	}
	public void setName(String N) {
		name=N;
	}
	public void getName() {
		System.out.println("name: "+name);
	}
	public void getAge() {
		System.out.println("age: "+age);
	}
}

class Student extends Person{
	int id;
	void setID(int I) {
		id=I;
	}
	void getID() {
		System.out.println("id: "+id);
	}
}

