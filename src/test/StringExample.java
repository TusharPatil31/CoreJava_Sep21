package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Fname= "Tushar";
		String Lname= "Patil";
		
		String FullName = Fname + " " + Lname;
		
		System.out.println("Full Name is "+ FullName);
		System.out.println("Length of Full name " + FullName.length());
		System.out.println("Name in Upper Case " + FullName.toUpperCase());
		
		String NewName = FullName.replace(" ", ",");
		
		System.out.println("New Name is "+NewName);
	}

}
