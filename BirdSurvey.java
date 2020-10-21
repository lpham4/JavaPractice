import java.util.Scanner;
public class BirdSurvey {
    private Node head;
    class Node {
        String birdname;
        int count;
        Node next;
        public Node() {
            birdname = "";
            count = 1;
        }
        public Node(String birdname){
            this.birdname = birdname;
            this.count = 1;
        }
        public String getBird() {
            return birdname;
        }
        public int getCount() {
            return count;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public BirdSurvey() {
        isEmpty();
    }
    public void addBird(String birdname) {
        if (isEmpty()) {
            head = new Node(birdname);
        }
        else {
            Node current = head;
            while (current != null) {
                if (current.getBird().equals(birdname)) {
                    current.count++;
                    break;
                }
                else if (current.getNext() == null) {
                    current.setNext(new Node(birdname));
                    break;
                }
                current = current.getNext();
            }
        }
    }
    public int getCount(String birdname) {
        Node current = head;
        int count;
        while (!isEmpty()) {
            if (current.getBird().equals(birdname)) {
                count = current.getCount();
                return count;
            }
            else {
                current = current.getNext();
            }
        }
        return 0;
    }
    public void getReport() {
        Node current = head;
        while (current != null) {
            int count = current.getCount();
            String birdname = current.getBird();
            System.out.println("Counted " + count + " " + birdname + "(s).");
            System.out.println("Species: " + birdname + ". Count: " + count);
            current = current.getNext();
        }
    }

    public static void main (String [] args) {
        String birdname = "";
        BirdSurvey survey = new BirdSurvey();
        Scanner bird = new Scanner(System.in);
        while (!birdname.equals("done")) {
            System.out.println("Enter bird name ('done' when finished): ");
            birdname = bird.next();
            if (!birdname.equals( "done")) {
                survey.addBird(birdname);
                survey.getCount(birdname);
                System.out.println("Added " + birdname + " and there is now " + survey.getCount(birdname) + " of them.");
            }
        }
        survey.getReport();
    }
}
