/* Write a program to find whether the given string is palindrome or not without using string library functions:


Input Format:

Input consist of 1 string.
If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.
Sample Input & Output:
computer
Not a Palindrome */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String anu1=sc.nextLine();
        StringBuffer anu2=new StringBuffer(anu1);
        anu2.reverse();
        if(anu1.equals(anu2)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
