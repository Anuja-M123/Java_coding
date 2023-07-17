/* Given a Book class and the main class, write a MyBook class that does the following:

Inherits from the book and has a parameterized constructor taking these 3 parameters:

string title
string author
int price
Implements the Book class' abstract display() method so it prints the title, author, and price.

Input Format
The first line of the input consists of a string
The second line of the input consists of a string
The third line of the input consists of an integer

Output Format
Display the book details.

Constraints
Strings and integers only.

Sample Input
love
jack
300

Sample Output
Title: love
Author: jack
Price: 300
Sample Input
stars
juno
150
Sample Output
Title: stars
Author: juno
Price: 150
*/
import java.util.Scanner;
class Book{
//Scanner sc=new Scanner(Sytem.in);
    public static void book(){
        Scanner sc=new Scanner(System.in);
        String a1=sc.nextLine();
        String a2=sc.nextLine();
        int a3=sc.nextInt();
        System.out.println("Title: "+a1);
        System.out.println("Author: "+a2);
        System.out.println("Price: "+a3);
        
}
}
class MyBook extends Book{
    public static void mybook(){
        //System.out.println("Title: "+a1);
        //System.out.println("Author: "+a2);
        //anujaajdxsvcvd cfaaSystem.out.println("Price: "+a3);
    }
}
    public class Main{
    public static void main(String[] args){
        MyBook bookkk=new MyBook();
        bookkk.book();
    }
}
