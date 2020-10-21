import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main (String [] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Enter array list size (max is 10): ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size >10) {
            System.out.println("Invalid size");
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter integer: ");
                array.add(input.nextInt());
            }
            System.out.println("Entered array: " + array);
            System.out.println("Sum: " + addIntegers(array));
        }

    }
    public static int addIntegers(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }
}
