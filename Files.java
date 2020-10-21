import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Files {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter old file name: ");
        String oldfilename = input.nextLine();
        while (!oldfilename.equals("original.txt")) {
            System.out.println("Old file does not exists. Cannot read.");
            System.out.println("Enter another old file name: ");
            oldfilename = input.nextLine();
        }
        if (oldfilename.equals("original.txt")) {
            System.out.println("Enter new file name: ");
            String newfilename = input.nextLine();
            File newfile = new File("/Users/lypham/Documents/copy.txt");
            while (!newfilename.equals("copy.txt")) {
                System.out.println("New file does not exists.");
                System.out.println("Enter another new file name: ");
                newfilename = input.nextLine();
            }
            if (newfile.exists()) {
                System.out.println("New file already exists. Enter 0 to overwrite or 1 to change new file name.");
                int bool = input.nextInt();
                if (bool == 1) {
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Change new file name to: ");
                    newfilename = input2.nextLine();
                }
                else if (bool == 0) {
                    System.out.println("Overwriting.");
                }

            }
        }
        try {
            File oldfile = new File("/Users/lypham/Documents/original.txt");
            File newfile = new File("/Users/lypham/Documents/copy.txt");
            Scanner in = new Scanner(oldfile);
            PrintWriter output = new PrintWriter(newfile);
            while (in.hasNextLine()){
                String line = in.nextLine();
                output.write(line + "\n");
            }
            in.close();
            output.close();
            System.out.println("Old file has been copied to new file.");

        }
        catch (IOException io) {
            io.printStackTrace();
        }
    }

}
