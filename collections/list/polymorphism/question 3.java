/* Write a Java program to demonstrate method overriding and dynamic method dispatch.

Create a class named 'Animal' with a method named 'Print' that prints "Animal" to the console. Next, create two subclasses named 'Dog' and 'Cat' that inherit from the 'Animal' class and override the 'Print' method to print "Dog" and "Cat" to the console, respectively.

In the 'Main' class, declare a variable 'a' of type 'Animal' and initialize it with a new object of the 'Dog' class. Call the 'Print' method on the 'a' variable and observe that "Dog" is printed to the console.

Next, set the 'a' variable to a new object of the 'Cat' class and again call the 'Print' method. Observe that "Cat" is printed to the console this time.

Input Format
No console input.

Output Format
Print the String from subclass named Dog and Cat in seperate lines.

Sample Input

Sample Output
Dog
Cat
*/
import java.util.Scanner;
class Animal{
    public  void print(){
        System.out.println("Animal");
}
}
class Dog extends Animal{
    public  void print(){
        System.out.println("Dog");
}
}
class Cat extends Animal{
    public  void print(){
        System.out.println("Cat");
}
}
public class Main{
    public static void main(String[] args){
        Animal a=new Dog();
        a.print();
        Animal ab=new Cat();
        ab.print();
    }
}
