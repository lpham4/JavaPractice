import java.util.Scanner;
import java.util.LinkedList;
public class linkedlist {
    public static void main (String [] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter linked list size (max is 10): ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size > 10) {
            System.out.print("Invalid size");
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter an integer: ");
                list.add(input.nextInt());
            }
            System.out.println("Entered linked list: " + list);
            System.out.println("Sum: " + addElements(list));
        }

    }
    public static int addElements(LinkedList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
