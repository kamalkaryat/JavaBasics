package core.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(true) {
            System.out.println("Enter text: ");
            String text= s.nextLine();

            System.out.println("isValid: "+isValidField(text));
            System.out.println("y/n: ");
            char c= s.next().charAt(0);
            s.nextLine();
            if(c=='n' || c=='N')
                break;
        }
        s.close();
    }

    private static boolean isValidField(String text) {
        /**
         * psw pattern
         * 1- lower case
         * 1- upper case
         * 1- no
         * 1- special symbol
         * minLen= 6, maxLen= 10
         */
        String pswPattern= "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%*&?])[a-zA-Z0-9!@#$%&*?]{6,10}$";

        /**
         * Mobile No pattern
         * first digit between 6 to 9
         * length= 10
         */
        String mobileNoPattern= "[6-9]{1}[0-9]{9}$";

        /**
         * Name pattern
         * may be alphanumeric
         * may contain space
         * minLen= 5
         */
        String namePtrn= "[\\w][\\w+\\s]{5,}";
        String p2= "[a-zA-Z][a-zA-Z0-9_\\s]{5,}";

        return text.matches(namePtrn);
    }
}

