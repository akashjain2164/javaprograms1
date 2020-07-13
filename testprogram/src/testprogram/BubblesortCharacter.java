package testprogram;

public class BubblesortCharacter {

	
public static void main(String[] args)
{

	int i,j;
	String temp;
	String []arr= {"a","c","b","m","n","d","e","f"};
		int flag=0;
	for(i=0;i<arr.length;i++)
	{
		
		for(j=0;j<arr.length-1;j++)
		{
			
			if(arr[j].compareTo(arr[j+1])>0)
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