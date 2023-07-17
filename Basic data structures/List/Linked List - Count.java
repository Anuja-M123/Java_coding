/* QUESTION:
John wants to know how many students are present in the class and how many of them are absent. So he wants to count the number of students present in the class. Implement this concept using linked list and find how many students are present in the class.


INPUT & OUTPUT FORMAT:

Input consists of a list of integers.
-1 indicates the end of the linked list.
Refer to sample input & output for output formatting specifications.
SAMPLE INPUT & OUTPUT:

Enter the student roll number:
4
Enter the student roll number:
3
Enter the student roll number:
2
Enter the student roll number:
1
Enter the student roll number:
-1
The students who are present in the class are
4 3 2 1
The number of students who are present is 4.*/
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
    
    public void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public int  countNumber()
    {
     int count=0;
     Node temp=head;
     while(temp!=null){
         count++;
         temp=temp.next;
     }return count;
    }
}
public class Main
{
        public static void main(String[] args)
    {
       
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int data=0;
        do{
            System.out.println("Enter the student roll number:");
            data=sc.nextInt();
            if(data>0)
        	    list.append(data);
        }while(data>0);
        System.out.println("\nThe students who are present in the class are");
       // System.out.println(list.printList());
        list.printList();
        System.out.println("\nThe number of students who are present is "+list.countNumber());
        //list.countNumber();
    }
}
