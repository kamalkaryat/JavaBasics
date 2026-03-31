package multi_threading_concurrency.synchronization.method;

class Callme{
	/*Shared code start*/
	//try it as void call(String msg){
	synchronized void call(String msg) {
		System.out.printf("\nstart------- "+msg);
		try {
			Thread.sleep(2000);//During this time another thread will execute
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.printf("------end");
	}
	/*Shared code end*/
}
class Caller implements Runnable{
	
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ,String s) {
		target=targ;
		msg=s;
		t=new Thread(this);//Thread will create here.
		t.start();
	}
	public void run() {//Defining the run() abs method
		synchronized(target) {	//Synchronizing the obj(target) calling shared code.
			target.call(msg);
		}
	}
	
}
public class Test {

	public static void main(String[] args) {
		Callme target=new Callme();
		Caller refV1=new Caller(target,"Thread1");
		Caller refV2=new Caller(target,"Thread2");
		Caller refV3=new Caller(target,"Thread3");
		//Wait for threads to end.
		try {
			refV1.t.join();
			refV2.t.join();
			refV2.t.join();
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
