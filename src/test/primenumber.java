package test;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		int flag=0;
		
		for(int i=2; i<(num/2); i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(num==1)
		{
			System.out.println("1 netheir prime nor composite");
		}else
		{
			if(flag==0)
			{
				System.out.println("Prime number");
			}else
			{
				System.out.println("Not a Prime number");
			}
		}
	}

}
