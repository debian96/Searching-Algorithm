import java.util.Scanner;

public class Linear {
	
	private static int linear_search(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==search) {
				return i;	
			}		
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
		int arr[] = {12, 11, 13, 5, 6, 7};
		
		System.out.println("----------Arrsy Is----------");
		printArray(arr);
		
		System.out.println("Enter the element to search:-");
		int search = sc.nextInt();
		
		int pos = linear_search(arr,search);
		if (pos>0) {
			System.out.println("Element "+search+ " found at "+pos);
		}else {
			System.out.println("The element not found");
		}
		
		
	}
	
}
