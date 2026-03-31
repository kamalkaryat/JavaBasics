package multi_threading_concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Synchronized Problems:
 * Fairness: Not fairness as it is not necessary each thread get the lock(i.e. starvation problem)
 * Indefinite Blocking:
 * Interruptibility: Can't Interrupt
 * Read/Write Locking: Not aware about the operation(read/write)
 *
 * Solution: Manual Locking
 * Lock lock = new ReentrantLock(fair= true)
 */
public class LockFairness {

    //private static final Lock lock= new ReentrantLock();
    private static final Lock lock= new ReentrantLock(true);

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                accessResource();
            }
        };

        Thread thread1= new Thread(task, "T1");
        Thread thread2= new Thread(task, "T2");
        Thread thread3= new Thread(task, "T3");
        Thread thread4= new Thread(task, "T4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    private static void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired the lock");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception while thread execution");
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" released the lock");
            lock.unlock();
        }
    }
}
