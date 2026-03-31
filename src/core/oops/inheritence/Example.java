package core.oops.inheritence;

public class Example{
	public static void main(String[] args){
		CricketPlayer obj=new CricketPlayer();
		obj.setAge(30);
		obj.setName("Rohit Sharma");
		obj.setNationality("Indian");
		obj.setSalary("11.2 Crores");
		//obj.setGrade('A');
		obj.setCategory("Cricketer");
		obj.setPlayerType("Skiper");
		obj.setBattingAvg(48.2f);
		obj.setBowlingAvg(80.5f);
		obj.setGender("Male");

		System.out.println("Player Information :");
		System.out.println("Personal Info: ");
		obj.getName();
		obj.getAge();
		obj.getGender();
		obj.getNationality();
		System.out.println("Professional Info: ");
		obj.getCategory();
		obj.getPlayerType();
		
		//obj.getGrade();		
		obj.getBattingAvg();
		obj.getBowlingAvg();
		obj.getSalary();
	}
}