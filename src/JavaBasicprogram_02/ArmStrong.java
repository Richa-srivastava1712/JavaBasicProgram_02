package JavaBasicprogram_02;
// Question number 8 Day 02
// To check Whether number is Armstrong or not.
import java.lang.Math;

public class ArmStrong {
    public static boolean isArmstrong(int num) {
        int temp, count = 0, sum = 0, last =0;

        // Count each digit within number
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        //System.out.println(count);
        temp = num;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, count);

            temp = temp/10;
        }
        //System.out.println(sum);
        if (sum ==num){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
   Boolean armstrongCheck =isArmstrong(154);
   if (armstrongCheck ==Boolean.TRUE){
       System.out.println("Number is armstrong");
   }else
       System.out.println("Number is not Armstrong");
      }

}