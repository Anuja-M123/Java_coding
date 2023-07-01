/* import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=0,x1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                x+=arr[i];
            }
            if(arr[i]%2!=0){
                x1+=arr[i];
            }
            
        }System.out.println("The sum of the even numbers in the array is "+x);
        System.out.print("The sum of the odd numbers in the array is "+x1);}
}*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=0,x1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                x+=arr[i];
            }
            if(arr[i]%2!=0){
                x1+=arr[i];
            }
            
        }System.out.println("The sum of the even numbers in the array is "+x);
        System.out.print("The sum of the odd numbers in the array is "+x1);}
}
