package multi_threading_concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock:
 * - Lock can be acquired by the same Thread again
 * - Maintain a 'count' variable i.e. increment it for each lock() & decrement it for unlock()
 * - Throws IllegalMonitorStateException whenever not using proper unlocking
 * - methods: lock(), tryLock(), tryLock(timeout), lockInterruptibly(), unlock()
 * - when a thread has acquired lock using lockInterruptibly(), it can be interrupted
 */
public class ReentrantLockDemo {
    private static final Lock lock= new ReentrantLock();

    public static void main(String[] args) {
        outerMethod();
    }
    public static void outerMethod(){

        //Thread cannot be interrupted
        lock.lock();                    //count 1

        //Thread can be interrupted
        //lock.lockInterruptibly();

        try{
            System.out.println("Inside the OuterMethod");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }
    public static void innerMethod(){
        // Lock can be acquired again in ReentrantLock
        lock.lock();            //count 2
        try{
            System.out.println("Inside the InnerMethod");
        }finally {
            lock.unlock();      //count 1

            /*
                count 0       Create Inconsistency
                IllegalMonitorStateException is thrown
             */
            //lock.unlock();
        }
    }
}
