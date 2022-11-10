package com.assignment.q12;

public class Main {
	// final keyword
	private final String halo = "Hello World!";

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Edureka test = new Edureka();
		test = null;
		System.gc();

		// finally block
		try {
			System.out.println("Try Block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}

	}

	// finalize
	public void finalize() throws Throwable {
		System.out.println("Object is destroyed by the Garbage Collector");
	}

}
