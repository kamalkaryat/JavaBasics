package multi_threading_concurrency.deadlock;

class A{
	synchronized public void D1(B b) {	//Main thread having lock of b
		System.out.println("D1() of class A is executing by thread1");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			System.out.println("Thread got interrupted");
		}
		System.out.println("Calling b.last()----thread1");
		b.last();
	}
	public void last() {
		System.out.println("Inside last() of A");
	}
}
class B{
	
	synchronized public void D2(A a) {	//Main thread having lock of b
		System.out.println("D2() of class B is executing by thread2");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			System.out.println("Thread got interrupted");
		}
		System.out.println("Calling a.last()----thread2");
		a.last();
	}
	public void last() {
		System.out.println("Inside last() of B");
	}
}
public class Deadlock extends Thread {
	A a=new A();
	B b=new B();
	public void Method() {
		this.start();	//main thread executing-----this.start.
		a.D1(b);	//main thread executing D1().
	}
	public void run() {
		b.D2(a);	//child thread executing D2().
	}
	public static void main(String[] args) {
		Deadlock deadlock=new Deadlock();
		deadlock.Method();
	}

}
