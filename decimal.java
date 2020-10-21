import java.util.Scanner;
public class decimal {
    public static void main (String [] args) {
        System.out.println("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter desired base between 2 and 36: ");
        int base = input.nextInt();
        System.out.println(num + " converted to base " + base + ": ");
        if (num != 0) {
            conversion(num,base);
        }
        else {
            System.out.print(0);
        }

    }
    public static void conversion(int num, int base) {
            if (num > 0) {
                conversion(num/base, base);
                int remain = num % base;
                if (remain >= 10) {
                    System.out.print((char)('A'+remain-10));
                }
                else {
                    System.out.print(remain);
                }
            }
            else if (num < 0)  {
                System.out.print("Invalid number");
            }
    }

}
