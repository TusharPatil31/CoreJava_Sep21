package test;

public class Employee extends Person{
	public int ID;
	public int Salary;
//	String Dept;
	static String Dept="Engineering";
	
	public Employee()
	{
		super();
		System.out.println("Inside Emp Constructor");
		
	}
	
//	public Employee(int empID, int salary)
//	{
//		this();//it called above constructor
//		this.ID=empID;
//		this.Salary=salary;
//	}
	
	public Employee(String name, int age, String city, int empID, int salary)
	{
		super(name,age,city);
		
		this.ID=empID;
		this.Salary=salary;
	}
	
	public void Display() {
		super.Display();
		System.out.println("Employee ID is "+ ID);
		System.out.println("Salary is "+ Salary);
//		System.out.println("Dept is "+ Dept);
		System.out.println("Dept is "+ Employee.Dept);
	}
}