package testprogram;

public class test3 {
	
	public static void main(String[] args)
	{
		
		int i,j;
		int number = 5;
		for(i=1;i<=number;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=number;i++)
		{
			
			for(j=number-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
