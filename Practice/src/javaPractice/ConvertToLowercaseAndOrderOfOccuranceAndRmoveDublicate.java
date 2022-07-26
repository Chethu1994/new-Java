package javaPractice;

import java.util.LinkedHashSet;

public class ConvertToLowercaseAndOrderOfOccuranceAndRmoveDublicate {

	public static void main(String[] args) {
String S = "WelcomE";
String str = S.toLowerCase();

LinkedHashSet<Character> set= new LinkedHashSet<Character>();

for(int i=0; i<str.length();i++) {
	set.add(str.charAt(i));
}
for (Character ch : set) {
	for(int i=0;i<str.length();i++) {
		if(ch==str.charAt(i)){
			System.out.println(ch+"="+(i+1));
			break;
		}	
	}
	}
	}
}
