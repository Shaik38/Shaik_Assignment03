package com.assignment.q10;


import java.io.*;

class SuperClass {

	// SuperClass declares an exception
	void method() throws RuntimeException {
		System.out.println("SuperClass");
	}
}

// SuperClass inherited by the SubClass
class SubClass extends SuperClass {

	// SubClass declaring an exception
	// which are not a child exception of RuntimeException
	void method() throws Exception {

		// Exception is not a child exception
		// of the RuntimeException
		// So the compiler will give an error

		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClass s = new SubClass();
		s.method();
	}
}
