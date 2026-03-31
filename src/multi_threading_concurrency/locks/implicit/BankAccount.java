package multi_threading_concurrency.locks.implicit;

public class BankAccount {
    private int balance= 100;

    public synchronized void withdrawl(int amt){
        System.out.println(Thread.currentThread().getName()+": attempting to withdraw");
        if(amt<= balance){
            System.out.println(Thread.currentThread().getName()+": proceeding the withdrawal...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-= amt;
            System.out.println(Thread.currentThread().getName()+ ": balance after withdrawal: "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }
}
