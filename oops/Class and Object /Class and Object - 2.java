/* Write a Java program to Create a class named Player with the following member variables/attributes. Create another class named Main and write a main method to test the above class.

Input Format
The first line consists of a string that represents the name
The second line consists of a string that represents the country
The third line consists of a string that represents the skill

Output Format
The Output Should Display the Player Details 

Sample 1 Input:
Dhoni
India
Wicket-Keeper 

Sample 1 Output:
Player Details
Player Name: Dhoni
Country Name: India
Skill : Wicket-Keeper 

Sample 2 Input:
Virat Kholi
India
Batsman 

Sample 2 Output:
Player Details
Player Name: Virat Kholi
Country Name: India
Skill : Batsman

*/
import java.util.Scanner;
class Player{
    public static void play() {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        System.out.println("Player Details");
        System.out.println("Player Name: "+a);
        System.out.println("Country Name: "+b);
        System.out.println("Skill: "+c);
    }
}
    
    public class Main
{
    public static void main(String[] args)
    {
     //Scanner sc=new Scanner(System.in);
     System.out.println("Player Detalis");
     Player anu = new Player();
     Player.play();
    }
}
