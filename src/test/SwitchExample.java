package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=19;
		
		switch(age) {
		
		case 19:
		case 18:
			System.out.println("Eligible");
			break;
			
		case 17:
			System.out.println("Eligible in next year");
			break;
			
		case 15:
			System.out.println("Not Eligible");
			break;
			
		default:
			System.out.println("Default Block");
		
		}

	}

}
