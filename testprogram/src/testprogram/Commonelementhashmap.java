package testprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Commonelementhashmap {

	public static void main(String[] args)
	{
		
		int[] arr = {1,2,1,2,3,2,5,4,6};
	Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(int no:arr)
		{
			
			Integer count = hm.get(no);
			if(count==null)
			{
				
				hm.put(no, 1);
			}
			else 
				
			{
				count = count+1;
				hm.put(no, count);
			}
		}
		
		
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		System.out.println("Duplicate elements & its value are: ");
		for(Map.Entry<Integer, Integer> me: es)
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey()+" - " +me.getValue()+" ");
			}
		}
		
		
	}
		
}

/*
package testprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Commonelementhashmap {

	public static void main(String[] args)
	{
		
		String[] arr = {"a","d","s","w","a","a","d"};
	Map<String,Integer> hm = new HashMap<String, Integer>();
		
		for(String no:arr)
		{
			
			Integer count = hm.get(no);
			if(count==null)
			{
				
				hm.put(no, 1);
			}
			else 
				
			{
				count = count+1;
				hm.put(no, count);
			}
		}
		
		
		Set<Map.Entry<String,Integer>> es = hm.entrySet();
		System.out.println("Duplicate elements & its value are: ");
		for(Map.Entry<String, Integer> me: es)
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey()+" - " +me.getValue()+" ");
			}
		}
		
		
	}
		
}*/