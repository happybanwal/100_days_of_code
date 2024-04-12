package linkedList;

public class reverseList {

    Node head;

    public static class Node {
        int data;
        Node next ;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void insert (   reverseList list , int data){
        Node newNode = new Node(data);

        if(list.head==null){
            list.head=newNode;
        }
        else {
            Node temp = list.head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static void print(reverseList list){
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        while (currentNode!=null){
            System.out.print(+currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    public static void listReverse(reverseList list){
        Node currentNode = list.head;
        int count = 0;

        while(currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }

        System.out.println("count : "+count);


    }


    public static void main(String [] args){

        reverseList list = new   reverseList();

        insert(list,1);
        insert(list,2);
        insert(list,3);
        insert(list,4);
        insert(list,5);
        insert(list,6);

        print(list);
        System.out.println(" ");
        listReverse(list);
        System.out.println(" ");


    }
}
