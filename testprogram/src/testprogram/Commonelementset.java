package testprogram;

import java.util.HashSet;
import java.util.Set;

public class Commonelementset {
	
	public static void main(String[] args)
	{
		
		int[] arr = {1,2,1,3,4};
		Set<Integer> s = new HashSet<>();
		
		for(int no:arr)
		{
			
			boolean b = s.add(no);
			if(b==false)
			{
			System.out.println(no+" ");	
			
			}
			
		}
		
		
	}

}
