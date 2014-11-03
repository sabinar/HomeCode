package com.test.thread;

public class MyThread {

	public static void main(String[] args) {
		FooRunnable foo = new FooRunnable();
		Thread t = new Thread(foo);
		t.setName("Sabina");
		Thread t2 = new Thread(foo);
		t2.setName("Reena");
		
		t.start();
		t2.start();

	}

}

class FooRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<4; i++) {
			System.out.println("Runnable by " + Thread.currentThread().getName() + " times " + i);
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ex) {}
		}
	}
	
}
