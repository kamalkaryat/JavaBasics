package multi_threading_concurrency.locks.explicit;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance= 100;
    private final Lock lock= new ReentrantLock();

    public void withdrawal(int amt){
        System.out.println("-----Explicit Locking-----------");
        System.out.println(Thread.currentThread().getName()+": attempting to withdraw");
        try {

            //lock.lock()                   - Wait until thread doesn't get the lock

            //Try to acquire the lock within 1ms
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {        //If current thread get the lock then only it further execute
                if (amt <= balance) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": proceeding the withdrawal...");
                        Thread.sleep(2000);
                        balance -= amt;
                        System.out.println(Thread.currentThread().getName() + ": balance after withdrawal: " + balance);
                    } catch (InterruptedException e) {
                        System.out.println("Thread Interrupted");
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();          //Release the Lock
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }else{
                System.out.println("!! Could Not Get the Lock");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
            Thread.currentThread().interrupt();
        }
    }
}

