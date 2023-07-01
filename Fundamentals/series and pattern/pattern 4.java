/* Write a program to generate the given pattern.
If n = 4,

1
2 2
3 3 3
4 4 4 4

INPUT & OUTPUT FORMAT:

Input consists of a single integer, n. Assume that n>=3.
Refer to the sample input and output for formatting specifications.
Text in bold represents the input.

SAMPLE INPUT & OUTPUT 1:

5
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=1;
	for(int i=1;i<=a;i++){
	    for(int j=1;j<=i;j++){
	        System.out.print(b+" ");
	    }
	    b+=1;
	    System.out.println();}
	    
	    //System.out.print();
	}}

