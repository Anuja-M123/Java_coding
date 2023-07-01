/*Dr. Dexter's car's seat belt detectors have been corrupted. So he wants you to build a module which checks if all the seat belts are worn. If and only if all the seat belts are worn Xinyou must start driving.
Write a program module that checks if all the seat belts have been worn.

 
INPUT FORMAT:

Input consists of 3 lines.
The 3 lines consist of strings 'yes' or 'no' corresponding to whether the seat belts have been worn or not.
OUTPUT FORMAT:
Output consists of a single string 'Yes I can drive' or 'No I can't drive' or 'Invalid Input'
Refer to the sample input and output for formatting specifications. 
Assume that all inputs consist of lowercase characters only.
[All text in bold corresponds to input and the rest to output.]

SAMPLE INPUT & OUTPUT 1:
yes
yes
yes
Yes I can drive  
SAMPLE INPUT & OUTPUT 2:
No
Yes
Yes
Invalid Input
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    String str3=sc.next();
    if(str1.equals("yes")&&str2.equals("yes")&&str3.equals("yes")){
        System.out.println("Yes I can drive");
	}
	else if(str1.equals("no")&&str2.equals("no")&&str3.equals("no")){
	    System.out.println("No I can't drive");
	}
	else{
	    System.out.println("Invalid Input");
	}
}
}
