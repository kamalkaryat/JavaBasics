package core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intro {

    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("ab");
        Matcher matcher= pattern.matcher("ababbabab");
        int totalOcc=0;
        while(matcher.find()) {
            totalOcc++;
            System.out.println(matcher.start());
        }
        System.out.println("Total occurrence: "+totalOcc);
    }

}

