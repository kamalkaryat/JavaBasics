package multi_threading_concurrency.locks.implicit;

public class App {
    public static void main(String[] args) {
        BankAccount account= new BankAccount();

        Thread accHolder1= new Thread(() -> account.withdrawl(50), "AccHolder1");
        Thread accHolder2= new Thread(() -> account.withdrawl(80), "AccHolder2");

        accHolder1.start();
        accHolder2.start();

    }
}
