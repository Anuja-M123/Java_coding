/* Write a  program to copy a string from one variable to other using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

The copied String is hello.*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String anu=sc.nextLine();
    String har=anu;
    System.out.print("The copied String is "+har);
    }
}
