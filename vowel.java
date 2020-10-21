import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int result = vowels(s,i,count);
        System.out.println("The number of vowels: " + result);


    }

    public static int vowels(String s, int i, int count) {
        if (i == s.length()) {
            return count;
        }
        else {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return vowels(s, i+1, count);
    }

}
