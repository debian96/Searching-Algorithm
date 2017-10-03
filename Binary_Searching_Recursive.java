import java.util.Scanner;

class Binary {
	
	
	private static int binary_search1(int[] arr, int low, int high, int search) {
		int mid = (low+high)/2;
		if(high>=low) {
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]>search)
				binary_search1(arr, low, mid-1, search);
			else if(arr[mid]<search)
				binary_search1(arr, mid+1, high, search);
		}
		return -1;
	}
	
	
	
	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}
	
	static Scanner sc = new Scanner(System.in);
  
	public static void main(String[] args) {
		int arr[] = {15,18,22,45,67,89};
		
		System.out.println("----------Arrsy Is----------");
		printArray(arr);
		
		System.out.println("Enter the element to search:-");
		int search = sc.nextInt();
		int n = arr.length;
		
		int pos1 = binary_search(arr,search);
		if (pos1>0) {
			System.out.println("Element "+search+ " found at "+pos1);
		}else {
			System.out.println("The element not found");
		}
	
		
	}
}
