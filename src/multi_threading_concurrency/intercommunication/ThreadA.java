package multi_threading_concurrency.intercommunication;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();//Child thread get created here.
		/*	Main thread goes into waiting for 1 sec*/
		/*
		 * Case 1:
		 * Thread.sleep(0,100000);//0.000001 sec
		 * Not Recommended Reason--->As we don't know the exact time.
		 * Conclusion----Sometime lot of time get wasted or sometime minimum 
		 * time, lead to ambiguity in data.
		 */
		
		/*	
		 * Case 2:
		 * b.join();
		 * Not Recommended Reason--->e.g. main thread will go into waiting
		 * state until 1,00,00,000 lines of code in Class B not get executed.
		 * Even though run() get completed.
		 * Conclusion-----This may degrade the system performance.
		 */
		 
		/*	Best way is to use wait & notify methods*/
		System.out.println("Main thread goes into sleep mode.");
		Thread.sleep(10000);
		synchronized(b) {	//Main thread got the lock
			System.out.println("Main thread goes into waiting");
			/**
			 * wait() becomes a demon if notification not received
			 * How? Because it goes into waiting state forever or till program life.
			 * Sol? Set time period for wait().
			 **/
			b.wait(10000);	//main thread calling obj.wait(); Also has the lock of b
			System.out.println("Main thread get either notification or its time has expired");
			System.out.println("Sum of 100 no(correct is 5050): "+b.totalSum);
		}
	}

}

/*	Child thread	*/
class ThreadB extends Thread{
	int totalSum=0;
	public void run() {
		synchronized(this) {
			System.out.println("Updation starts");
			for(int num=1; num<=100; num++)
				totalSum=totalSum+num;
			System.out.println("Updation get complete");
			System.out.println("Sending notification");
			this.notify();
		}
	}
	//Suppose we have 1,00,00,000 lines of code after run().
}