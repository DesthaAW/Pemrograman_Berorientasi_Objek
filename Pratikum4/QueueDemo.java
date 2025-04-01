import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5; 
        
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (queue.size() < maxSize) {
                        System.out.print("Enter value to insert: ");
                        int value = scanner.nextInt();
                        queue.add(value);
                    } else {
                        System.out.println("Queue is full! Cannot insert more elements.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Removed: " + queue.poll());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    System.out.println("Front: " + (queue.isEmpty() ? "Queue is empty" : queue.peek()));
                    break;
                case 4:
                    System.out.println("Queue Empty: " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue Full: " + (queue.size() == maxSize));
                    break;
                case 6:
                    System.out.println("Queue Size: " + queue.size());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue (y/n)? ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                break;
            }
        }
        scanner.close();
    }
}
