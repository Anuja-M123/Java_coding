/* QUESTION:
Scientists say a lot about the problems of global warming and cooling of the Earth. Indeed, such natural phenomena strongly influence all life on our planet.

Our hero Vasya is quite concerned about the problems. He decided to try a little experiment and observe how outside daily temperature changes. He hung out a thermometer on the balcony every morning and recorded the temperature. He had been measuring the temperature for the last n days. Thus, he got a sequence of numbers t1, t2, ..., tn, where the i-th number is the temperature on the i-th day.

Vasya analyzed the temperature statistics in other cities and came to the conclusion that the city has no environmental problems, if first, the temperature outside is negative for some non-zero number of days, and then the temperature is positive for some non-zero number of days. More formally, there must be a positive integer k (1 ≤ k ≤ n - 1) such that t1 < 0, t2 < 0, ..., tk < 0 and tk + 1 > 0, tk + 2 > 0, ..., tn > 0. In particular, the temperature should never be zero. If this condition is not met, Vasya decides that his city has environmental problems, and gets upset.

You do not want to upset Vasya. Therefore, you want to select multiple values of temperature and modify them to satisfy Vasya's condition.
Write a program to determine the least number of temperature values needs to be changed for that.



INPUT & OUTPUT FORMAT:
The first input contains a single integer n (2 ≤ n ≤ 20), which corresponds to the number of days for which Vasya has been measuring the temperature.
The next 'n' lines correspond to the sequence of temperature values.
The output is an integer, which displays the least number of temperature values needs to be changed.
[All text in bold represents the input, and the remaining represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the number of days
 4
Enter the sequence of temperature values
 -1
1
-2
1
The least number of temperature values needs to be changed = 1
SAMPLE INPUT & OUTPUT 2:
Enter the number of days
 5
Enter the sequence of temperature values
 0
-1
1
2
-5
The least number of temperature values needs to be changed = 2*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n = sc.nextInt();
        System.out.println("Enter the sequence of temperature values");
        int[] temperatures = new int[n];
        for(int i=0;i<n;i++){
            temperatures[i]=sc.nextInt();
        }
        int changesneeded = findchangesneeded(temperatures);
        System.out.println("The least number of temperature values needs to be changed = "+changesneeded);
        
    }
    private static int findchangesneeded(int[] temperatures){
        int changesneeded =0;
        boolean negativefound = false;
        boolean positivefound = false;
        for(int i =0;i<temperatures.length;i++){
            if(temperatures[i]==0){
                if(i>0 && i<temperatures.length- 1){
                    if(temperatures[i - 1]<0 && temperatures[i + 1]>0){
                        temperatures[i] =1;
                        changesneeded++;
                    }
                }
            }else if(temperatures[i]<0){
                negativefound = true;
                if(positivefound){
                    changesneeded++;
                    positivefound=false;
                }
            }else{
                positivefound=true;
                if(!negativefound){
                    changesneeded++;
                    negativefound=true;
                }
            }
        }
        return changesneeded;
    }
}
