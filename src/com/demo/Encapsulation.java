package com.demo;

public class Encapsulation {
	// Encapsulation
	int id;
	String name;
	double salary;

	static String orgname;

	public Encapsulation()
	{
		id=1;
		name="abc";
		salary=15000;
	}
	static
	{
		orgname="IBM";
	}
	public void getDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.getDetails();
	}
}
