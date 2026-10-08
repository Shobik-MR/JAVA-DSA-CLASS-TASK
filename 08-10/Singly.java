import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinked{
    Node head;
    SinglyLinked(){
        head = null;
    }
    void insertFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
public class Singly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     SinglyLinked list = new SinglyLinked();
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
        int data = sc.nextInt();
         list.insertFirst(data);
     }
     list.display();
    }
}