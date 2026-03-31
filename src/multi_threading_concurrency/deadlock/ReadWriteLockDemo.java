package multi_threading_concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Task task= new Task();
        Runnable readTask= () -> {
                for(int i=0; i<10; i++)
                    System.out.println(Thread.currentThread().getName()+" is reading: "+task.getCount());
            };

        Runnable writeTask= () -> {
                for(int i=0; i<10; i++) {
                    task.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented the count");
                }
            };

        Thread t1= new Thread(writeTask, "t1");
        Thread t2= new Thread(readTask, "t2");
        Thread t3= new Thread(readTask, "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final Count: "+task.getCount());
    }
}

class Task{
    private int count= 0;
    private final ReadWriteLock lock= new ReentrantReadWriteLock();
    private final Lock readLock= lock.readLock();
    private final Lock writeLock= lock.writeLock();

    public int getCount(){
        readLock.lock();
        try {
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public void increment(){
        writeLock.lock();
        try{
            count++;
        }finally {
            writeLock.unlock();
        }

    }
}