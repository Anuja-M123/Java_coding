Write a Java program that allows the user to input programming languages and stores them in an ArrayList. The program should continue accepting languages until the user press the "Enter" key. Finally, the program should display the ArrayList of programming languages. Can you provide the code for this program.

Sample Input:
Con Sen Sus

Sample Output:
ArrayList: [Con, Sen, Sus]

  import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> a=new ArrayList<String>();
	
	String anu=sc.nextLine();
	String[] anufinal=anu.split(" ");
    for(String anu2:anufinal){
        a.add(anu2);
        	if(a.isEmpty()){
	    break;
	}}
	
	  System.out.println("ArrayList: "+a);
	
	}
}
