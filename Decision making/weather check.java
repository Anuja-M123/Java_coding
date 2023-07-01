/* Xinyou has an in-built GPS system that gives its current position coordinates as input. Using these coordinates Xinyou gets the current weather information. Initially, Dr. Dexter wants Xinyou to drive only when it is sunny. The different weather conditions are 'sunny', 'rainy', and 'foggy'.

Given the weather condition, write a program to check whether Xinyou can drive or not.
 
INPUT FORMAT:

Input consists of a string, corresponding to the weather condition.

OUTPUT FORMAT:

Output is a string "Yes I can drive smile" or "Sorry invalid input :|" or "No I cant drive sad".
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
sunny
Yes I can drive :)
SAMPLE INPUT & OUTPUT 2:
misty
Sorry invalid input :|
SAMPLE INPUT & OUTPUT3:
rainy
No I cant drive :(    */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    if(str.equalsIgnoreCase("Sunny")){
        System.out.println("Yes I can drive :)");
    }
    else if(str.equals("misty")){
        System.out.println("Sorry invalid input :|");
    }
    else if(str.equals("rainy")){
        System.out.println("No I cant drive :(");
    }
	}
}
