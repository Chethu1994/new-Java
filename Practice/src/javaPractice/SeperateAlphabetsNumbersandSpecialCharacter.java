package javaPractice;

public class SeperateAlphabetsNumbersandSpecialCharacter {

	public static void main(String[] args) {
		
String s = "A1b2@3c";
String al = "";
String numb = "";
String spl = "";

for (int i = 0; i < s.length(); i++) {
	
	if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z' ) 
	{ 
	al=al+s.charAt(i);	
		}
	else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
	{
		numb=numb+s.charAt(i);
	}
	
	else {
		spl=spl+s.charAt(i);
	}
}
System.out.println(al+" "+numb+" "+spl);

	}

}
