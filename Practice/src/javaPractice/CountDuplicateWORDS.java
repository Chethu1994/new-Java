package javaPractice;

import java.util.HashSet;

public class CountDuplicateWORDS {

public static void main(String[] args) {
		
		String s= "welcome well welcome to mandya to bang";
		System.out.println(s.length());
		String[] str = s.split(" ");
		System.out.println(str.length);
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for(String c:set) {
			int count=0;
		for(int i=0;i<str.length;i++) {
			if(c.equals(str[i])) {
				count++;
			}
			
		}
			System.out.println(c+"="+count);
		}
	}
}
