// Ly Pham
import java.util.Random;
import java.util.Scanner;
public class linear {
	public static void main(String [] args) {
		int [] nums = {1,4,4,22,-5,10,21,-47,23};
		System.out.print("Nums: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.print("Enter key to look for: ");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int result = linearSearch(nums,key);
		if (result == -1) {
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key is found at index " + result);
		}
		
		int [] data = new int[20];
		Random ran = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = -100 + ran.nextInt(200);
		}
		System.out.print("Data: ");
		for (int i = 0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("Enter key to look for: ");
		key = input.nextInt();
		int result2 = linearSearch(data,key);
		if (result2 == -1) {
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key is found at index " +linearSearch(data,key));
		}
	}
	public static int linearSearch(int [] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
