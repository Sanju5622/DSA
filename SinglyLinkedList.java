import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class SinglyLinkedList{
    Node head;

    public void insertAtFront(int data)
    {
        Node newNode = new Node(data);   //creating newNode to add the element in the list
        newNode.next = head;            // newNode.next is used to add element to front of the list
        head = newNode;

    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node last = head;
        while(last.next!=null)
        {
            last=last.next;
        }

        last.next=newNode;
    }

    public void deleteByValue(int data)
    {
        if (head == null)
        {
            System.out.println("List is empty, cannot delete.");
            return;
        }

        if(head.data==data)
        {
            head = head.next;
            System.out.println(data +"deleted");
            return;
        }

        Node prev=null,current=head;
        while(current!=null && current.data!=data)
        {
            prev=current;
            current=current.next;
        }

        if(current==null)
        {
            System.out.println(data+"not found in the list");
            return;
        }

        prev.next = current.next;
        System.out.println(data + " deleted.");
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}

public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            // Display the menu
            System.out.println("\n1. Insert at Front");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete by Value");
            System.out.println("4. Print List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    value = scanner.nextInt();
                    list.insertAtFront(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    list.deleteByValue(value);
                    break;
                case 4:
                    System.out.println("Current List:");
                    list.printList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

