package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=10; i++)
		{
			System.out.println(i);
		}
		
		int[] array1= {1,2,3,4,5,6,7};
		//==========================================
		for(int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		
		//===========================================
		
		for(int i=array1.length-1; i>=0; i--)
		{
			System.out.println(array1[i]);
		}
		
		//==============================================
		
		for(int values:array1)
		{
			System.out.println(values);
		}

		//===================================================
		
		String str1="Clean India Green India";
		String revstr1 =" ";
		
		for(int j=0; j<str1.length(); j++)
		{
			System.out.println(str1.charAt(j));
			
		}
		
		for(int j=str1.length()-1; j>=0; j--)
		{
			revstr1 += str1.charAt(j);
		}
		System.out.println("Reversed String: "+revstr1);
		
		String[] words = str1.split(" ");
		System.out.println("Total words are " + words.length);
		
		
		//===============================================
		int x=1;
		while(x<=10)
		{
			System.out.println(x);
			x++;
		}
		//======================================================
		
		int n=15461165;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			System.out.println(r);
		}
		
		//================================================================
		
		x=20;
		
		do {
			System.out.println(x);
			x--;
		}while(x>=10);
	}

}
