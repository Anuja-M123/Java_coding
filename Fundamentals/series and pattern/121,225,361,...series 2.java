/* QUESTION:
Write a program to generate the first n terms in the series 

121,225,361,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

4
SAMPLE OUTPUT:

121 225 361 529 */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=11;
	System.out.print(c*c);
	for(int i=1;i<n;i++)
	{
	    c+=4;
	    System.out.print(" "+(c*c));
	}	
	    
	}
}
