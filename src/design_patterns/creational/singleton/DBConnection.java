package design_patterns.creational.singleton;

public class DBConnection {
    // Private static instance of the class
    private static DBConnection instance;

    // Private constructor to prevent instantiation from outside
    private DBConnection() {
        // Initialize database connection
    }

    // Public method to provide access to the instance
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    // Example method
    public void connect() {
        System.out.println("Connected to database");
    }
}