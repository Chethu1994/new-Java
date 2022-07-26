package javaPractice;

public class RemoveSpaceInAString {

	public static void main(String[] args) {
		String s = " hello ";
		String str = s.trim();
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i)+"="+(i+1));
	}
	}
}
