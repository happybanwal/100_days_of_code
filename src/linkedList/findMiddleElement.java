package linkedList;

import java.util.HashMap;

public class findMiddleElement {

    Node head;

    public static class Node {
        int data;
        Node next ;

        Node(int d){
            data = d;
            next = null;
        }

    }

    public static void insert (findMiddleElement list , int data){
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

    public static void print(findMiddleElement list){
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        while (currentNode!=null){
            System.out.print(+currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    public static void middleElement(findMiddleElement list){

        int count = 0;

        Node currentNode = list.head;

        while (currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }

        System.out.println("count : "+count);

        int mid = count/2;

        Node middleNode = list.head;

//        while (int mid){
//            middleNode=middleNode.next;
//            mid--;
//        }
        for(int i=0;i<mid;i++){
            middleNode=middleNode.next;
        }

        System.out.println(middleNode.data);


    }

    public static void detectLoop(findMiddleElement list){
        Node currentNode = list.head;

        HashMap<Node,Integer> map = new HashMap<>();
        Boolean flag=false;
        while(currentNode!=null){
            if (map.containsKey(currentNode)){
                System.out.println("yes");
                break;
            }
            map.put(currentNode,map.getOrDefault(currentNode,0)+1);
            currentNode=currentNode.next;
        }


    }

    public static void main(String [] args){

        findMiddleElement list = new findMiddleElement();

        insert(list,1);
        insert(list,2);
        insert(list,3);
        insert(list,4);
        insert(list,5);
        insert(list,6);

        print(list);
        detectLoop(list);

//        middleElement(list);

    }
}
