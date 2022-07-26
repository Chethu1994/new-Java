package javaPractice;

import java.util.LinkedHashSet;

public class PrintOrderOfOccuranceOfEachWord {

	public static void main(String[] args) {
		String s1 = "Hi Hi Hello Welcome Bye";
		String[] s = s1.split(" ");
		for (String str : s) {
			for(int i=0;i<s.length;i++) {
				if(str==s[i]) {
					System.out.println(str+"="+(i+1));
					break;
				}
			}
			
		}
	}

}
