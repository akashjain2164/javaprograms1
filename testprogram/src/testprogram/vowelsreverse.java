package testprogram;

import java.util.ArrayList;

public class vowelsreverse {

public static void main(String[] args)
{
	
	String s = "Leetcode";
	
	ArrayList<Character> vowlist = new ArrayList<Character>();
	vowlist.add('a');
	vowlist.add('e');
	vowlist.add('i');
	vowlist.add('o');
	vowlist.add('u');
	vowlist.add('A');
	vowlist.add('E');
	vowlist.add('I');
	vowlist.add('O');
	vowlist.add('U');
	
	char [] arr = s.toCharArray();
	int i=0;
	int j=s.length()-1;
	
	while(i<j)
	{
		
		if(!vowlist.contains(arr[i]))
		{
			i++;
			continue;
		}
		if(!vowlist.contains(arr[j]))
		{
			
			j--;
			continue;
		}

		char t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
		
		i++;
		j--;
	}
	
	
	System.out.println(arr);
}	
}