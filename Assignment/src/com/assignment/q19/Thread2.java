package com.assignment.q19;

class Thread2 implements Runnable {

	public void run() {
		System.out.println("Thread started running..");
	}

	public static void main(String args[]) {
		Thread2 mt = new Thread2();
		Thread t = new Thread(mt);
		t.start();
	}

}
