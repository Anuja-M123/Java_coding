/* You are playing the PUBG game and you entered into the bootcamp. There you viewed the drop box which was filled with guns. you have to choose the biggest gun in the drop box.Find the biggest gun and you will get  the chicken dinner. 
Input Format:

Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

Output Format:

Refer  sample output for details.

Sample Input 1:

5

2

3

6

8

1

Sample Output 1:

8 is the maximum element in the array*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //size declare
        int size=sc.nextInt();
        //array declaration
        int[]arr=new int[size];
        //input loop
        for(int i=0;i<size;i++){
            //get values from user 
            arr[i]=sc.nextInt();
        }
        //creat dummy variable
        int temp=0;
        //output loop
        for(int i=0;i<size;i++){
            if(arr[i]>temp){
            temp=arr[i];}}
            System.out.println(temp+" "+"is the maximum element in the array");
                }
        }
        
        
    
