package generics.problems1.solutions;

public class Solution_2 {
    public static void main(String[] args) {

        //String Box
        Box<String> box = new Box<>();
        box.setValue("Generics");            //Store only Strings
        String i = box.getValue(); // No Error
        System.out.println(i);

        //Integer Box
        Box<Integer> intBox= new Box<>();
        intBox.setValue(11);
        int intVal= intBox.getValue();
        System.out.println(intVal);

    }
}
