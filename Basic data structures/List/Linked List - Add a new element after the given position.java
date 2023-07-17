/* QUESTION:
Jeremy is the class teacher of class 9. After summer vacation, the school was reopened. As it was the first day of the school, Jeremy wants to arrange seats for his students. He asked them to sit in the order as they come. The student who comes first sits in first place, the student who comes second sits in second place and so on.

After some times, a new student is joining in the class. So, he needs to arrange him in one particular position. Implement this concept using Linked list- Adding data after the given position.


INPUT FORMAT:

Input consists of a list of integers.
-1 indicates the end of the linked list.
OUTPUT FORMAT:

Output is a sequence of integers from the list.

SAMPLE INPUT:
4
2
1
6
-1
3
10

SAMPLE OUTPUT:
Before Insertion:
4 2 1 6
After Insertion:
4 2 1 10 6*/
import java.util.Scanner;
class LinkedList
{
    Node head;
    class Node
 {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void append(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new_node;
        return;
    }
   
    public void insertAtMiddle(int pos, int val)
    {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        int cp=1; //variable for increment
        while(current.next!=null&&cp<pos){
            current=current.next;
            cp++;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
   
    public void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
   
}
public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while(data>0)
        {
            list.append(data);
            data=sc.nextInt();
        }
        System.out.println("Before Insertion:");
        list.printList();
        System.out.println();
        int pos = sc.nextInt();
        int val = sc.nextInt();
        list.insertAtMiddle(pos,val);
        System.out.println("After Insertion:");
        list.printList();
    }
}
