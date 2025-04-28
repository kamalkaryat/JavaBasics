package generics.problems1;

public class Problem_2 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);            //Storing
        String i = (String) box.getValue(); // EXCEPTION !!!
        System.out.println(i);
    }
}
