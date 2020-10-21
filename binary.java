// Ly Pham
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class binary {
	public static void main(String [] args) {
		int [] nums = {1,4,4,22,-5,10,21,-47,23};
		System.out.print("Nums : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		Arrays.parallelSort(nums);
		System.out.println();
		System.out.print("Sorted: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Enter key to look for: ");
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
		System.out.println("Key is found at index " + binarySearch(nums,key));
		
		int [] data = new int[20];
		Random ran = new Random();
		for (int i = 0; i < data.length;i++) {
			data[i] = -100 + ran.nextInt(200);
		}
		System.out.print("Data: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		Arrays.parallelSort(data);
		System.out.println();
		System.out.print("Sorted: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("Enter key to look for: ");
		key = in.nextInt();
		System.out.println("Key is found at index " + binarySearch(data,key));
		
	}
	public static int binarySearch(int [] array, int key) {
		int low = 0;
		int mid = 0;
		int high = array.length - 1;
		while (low < high) {
			mid = (low + high)/2;
			if (key == array[mid]) {
				return mid;
			}
			else if (key > array[mid]) {
				low = mid + 1;
			}
			else if ( key < array[mid]) {
				high = mid - 1;
			}
		}
		return -1 * (mid + 1);
	}

}
