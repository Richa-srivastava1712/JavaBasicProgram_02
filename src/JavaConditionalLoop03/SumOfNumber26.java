package JavaConditionalLoop03;

import java.util.Scanner;

/* Write a program to print the sum of negative numbers, sum of positive even numbers and
 the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.
 */
public class SumOfNumber26 {

    public static void main(String args[]) {
        int n, negativeNumSum=0, PositiveEvenNumSum=0, PositiveOddNumSum=0;
        Scanner sc = new Scanner(System.in);
        while((n = sc.nextInt())!=0){

            if(n< 0) {
                negativeNumSum += n;
            } else if (n>0) {
                if(n%2 ==0){
                    PositiveEvenNumSum +=n;
                }
                else
                {
                    PositiveOddNumSum += n;
                }
            }
        }
        System.out.println("Negative Number Sum : " + negativeNumSum);
        System.out.println("Positive Even Number sum : "+ PositiveEvenNumSum);
        System.out.println("Positive Negative Number Sum : "+ PositiveOddNumSum);

    }
}