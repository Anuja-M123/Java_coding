Write a Java program that allows the user to input a space-separated list of animal names. It then stores each animal name in an ArrayList. After that, the program prompts the user to enter an index value. If the entered index is valid (within the range of the ArrayList), the program retrieves the element at that index from the ArrayList and displays it along with the index. However, if the entered index is invalid (out of range), it prints "Invalid index!".

To summarize, the program builds an ArrayList of animal names based on user input and allows the user to retrieve an element from the ArrayList by providing an index.


For Example:

Input: cow dog sheep done

 2

Output : ArrayList: [cow, dog, sheep, done]

Element at index 2: sheep


  
  
  
  import java.util.Scanner; 
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> animalslist=new ArrayList<>();
	String input=sc.nextLine();
	String[] animals=input.split(" ");
	for(String animal:animals){
	    animalslist.add(animal);
	}
	System.out.println("ArrayList: "+animalslist);
	
	    int index=sc.nextInt();
	    if(index >=0 && index<animalslist.size()){
	        String animal=animalslist.get(index);
	        System.out.println("Element at index "+index+": "+animal);
	    }
	    else{
	        System.out.println("Invalid index!");
	    }
	}
}
