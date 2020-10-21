// Ly Pham
public class stackclothes {
    static final int max = 20;
    int top;
    cloth array[] = new cloth[max];

    public stackclothes(){
        top = -1;
    }
    public boolean isEmpty() {
        if(top < 0) {
            return true;
        }
        else{
            return false;
        }

    }
    public boolean isFull() {
        if(top >= max-1) {
            return true;
        }
        else{
            return false;
        }
    }

    public void push(cloth item) {
        if (!isFull()) {
            top++;
            array[top] = item;
            System.out.println(item.getName() + " is pushed into the stack.");
        }
        else {
            System.out.print("Stack is full.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            cloth item = array[top--];
            System.out.println(item.getName() + " is popped out of the stack.");
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            cloth item = array[top];
            System.out.println(item.getName() + " is at the top of stack.");
        }
    }

    public void getWashable(boolean hightemp) {
        for (int i = 0; i < max; i++){
            if (array[i] == null) {
                break;
            }
            else if (array[i].getTemp() == hightemp) {
                System.out.println(array[i].getName() + " ");
            }
        }
    }
    public void getColor(String color) {
        for (int i = 0; i < max; i++) {
            if (array[i] == null) {
                break;
            }
            else if(array[i].getColor() == color) {
               System.out.println(array[i].getName() + " ");
            }
        }
    }


    public static void main(String[] args) {
        cloth c1 = new cloth("Jeans", "blue", true);
        cloth c2 = new cloth("Shirt", "yellow", false);
        cloth c3 = new cloth("Skirt", "white", false);
        cloth c4 = new cloth("Coat", "black", true);
        stackclothes s = new stackclothes();
        s.push(c1);
        s.push(c2);
        s.push(c3);
        s.peek();
        s.pop();
        s.push(c4);
        System.out.println("Clothes that can be washed at high temperature: ");
        s.getWashable(true);
        System.out.println("Clothes with given color:  ");
        s.getColor("black");






    }
}
