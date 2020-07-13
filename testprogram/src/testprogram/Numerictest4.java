package testprogram;

public class Numerictest4 {

public static void main(String[] args)
{
	int i,j;
	int number = 5;
	int count = 0;
	for(i=1;i<=number;i++)
	{
		
		
		for(j=i;j>=1;j--)
		{
			count = count+1;
			System.out.print(count+" ");
		}
		System.out.println("");
	}
	
	

}}