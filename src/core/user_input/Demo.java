package core.user_input;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner refV=new Scanner(System.in);
        String name=refV.nextLine();
        System.out.println("Enter your age: ");
        Scanner refV1=new Scanner(System.in);
        short age=refV1.nextShort();
        System.out.println("Enter your percentage in last sem: ");
        float percentage=refV1.nextFloat();
        System.out.println("Are you male?(True/False): ");
        boolean genderType=refV1.hasNextBoolean();
        System.out.println("Enter your ID no: ");
        long id=refV1.nextLong();
        System.out.println("Enter your course name: ");
        String courseName=refV1.next();
        System.out.println("");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("percentage: "+percentage);
        System.out.println("Male: "+genderType);
        System.out.println("Id: "+id);
        System.out.println("Course name: "+courseName);

    }
}
