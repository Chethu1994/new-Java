package javaPractice;

public class Occurance {

	public static void main(String[] args) {
String s = "aabbcccab"; //o/p--> a2b2c3a1b1

for (int i=0; i < s.length(); i++) {
	int count=1;
	for (int j =i+1; j < s.length(); j++) {
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
			i++;
			
		}
		else
		{
			break;
		}
	}
	System.out.println(s.charAt(i)+""+count);
}
	
		
		
	}
	
	
}
	


