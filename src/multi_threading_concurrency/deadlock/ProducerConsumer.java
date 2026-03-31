package multi_threading_concurrency.deadlock;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	public static void main(String[] args) {
		SharedResoureces sr= new SharedResoureces();
		
		Thread producer= new Thread(() ->{
			try {
				sr.produce();
			} catch (InterruptedException e) {
				System.err.println("Producer InterruptedException");
				e.printStackTrace();
			}
		});
		
		Thread consumer= new Thread(()->{
			try {
				sr.consume();
			} catch (InterruptedException e) {
				System.err.println("Consumer InterruptedException");
				e.printStackTrace();
			}
		});
		
		producer.start();
		consumer.start();
	}
}
class SharedResoureces{
	Queue<Integer> queue= new LinkedList<>();
	int capacity= 5;
	
	public synchronized void produce() throws InterruptedException {
		int value= 0;
		while(true) {
			while(queue.size() == capacity) {
				wait();
			}
			System.out.println("Produced: "+value);
			queue.add(value++);
			notify();
			Thread.sleep(1000);
		}
	}
	
	public synchronized void consume() throws InterruptedException {
		while(true) {
			while(queue.isEmpty()) {
				wait();
			}
			int value= queue.poll();
			System.out.println("Consumed: "+value);
			notify();
			Thread.sleep(1000);
		}
	}
}