package testprogram;

public class reverse_number {

	
	public static void main(String[] args)
	{
		
		int i =12345;
		int reverse=0;
		
		while(i!=0)
		{
			
			reverse = reverse * 10;
		      reverse = reverse + i%10;
		     // System.out.println(reverse);
		      i = i/10;
			//System.out.println(i);
		}
		System.out.println("Reverse of the number is " + reverse);
		
	}
}
