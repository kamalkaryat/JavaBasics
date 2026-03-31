package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("ab");
        Matcher matcher= pattern.matcher("ababbabab");
        int count= 0;

        while(matcher.find()){
            System.out.println(matcher.start());
            count++;
        }
        System.out.println("Total Occurrence: "+count);
    }
}
