/* Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello

The string is Hello */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        //ring[] s2=s1.split(",");
        //for(String s3:s2){
        System.out.println("The string is"+" "+s1);
    }
}

  
