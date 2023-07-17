/* QUESTION:
John is the class teacher of class 9. After summer vacation, the school was reopened. As it was the first day of the school, John wants to arrange seats for his students. He asked them to sit in the order as they come. The student who comes first sits in first place, the student who comes second sits in second place and so on. The seats are arranged in the order that the students sit behind already seated students. Implement this concept using Linked list - append.



INPUT FORMAT:

Enter the data for the nodes one by one.
-1 indicates the end of the linked list.
OUTPUT FORMAT:

Refer the sample input and output for formatting specifications.
SAMPLE INPUT:

4
2
1
5
-1
SAMPLE OUTPUT:

4 2 1 5
*/
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
    public void append(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;}
    else{
        Node current=head;
        while (current.next!=null){
            current=current.next;
            
        }
        current.next=newNode;}
        
    }
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
                list.append(data);
                
            }
                list.display();
                //Linkedlist.display();
            }
            
        }
    
            
        
    


