package javaPractice;

public class UpdatFirstLetterToUpperCase {

	public static void main(String[] args) {
String s = "my name is chethan";  //o/p --> My Name Is Vinay

String[] str = s.split(" ");

for (int i = 0; i < str.length; i++) {
	//str[i]=my
	
	char Firstch= (char)(str[i].charAt(0)-32);
	String sub = str[i].substring(1);
	System.out.print(Firstch+sub+" ");
	
}
	}

}
