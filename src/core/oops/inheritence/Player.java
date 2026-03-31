package core.oops.inheritence;

public class Player{
	private int age;
	private String gender;
	private String name;
	private String nationality;
	private String salary;
	public void setAge(int age){
       this.age=age;

	}
	public void setGender(String gender){
       this.gender=gender;

	}
	public void setName(String name){
       this.name=name;

	}
	public void setNationality(String nationality){
       this.nationality=nationality;
	}
	public void setSalary(String salary){
       this.salary=salary;

	}

	public void getName(){
    	System.out.println("Name: "+name);
	}
	public void getGender(){
    	System.out.println("Gender: "+gender);
	}
	
	public void getNationality(){
    	System.out.println("Nationality: "+nationality);
	}
	public void getAge(){
    	System.out.println("Age: "+age);
	}
	public void getSalary(){
    	System.out.println("Salary: "+salary);
	}
}