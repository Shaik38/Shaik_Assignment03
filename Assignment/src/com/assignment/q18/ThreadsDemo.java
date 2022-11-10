package com.assignment.q18;

public class ThreadsDemo implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is executing.");

	}

	public static void main(String args[]) {
		Thread th1 = new Thread(new ThreadsDemo(), "th1");
		th1.start();
		th1.start();
	}
}
