package javaPractice;

public class ShiftIndex {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5}; //o/p-->34512

int key= 2;

//main logic
for (int n=0; n<key; n++){
	int temp=a[0];  //1
	for (int i = 1; i < a.length; i++) {
		a[i-1]=a[i];
		}
	a[a.length-1]=temp;
	}

// to print the stored value
for (int i =0; i < a.length; i++) {
	System.out.print(a[i]+" ");
	
}
	}

}
