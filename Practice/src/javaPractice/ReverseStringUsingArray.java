package javaPractice;

public class ReverseStringUsingArray {

	public static void main(String[] args) {
String name = "chethan";
char[] ch = name.toCharArray();
for(int i=name.length()-1;i>=0;i--) {
	System.out.print(ch[i]);
}
	}

}
