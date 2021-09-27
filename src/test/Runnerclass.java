package test;


public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		
		emp.ID=1;
		emp.Salary=35000;
//		emp.Dept="Engineering";

		emp.Display();
		
		Employee emp1=new Employee("Tushar",23,"Kolhapur",10,60000);
		
		emp1.Display();
		
		PolymorphismExample obj=new PolymorphismExample();
		
		obj.add(1,2);
		obj.add(5,9,6);
		obj.add(5.566,6.32);
		
		
		Account objAcc =new Account();
		objAcc.setBalance(4000);
		
		System.out.println(objAcc.getBalance());
	}

}
