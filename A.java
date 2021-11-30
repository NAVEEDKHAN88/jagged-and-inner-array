package com.inner_array;

// Static inner class: Here we can create non static as well as static members

public class A {
static class B {
	static int i = 10;

	public static void show () {
		System.out.println("From static method");
	}

	}

	public static void main(String[] args) {
		A a1 = new A();
	
		B.show();
		System.out.println(B.i);
		
	}
}


