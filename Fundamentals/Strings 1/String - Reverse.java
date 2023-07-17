/* Write a  program to find the reverse of the given without string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

The reversed String is olleh*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String anu=sc.nextLine();
    StringBuffer s1=new StringBuffer(anu);
    s1.reverse();
    System.out.println("The reversed String is "+s1);
    }
}
