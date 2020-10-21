import java.util.Random;
import java.util.Arrays;
public class multi {
    public static void main (String [] args) {
        int [] array = new int[100000];
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(51);
        }
        multithreading thread1 = new multithreading(array);
        multithreading thread2 = new multithreading(array);
        multithreading thread3 = new multithreading(array);
        int start = 0;
        int threads = 3;
        int size = 100000;
        int end = size/threads;
        multithreading object = new multithreading(Arrays.copyOfRange(array,start,end));
        object.start();


    }
}

class multithreading extends Thread {
    int [] array;

    public multithreading(int [] array){
        this.array = array;
    }
    public void run(){
        try {
            Thread.sleep(200);
            System.out.println("Sum of array: " + sumArray(array));
        }
        catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
    public static int sumArray(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;

    }

}