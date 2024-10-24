package programs;
import java.util.Scanner;

class LinkedList {
    int data;
    LinkedList prev;
    LinkedList next;

    LinkedList(int value) {
        this.data = value;
        this.prev = null;
        this.next = null;
    }

    void display() {
        System.out.print(data + " ");
    }
}

class Linked {
    public LinkedList fstnode, lastnode;

    Linked() {
        fstnode = null;
        lastnode = null;
    }

    void insert_front(int value) {
        LinkedList node = new LinkedList(value);
        if (fstnode == null) {
            fstnode = lastnode = node;
            System.out.println("Linked list created successfully!");
        } else {
            node.next = fstnode;
            fstnode.prev = node;
            fstnode = node;
            System.out.println("Node inserted at the front of the linked list!");
        }
    }

    void insert_end(int value) {
        LinkedList node = new LinkedList(value);
        if (fstnode == null) {
            fstnode = lastnode = node;
            System.out.println("Linked list created successfully!");
        } else {
            lastnode.next = node;
            node.prev = lastnode;
            lastnode = node;
            System.out.println("Node inserted at the end of the linked list!");
        }
    }

    void delete() {
        int count = 0;
        LinkedList node;
        Scanner input = new Scanner(System.in);
        for (node = fstnode; node != null; node = node.next) {
            count++;
        }
        display();
        System.out.println("\n" + count + " nodes available here!");

        System.out.println("Enter the node number which you want to delete from ascending order list:");
        int number = input.nextInt();

        if (number < 1 || number > count) {
            System.out.println("Invalid node number!");
            return;
        }

        node = fstnode;
        for (int i = 1; i < number; i++) {
            node = node.next;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            fstnode = node.next; // If deleting the first node
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            lastnode = node.prev; // If deleting the last node
        }

        System.out.println("Node has been deleted successfully!\n");
    }

    void display() {
        LinkedList node = fstnode;
        System.out.println("List of nodes in ascending order:");
        while (node != null) {
            node.display();
            node = node.next;
        }
        System.out.println();
        
        node = lastnode;
        System.out.println("List of nodes in descending order:");
        while (node != null) {
            node.display();
            node = node.prev;
        }
        System.out.println();
    }
}

public class doublylinkedlist {
    public static void main(String[] args) {
        Linked list = new Linked();
        Scanner input = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("1. Insert at front 2. Insert at back 3. Delete 4. Display 5. Exit");
            System.out.print("Enter your choice: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter the positive value for linked list: ");
                    list.insert_front(input.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the positive value for linked list: ");
                    list.insert_end(input.nextInt());
                    break;
                case 3:
                    list.delete();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Bye Bye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        input.close();
    }
}
