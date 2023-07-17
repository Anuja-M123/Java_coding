/* Write a Java Program to Create a Class named Player with the following member variables/attributes. Create another Class called Main and write a main method to get the player details in a string separated by a comma. Use String. Split() function to display the details.

Sample 1 Input:
MS Dhoni,India,Wicket Keeper 

Sample 1 Output:
Player Details
Player Name: MS Dhoni
Country Name: India
Skill: Wicket Keeper 

Sample 2 Input:
Virat Kholi,India,Batsman 

Sample 2 Output:
Player Details
Player Name: Virat Kholi
Country Name: India
Skill: Batsman

*/
import java.util.Scanner;
class Cricket
{
    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m=s.split(",")[0];
        String p=s.split(",")[1];
        String q=s.split(",")[2];
    
}
public class Main
{
    public static void main(String[] args)
    {
        //write your code
        Cricket cc=new Cricket();
        System.out.println("Player Details");
        System.out.println("Player Name: "+cc.m);
        System.out.println("Country Name: "+cc.p);
        System.out.println("Skill : "+cc.q);
    }
}
