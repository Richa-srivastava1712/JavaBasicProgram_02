package JavaConditionalLoop03;
/* Perfect number in java
  Perfect Number defination: Sum of factor is equal to the number itself
  Ex: 6   Factor of 6 are 1,2,3  If we add these 3 value together i.e. 1+2+3 =6 Hence 6 is perfect number
 */
import java.util.*;

public class PerfectNumber {
    public static void main(String args[]){
        int sum=1, num=0;
        System.out.println("Enter number to find perfect number or not");
        Scanner sc = new Scanner (System.in);
        num=sc.nextInt();
        for(int i =2; i<=num/2;i++){
            if(num%i==0){
                sum += i;
            }
        }

        if(sum ==num) {
            System.out.println(sum +" is a Perfect number");
        }else
            System.out.println(num +" is Not a perfect number");

    }
}
