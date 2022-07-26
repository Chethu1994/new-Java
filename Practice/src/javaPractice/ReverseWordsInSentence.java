package javaPractice;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
String st = "Hi Hello Welcome Bye";
String[] s = st.split(" ");
for(int i=0; i<s.length;i++) {
	 String st1=s[i];
	 for(int j=st1.length()-1;j>=0;j--) {
		 System.out.print(st1.charAt(j));
	 }
	 System.out.print(" ");
}

	}

}
