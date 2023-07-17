/*Write a Java program that takes user input of animal names in a single line, separated by spaces. The program should store the names in an ArrayList and then display the ArrayList as well as each individual animal name.
For Example:

Input: cow dog sheep

Output : ArrayList: [cow, dog, sheep]

Accessing individual elements: 

cow

dog

sheep

*/
  import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("Enter animal names separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] animalNames = input.split(" ");
        
        for (String name : animalNames) {
            animalList.add(name);
        }
        
        System.out.println("ArrayList: " + animalList);
        
        System.out.println("Accessing individual elements:");
        for (String animal : animalList) {
            System.out.println(animal);
        }
        
        scanner.close();
    }
}
