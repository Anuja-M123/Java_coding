/*Write a program to count the number of vowels in the given string:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

Number of vowels: 2*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String anu=sc.nextLine();
    int count=0;
    for( int i=0;i<anu.length();i++){
        if(anu.charAt(i)=='a'||anu.charAt(i)=='e'||anu.charAt(i)=='i'||anu.charAt(i)=='o'||anu.charAt(i)=='u'){
            count++;
        }
        //System.out.print(count);
    }
    System.out.print("Number of vowels: "+count);
    }
}
