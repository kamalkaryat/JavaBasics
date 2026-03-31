package functional_interfaces.primitive_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumersDemo {

	public static void main(String[] args) {
		Student[] students= {
				new Student(1, "abc", 65.3),
				new Student(2, "xyz", 45.3),
				new Student(3, "pqr", 25.0),
				new Student(4, "stu", 75.9),
				new Student(5, "mno", 90.0),
				new Student(6, "fje", 75.6),
				new Student(7, "adf", 54.8),
				new Student(8, "ted", 55.7),
				new Student(9, "gse", 35.0),
		};
		
		Predicate<Student> predicate= p -> p.marks >= 60;
		
		Function<Student, String> function= s -> {
			String grade= "";
			double marks= s.marks;
			
			if(s.marks >= 80) grade="A";
			else if(marks >= 70) grade="B";
			else if(marks >= 60) grade="C";
			else if(marks > 33) grade="D";
			else grade="Fail";
			
			return grade;
		};
		
		Consumer<Student> c= s -> {
			System.out.print("Id: "+s.id+" Name: "+s.name+" Marks: "+
					s.marks+" Grade: "+function.apply(s));
		};
		
		for(Student s: students) {
			if(predicate.test(s))
				c.accept(s);
		}
	}

}

class Student{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}