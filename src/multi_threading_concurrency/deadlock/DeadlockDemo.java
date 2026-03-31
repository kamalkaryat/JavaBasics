package multi_threading_concurrency.deadlock;

public class DeadlockDemo {
	private static final Object r1= new Object();
	private static final Object r2= new Object();
	
	public static void main(String[] args) {
		Thread t1= new Thread(() -> {
			synchronized (r1) {
				System.out.println("Thread1 locked r1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Error for T1 Thread");
				}
				synchronized (r2) {
					System.out.println("Thread1 locked r2");
				}
			}
		});
		
		Thread t2= new Thread(() -> {
			synchronized (r2) {
				System.out.println("Thread2 locked r2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (r1) {
					System.out.println("Thread2 locked r1");
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
