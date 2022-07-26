package javaPractice;

public class StringPollindrome {

	public static void main(String[] args) {
String name = "MOM";
String rev = " ";

for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
if(rev.equals(rev)) {
System.out.println("it is pollindrome");
	}
else {
	System.out.println("it is not a pollindrome");
}
	}}
