package com.assignment.q2;


class A {
	protected void method() {
		System.out.println("Hello");
	}
}

public class B extends A{
	
	public void method()
    {
        System.out.println("Hello");
    }
 
    public static void main(String args[])
    {
        B b = new B();
        b.method();
    }

}
