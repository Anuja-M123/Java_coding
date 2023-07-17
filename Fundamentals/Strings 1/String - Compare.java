/* Write a  program to find whether the given two strings are same or not using string library functions:

Input& Output Format:

Input consist of 2 string.
If two strings are same display “Strings are same”,else display “Strings are not same”.
Sample Input & Output:

hello

hello*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String anu1=sc.nextLine();
    String anu2=sc.nextLine();
    if(anu1.equals(anu2)){
        System.out.print("Strings are same");
    }
    else{
        System.out.print("Strings are not same");
    }
    //System.out.println()
    }
}
