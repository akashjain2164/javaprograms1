package testprogram;

public class test8 {

	public static void main(String[] args)
	{
		
		
		int i,j;
		int number = 5;
		
		for(i=1;i<=number;i++)
		{
			
			for(j=number-1;j>=i;j--)
			{
				
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print("*");
			}
		
		for(int l=2;l<=i;l++)
		{
			System.out.print("*");
		}
			
			System.out.println("");
			
		}
		
		
	}
	
	
}

//output
/*
    *
   ***
  *****
 *******
*********

  
  
  
 
 
  
 */
