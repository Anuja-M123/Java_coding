/* Ree and Ahamed attending a college symposium. Both were plan to attend a TREASURE HUNT event. The event manager hidden some of the treasures inside the particular ground. They both have to find the special treasure in the identified treasures. Help them to find the special treasure in the event.

Input Format:

Input consists of n+2 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. The last integer corresponds to ‘a’, the element to be searched.

Output Format:

Refer  sample output for details.

Sample Input 1:

5

2

3

6

8

1

6

Sample Output 1:

6 is present in the array*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[]arr=new int[size];
    //int x=sc.nextInt();
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();}
   
    int x=sc.nextInt();
   for(int i=0;i<size;i++){ 
    if(x == arr[i])
    {
            System.out.print(x+ " is present in the array");
            return;
        }
    //else{
   }
    System.out.print(x+" is not present in the array");
        //brea}
    }}

    

