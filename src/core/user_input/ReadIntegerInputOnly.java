package core.user_input;

import java.util.Scanner;

public class ReadIntegerInputOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Invalid input");
        }
        int num1 = sc.nextInt();
        System.out.println("Number is: "+num1);

    }
}
