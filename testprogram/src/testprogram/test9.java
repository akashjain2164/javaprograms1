package testprogram;

public class test9 {

	public static void main(String [] args)
	{
		int i,j,k;
		int number = 5;
		
		for(i=1;i<=number;i++)
		{
			
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=number;k>=i;k--)
			{
				System.out.print("*");
			}
			
			for(int l=number-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
	}
	
}

//output
/*
  
  
 *********
  *******
   *****
    ***
     * 
  
 
 */
