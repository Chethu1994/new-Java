package javaPractice;

public class AddTwoArray {

	public static void main(String[] args) {
int[] a = {1,2,3,4,5};
int[] b= {4,5,6,7};

int count= a.length;
for(int i=0; i<count;i++) {
	try {
	
	System.out.println(a[i]+b[i]);
	}
	catch(Exception e) {
		if(a.length>b.length) {
			System.out.println(a[i]);
		}
		else
			System.out.println(b[i]);
	}
}



	}

}
