package multi_threading_concurrency;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1= new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " is running");
                //Hint for Scheduler
                Thread.yield();         //scheduler can execute another thread also
            }
        }, "Thread1");

        Thread t2= new Thread(() -> {
            for(int i=0; i<5; i++)
                System.out.println(Thread.currentThread().getName()+" is running");
        }, "Thread2");

        t1.start();


        t2.start();
    }
}
