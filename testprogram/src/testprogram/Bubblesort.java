package testprogram;

public class Bubblesort {

	public static void main(String[] args)
	{
		
		int i,j;
		int[] arr = {21,12,3,5,2,6,12,21,66,4,33,22,112};
		int temp;
		int flag=0;
		for(i=0;i<arr.length;i++)//no of rounds
		{
			
			for(j=0;j<arr.length-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];	
					arr[j]=arr[j+1];	
					arr[j+1]=temp;
					flag=1;
				}
				
				
			}
		
			if(flag==0)
			{
				break;
			}
			
		}
		
		
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
	
}
