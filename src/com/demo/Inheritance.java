package com.demo;

public class Inheritance {
	// Inheritance
	int id;
	String name;
	double salary;

	static String orgname;

	public Inheritance()
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
		System.out.println(salary);
		System.out.println(orgname);
	}
}
class DerivedClass extends Inheritance
{
	String str="string";
	public static void main(String[] args) {
		DerivedClass obj=new DerivedClass();
		System.out.println(obj.str);
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.getDetails();
	}
}
