/ *QUESTIONS:
John called out the roll number of the selected students one by one and asked them to go for the second round of selection. After he sends the students for selection, he took attendance. 

Display the roll number of the students who are sent for selection and the roll number of the students who are present in the class at that time. Implement this concept using Linked list- Delete the given element at a particular position.



INPUT & OUTPUT FORMAT:

Input consists of a list of integers.
-1 indicates the end of the linked list.
The next input is an integer which denotes the roll number of the students to be sent for selection.
Refer to sample input & output for formatting specifications.
SAMPLE INPUT & OUTPUT:

Enter the student roll number:
6
Enter the student roll number:
3
Enter the student roll number:
2
Enter the student roll number:
9
Enter the student roll number:
-1
The students are seated in the order:
6 3 2 9
Enter the roll number who needs to go to selection
3
The students in class after sending for selection is
6 2 9*/

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
   
    public void deleteValue(int n)
    {
    if(head==null){
        System.out.println("No students in the class.");
        return;
    }
    if(head.data==n){
        head=head.next;
     //   System.out.println("Student with roll number"+n+"Sent for selection");
        return;
    }
    Node prev=null;
    Node curr=head;
    while(curr!=null&&curr.data!=n){
        prev=curr;curr=curr.next;
    }
    if(curr==null){
       System.out.println(n+" is absent");
        return;
    }
    prev.next=curr.next;
  //  System.out.println("Student with roll number"+n+"Sent for selection");
}}
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
        System.out.println("\nEnter the roll number who needs to go to selection");
        int n = sc.nextInt();
        list.deleteValue(n);
        System.out.println("The students in class after sending for selection is");
        list.printList();
    }
}
