package multi_threading_concurrency;

public class ThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(() -> {
            for( ; ; ){
                System.out.println("Thread T1 is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("!! Error while sleeping");
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());

        for( ; ; ){
            System.out.println("Main Thread is running");
            try {
                Thread.sleep(1000); // Slow it down
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
