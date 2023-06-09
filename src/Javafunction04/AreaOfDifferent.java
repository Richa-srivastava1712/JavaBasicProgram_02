package Javafunction04;

public class AreaOfDifferent {

    static double AreaOfCircle(double r){
        final double pie= 2.17;
        return 2*pie*r;
    }



    public static void main(String args[]){
        double CircleArea = AreaOfCircle(2.0);
        System.out.println(CircleArea);
    }
}
