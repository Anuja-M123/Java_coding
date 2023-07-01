/*QUESTION:
Write a program to generate the given pattern.

if n = 4,
   *
  **
 ***
****

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n.
Refer to the sample input and output for formatting specifications.
SAMPLE INPUT:

4
SAMPLE OUTPUT:
   *
  **
 ***
*****/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get vals from user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//looping
		for(int i=n;i>=1;i--){
		   for(int j=1;j<i;j++)
		    {
		        System.out.print(" ");
		        
		    }
		       for(int k=n;k>=i;k--)
		       {
		           System.out.print("*");
		       }
		       System.out.println();
		}
	}}
