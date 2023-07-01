/* Dr. Dexter is now in the gas bunk. He has filled fuel with your help and now is about to take an air check. He wants Xinyou to fill air. Dr. Dexter owns a Honda Civic and Xinyou gets to know that the air pressure to be filled in the front tyres is 33 PSI and rear tyres is 32 PSI. 
Write a C program to check if the tyres already have enough air and print whether the tyres have to be deflated, inflated or left untouched. 
  
INPUT FORMAT:
Input consists of 4 lines of floating point numbers, each corresponding to the air pressure in each of the tyres. 
The first line corresponds to the front-left tyre. 
The second line corresponds to the rear-left tyre. 
The third line corresponds to the rear-right tyre. 
The fourth line corresponds to the front-right tyre. 
OUTPUT FORMAT:
Output consists of 4 lines.  
Refer to the sample input and output for formatting specifications.  
SAMPLE INPUT & OUTPUT: 
33 
35 
40 
31 
Front-left : Untouched 
Rear-left : Deflate 
Rear-right : Deflate 
Front-right : Inflate 
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=sc.nextFloat();
	float d=sc.nextFloat();
	if(a==33){
	    System.out.println("Front-left : Untouched");
	}
	else{
	    String e1 = (a>33?"Front-left : Deflate" : "Front-left : Inflate");
	    System.out.println(e1);
	}
	if(b==32){
	    System.out.println("Rear-left : Untouched");
	}
	else{
	    String e2 = (b>32?"Rear-left : Deflate":"Rear-left : Inflate");
	    System.out.println(e2);
	}
	if(c==32){
	    System.out.println("Rear-right : Untouched");
	}
	else{
	    String e3=(c>32?"Rear-right : Deflate":"Rear-right : Inflate");
	    System.out.println(e3);
	}
    if(d==33){
        System.out.println("Front-right : Untouched");
    }
    else{
        String e4=(d>33?"Front-right : Deflate":"Front-right : Inflate");
        System.out.println(e4);
    }
	}
}
