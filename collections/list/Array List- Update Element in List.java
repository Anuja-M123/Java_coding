/* Write a Java program that allows the user to input a series of elements separated by spaces. It then splits the input string into individual elements and adds them to the ArrayList called programmingLanguages. After printing the original ArrayList, the program prompts the user to enter a modified language. It also asks the user to provide an index value to specify the position in the ArrayList to modify. The program then replaces the element at the specified index with the modified language. Finally, it prints the modified ArrayList.


For Example:

Input: python java c

 cpp

1

Output : ArrayList: [python, java, c]

Modified ArrayList: [python, cpp, c]

*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> input=new ArrayList<>();
        String anu=sc.nextLine();
        String[] anufinal=anu.split(" ");
        for(String anu2:anufinal){
            input.add(anu2);
        }
        System.out.println("ArrayList: "+input);
        String modifier=sc.nextLine();
        int a=sc.nextInt();
        if(a>=0&&a<input.size()){
            input.set(a,modifier);
            //String anu2=input.set(a);
            System.out.println("Modified ArrayList: "+input);
        }
        else{
            System.out.println("Invalid index");
        }
        
        
    }
}
