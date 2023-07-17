/* QUESTION:
John is the class teacher of class 9. After summer vacation, the school was reopened. As it was the first day of the school, John wants to arrange seats for his students. He asked them to sit in the order as they come. The student who comes first sits in first place, the student who comes second sits in second place and so on.

After some time, he changes the order of the seating arrangement. Instead of asking the students to sit behind the already seated students, they are made to sit in front of the already seated students. Implement this concept using Linked list- Adding data at the beginning.


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
SAMPLE OUTPUT:

6 1 2 4*/
import java.util.Scanner;
class Node{
    int data;//create variable
    Node next;//create object for Node
    //create constructor with passing varaibles
    public Node(int data){
        this.data=data;
        this.next=null;}}
    //create insert method
class LinkedList{
    Node head;//create head object
//public LinkedList(){
   // this.head=null;}
    public void addAtBeginning(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;}
    public void display(){
        Node current=head;
   // if(current==null){
       //System.out.println("The list is empty");
       // return;}
    while(current!=null){
        System.out.println(current.data+" ");
        current=current.next;}
        System.out.println();}}
    public class Main{
        public static void main(String[] args){
            LinkedList list=new LinkedList();
            Scanner sc=new Scanner(System.in);
            while(true){
                //System.out.println("enter data");
                int data=sc.nextInt();
                if(data==-1){
                    break;
                }
                list.addAtBeginning(data);
                
            }
                list.display();
                //Linkedlist.display();
            }
            
        }
