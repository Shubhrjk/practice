package com.springcore.ci;

public class Addition {
 
	private int a;
	private int b;
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	System.out.println("contructor : int , int");
	
	}
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("contructor : double , double");
	}
	public void doSum() {
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+ b);
		System.out.println("sum is "+(this.a + this.b));
	}
}
