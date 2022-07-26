package javaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		
		for(Character c:set)
		{
			//System.out.print(c);
			
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				//System.out.println(s.charAt(i));
				if(c==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
		}
}
