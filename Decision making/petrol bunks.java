/*Dr. Dexter has now started his trip to Shinyao. Unfortunately, he has forgotten about the fuel. There are two gas bunks on the way to Shinyao, 'A' and 'B'. As soon as his car reaches the bunk A, it runs out of fuel. Bunks A and B are 'd' miles apart. Xinyou, the robot finds out from statistics that one of the bunks provides the best quality fuel. They decide on filling the best quality fuel.
Write a C program module that finds the quantity of fuel that has to be filled at bunks A and B.
 
INPUT FORMAT:
Input consists of 4 lines.
The first line of input is an integer d (0 <  d < 32767), which corresponds to the distance between bunks A and B
The second line of input is an integer s (0 <  s < 32767), whcih corresponds to the distance between bunk A and Shinyao.
The third line of input is a floating point number 'm' corresponding to the mileage Dr.Dexter's car yields.
The fourth line of input is the character 'b' corresponding to the bunk that provides the best quality fuel. Assume that b takes values either 'A' or 'B'
Assume that bunk A lies before bunk B.
OUTPUT FORMAT:
Output consists of the quantities of fuel to be filled at bunks A and B, correct up to 2 decimal places.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT:
100
200
25
B
4.00
4.00
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	int s=sc.nextInt();
	float m=sc.nextFloat();
	char b=sc.next().charAt(0);
	if(b=='A'){
	    System.out.printf("%.2f\n",s/m);
	    System.out.printf("%.2f",0/m);
	}
	else if(b=='B'){
	    System.out.printf("%.2f\n",d/m);
	    System.out.printf("%.2f",(s-d)/m);
	}
	}
}
