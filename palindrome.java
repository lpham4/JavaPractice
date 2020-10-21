import java.util.Scanner;
public class palindrome {
    public static void main (String [] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean result = palindrome(s);
        if (result == true) {
            System.out.println("String is a palindrome");
        }
        else {
        System.out.println("String is not a palindrome"); }
    }

    public static boolean palindrome(String s) {

        if (s.length() == 0 || s.length() ==1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length()-1)) {
            return palindrome(s.substring(1,s.length()-1));
        }
        else {
            return false;
        }
    }
}
