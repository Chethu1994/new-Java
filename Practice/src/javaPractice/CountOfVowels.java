package javaPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountOfVowels {

	public static void main(String[] args) {
		String s2 = "india";
		String s1 = s2.toLowerCase();
		

		ArrayList<Character> set = new ArrayList<Character>();
		for(int i=0; i<s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for(Character chara:set) {
			int count=0;
		 
			
			if((chara=='a')||(chara=='e'||(chara=='i')||(chara=='o')||(chara=='u'))) {
				
			count++;
			System.out.println(chara+"="+count);
			}
			
		
	}
	}
}
