package linkedList;

public class LinkedList {
    Node head;
//    by default head is pointing to null

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor or object
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    // Method to insert a new node
    public static void insert(LinkedList list, int data){
        // Create a new node with given data
        Node new_node = new Node(data);



        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }

        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node temp = list.head;

            while (temp.next != null) {
                temp = temp.next;
            }

            // Insert the new_node at last node
            temp.next = new_node;

        }

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main (String[] args){

        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);

        // Print the LinkedList
        printList(list);
    }
}
