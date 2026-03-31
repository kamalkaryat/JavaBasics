package junit.usecase_5;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static String truncate(String str, int maxLength) {
        if (str == null) return null;
        return str.length() <= maxLength ? str : str.substring(0, maxLength) + "...";
    }
}