package javaPractice;

public class FetchMaximumLengthOfAnIntegerInAnArray {

	public static void main(String[] args) {
		String[] s= {"1","223","4556","77895","89654","896541"};
		String maxlength=s[0];
		//System.out.println(maxlength.length());
		for(int i= 1; i<s.length; i++)
		{
			//System.out.println(s[i]);
			
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