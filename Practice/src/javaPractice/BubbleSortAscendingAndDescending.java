package javaPractice;

public class BubbleSortAscendingAndDescending {

	public static void main(String[] args) {
		
		int[] arr={56,108,33,89,75};
		
		
		System.out.println("Ascending");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Descending");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]+" ");
		}
	}
	}
	
	


