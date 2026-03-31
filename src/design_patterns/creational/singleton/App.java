package design_patterns.creational.singleton;

public class App {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();

        db1.connect();
        System.out.println(db1 == db2); // true - same instance
    }
}
