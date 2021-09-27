package test;

public class Person {
	
	public String Name;
	public int Age;
	public String City;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String city ) {
		this.Name=name;
		this.Age=age;
		this.City=city;
	}
	
	public void Display() {
		System.out.println("Name is "+ Name);
		System.out.println("Age is "+ Age);
		System.out.println("City is "+ City);
	
	}
}
