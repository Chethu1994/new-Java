package javaPractice;

public class SwapTwoString {

	public static void main(String[] args) {
String s1 = "java";  //4
String s2 = "selenium"; //8

s1=s1+s2; //javaselenium 10
          //01234567891011

s2=s1.substring(0, s1.length()-s2.length());
              //0,4 java
s1=s1.substring(s2.length());
System.out.println(s1+" "+s2);
	}

}
