package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@com";
		person1.phone = "123";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		//Person
		
		//Attributes
		String name = "Joe";
		String email = "joe@com";
		String phone = "123";
		
		//Actions
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//Attributes
		String name2 = "Sarrah";
		String email2 = "sarrah@com";
		String phone2 = "143";
				
		//Actions
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
	}
	
	//Enhanced by adding functions
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
}
