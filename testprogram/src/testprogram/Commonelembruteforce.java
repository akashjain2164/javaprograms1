package testprogram;

public class Commonelembruteforce {

	public static void main(String[] args)
	{
		
		int[] arr = {1,2,1,3,2,4,5}; 
		int i,j;
		System.out.println("Duplicate elements are : ");
		for(i=0;i<arr.length-1;i++)
		{
			
			for(j=i;j<arr.length;j++)
			{
				
				if(arr[i] == arr[j] && i!=j)
				{
					System.out.println(arr[j]+" ");
				}
				
			}
			
		}
		
	}
	
	
}
