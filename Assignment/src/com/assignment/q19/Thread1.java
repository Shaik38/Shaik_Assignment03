package com.assignment.q19;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread started running..");
	}

	public static void main(String args[]) {
		Thread1 mt = new Thread1();
		mt.start();
	}
}
