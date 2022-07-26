package javaPractice;

public class ReverseWords {
	
	public static void main(String[] args) 
			{
		String st = "Hi Hello Welcome Bye";
		String[] s=st.split(" ");
		String rev=" ";
		for(int i=0;i<s.length;i++)
		{
			rev=s[i]+" "+rev;
			
		}
		System.out.println(rev);
	}
	
}
