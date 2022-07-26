package javaPractice;

import java.util.LinkedHashSet;

public class ReverseOrderOfOccurance {

	public static void main(String[] args) {
		String S = "tester";
		String str = S.toLowerCase();

		LinkedHashSet<Character> set= new LinkedHashSet<Character>();

		for(int  i=str.length()-1;i>=0;i--) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			for(int i=str.length()-1;i>=0;i--) {
				if(ch==str.charAt(i)){
					System.out.println(ch+"="+(i+1));
					break;
				}
	            }
}
}
}