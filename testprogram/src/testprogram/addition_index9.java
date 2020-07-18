package testprogram;

public class addition_index9 {

	public static void main(String[] args)
	{
		int[] a = {5,4,6,3,2,1,7,2,9,0}; //to print index of sum of 9
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==9)
				{
					
					System.out.println(i+" "+j);
				
				}
				
				
			}
		}
	
	
	
	}
}
