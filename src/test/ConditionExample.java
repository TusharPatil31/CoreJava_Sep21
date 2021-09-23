package test;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=50; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number is "+i);
			}else
			{
				System.out.println("Even number is "+i);
			}
			
		}
		
		//===============================================
		int age=19;
		
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}else if(age==17)
		{
			System.out.println("sorry, You are eligible for next year ");
		}else
		{
			System.out.println("Sorry, you are not eligible for voting");
		}

	}

}
