package javaPractice;

import java.util.LinkedHashSet;

public class PositionOfAString {

	public static void main(String[] args) {
String s = "tester";
String s1 = s.toLowerCase();

LinkedHashSet<Character> set =new LinkedHashSet<Character>();

for(int i=0; i<s1.length();i++) {
	set.add(s1.charAt(i));
	}
for (Character ch : set) {
	for (int i = 0; i < s1.length(); i++) {
		if(ch==s1.charAt(i)) {
			System.out.println(ch+"="+(i+1));
			break;
		}
		
	}
}
	}
}
