// Ly Pham
public class foodqueue{
   static final int max = 20;
    int count;
    int tail;
    int head;
    food array[] = new food[max];

    public foodqueue() {
        count = 0;
        head = -1;
        tail = -1;
    }
    public boolean isFull() {
        return count == max;
    }
    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(food item) {
        if(isFull()){
            System.out.println("Queue is full.");
        }
        else {
            tail = (tail + 1) % max;
            count++;
            array[tail] = item;
            System.out.println(item.getName() + " is added into the queue.");
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else{
            head = (head + 1) % max;
            count --;
            food item = array[head];
            System.out.println(item.getName() + " is removed from the queue." );
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else {
            head = 1;
            food f = array[head];
            System.out.println(f.getName() + " is at front of queue.");
        }
    }
    public void getHighest() {
        int highestcalories = 0;
        food highest = null;
        for (int i = 0; i < max; i++) {
            if (array[i] == null) {
                break;
            }
            else if (array[i].getCalories() *  array[i].getServing() > highestcalories) {
                highest = array[i];
                highestcalories = array[i].getCalories() * array[i].getServing();
            }
        }
        System.out.println("Food with the highest calories is " + highest.getName());
    }
    public void getAverage() {
        int calories = 0;
        int servings = 0;
        int total = 0;
        for (int i = 0; i < max; i++) {
            if (array[i] == null) {
                break;
            }
            else {
                calories += array[i].getCalories();
                servings += array[i].getServing();
                total += array[i].getCalories() / array[i].getServing();
            }
        }
        int average = total / array.length;
        System.out.println("Average calories per serving is " + average + " calories.");
    }

    public static void main (String [] args) {
        food f1 = new food("Gelato",230, 2);
        food f2 = new food("Sandwich", 680, 1);
        food f3 = new food("Cookie", 320, 1);
        food f4 = new food("Coke", 145, 1);
        foodqueue q = new foodqueue();
        q.enqueue(f1);
        q.enqueue(f2);
        q.enqueue(f3);
        q.dequeue();
        q.peek();
        q.enqueue(f4);
        q.getHighest();
        q.getAverage();

    }
}

