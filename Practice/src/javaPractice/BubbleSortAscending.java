package javaPractice;

public class BubbleSortAscending {

	public static void main(String[] args) {
		int[] arr={56,108,33,89,75};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+"     ");
		}
	}
}
