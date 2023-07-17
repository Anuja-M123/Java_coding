/*QUESTION:
In John’s school, they have decided to conduct sports day. John was asked to select students for each competition. So he called the students one by one and asked them to go to the ground for selection. He called the students in the order they were seated. The student who was seated first was sent first for selection. After he sends the students for selection, he took attendance.

Display the roll number of the students who are present in the class while the selection process is being done.

Implement this concept using Linked List- Delete at beginning.


INPUT & OUTPUT FORMAT:

Input consists of a list of integers.
-1 indicates the end of the linked list.
The next input is an integer to specify the number of students sent for selection.
Refer to the sample input & output for formatting specifications.
SAMPLE INPUT & OUTPUT:

Enter the student roll number:
6
Enter the student roll number:
3
Enter the student roll number:
1
Enter the student roll number:
4
Enter the student roll number:
8
Enter the student roll number:
-1
The students are seated in the order:
6 3 1 4 8
The number of students sent for selection:
3
Students in the class after sending the first student for selection:
3 1 4 8
Students in the class after sending the second student for selection:
1 4 8
Students in the class after sending the third student for selection:
4 8*/
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
    
    public void deleteValue()
    {
    if(head==null){
        System.out.println("No students in the class");
    return;
        
    }
    head=head.next;
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
        System.out.println("The students are seated in the order:");
        list.printList();
        System.out.println("\nThe number of students needed for selection");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.deleteValue();
            System.out.println("The Student in class after sending for selection is:");
            list.printList();
            System.out.println();
        }
    }
}
