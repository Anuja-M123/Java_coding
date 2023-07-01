/*Xinyou has been trained to drive now. Dr. Dexter wants to get to a national conference to present Xinyou. The venue of the conference is d km away from his workshop. He wants to know if Xinyou will be able to make it to the conference in 'h' hours, driving within the city speed limit 's'.
Write a C program module that checks if he will be able to make it to the conference on time.

 
INPUT FORMAT:

Input consists of 3 lines.
The first line of input is a floating point number d (0 < d < 32767), which corresponds to the distance. 
The second line of input is a floating point number s (0 < s < 32767), which corresponds to the speed limit.
The third line of input is a floating point number h (0 < h < 32767), which corresponds to the time.
OUTPUT FORMAT:
Output consists of a single string 'Yes', 'No' or 'Invalid Input'.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT:
100
25
5
Yes
SAMPLE INPUT & OUTPUT 2:
150
-50
123
Invalid Input
SAMPLE INPUT & OUTPUT 3:
100
50
1
No*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=sc.nextFloat();
	double max=b*c;
	if(a<=0||b<0||c<=0)
	{
	    System.out.println("Invalid Input");
	}
	else{
	    if(a<=max){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.print("No");
	    }
	  
}
}
}
