/*Write a Java program that prints a welcome message and a hello message using two different classes Message and Hello, each with a default constructor that outputs a specific message.

Input Format:
No console Input.

Output Format:
The Output Should display the Welcome Message 

Sample 1 Input:
No input values.

Sample 1 Output:
Welcome Hello*/
class Message{
    public static void mess(){
        System.out.println("Welcome Message");
}
}
class Hello{
    public static void hell(){
        System.out.println("Welcome Hello");
    }
}
public class Main
{
    public static void main(String[] args)
    {
    Message me=new Message();
    Message.mess();
    Hello he=new Hello();
    Hello.hell();
    }
}

  
