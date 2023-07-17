/* Write a program to change the given string to uppercase without using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

good

GOOD*/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String anu=sc.nextLine();
     System.out.println(anu.toUpperCase());
    }
}
