package javaPractice;

public class FetchMaximumLengthOfAStringInAnArray {

	public static void main(String[] args) {
String[] s= {"a","ab","hello","welcome","hi"};
String maxlength=s[0];
System.out.println(maxlength.length());
for(int i= 1; i<s.length; i++)
{
	System.out.println(s[i]);
	
	if(maxlength.length()<s[i].length()) {
		maxlength=s[i];
	}
	}
for( int i=0;i<s.length;i++) {
	if(maxlength.length()==s[i].length())
	{
		System.out.println(s[i]);
	}
}

	}

}
