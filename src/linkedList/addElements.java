package linkedList;

public class addElements {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static void insert(addElements list, int data){

        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else {
            Node temp = list.head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    static void insertFront( addElements list ,int data){

        Node newNode = new Node(data);

        if(list.head == null){
            list.head=newNode;
        }
        else {
            newNode.next=list.head;
            list.head=newNode;

        }
    }

    public static void printList(addElements list)
    {
        addElements.Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void addInMiddle(addElements list ,int count, int data){
        int middle = count/2;
        Node newNode = new Node(data);

        Node currentNode = list.head;

       for(int i=1;i<middle;i++){
           currentNode=currentNode.next;
       }

       Node nextNode =currentNode.next;

       currentNode.next=newNode;
       newNode.next=nextNode;
    }

    public static Integer count(addElements list){
        int count=0;

        Node currentNode = list.head;

        while(currentNode!=null){
            count++;
            currentNode = currentNode.next;
        }


        return count;
    }

    public static void main (String[] args){

        addElements list = new addElements();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
//        insertFront(list,3);


        int c = count(list);
        System.out.println("count : "+c);

        addInMiddle(list ,c ,5);

        printList(list);

    }
}
