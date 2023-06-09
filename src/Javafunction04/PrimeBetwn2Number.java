package Javafunction04;

public class PrimeBetwn2Number {
    public static int[] primeNumber(int a, int b){
        int count =0, arraysize =0, flag =1;
        if(a>b){
            arraysize= a-b;
        }else
            arraysize= b-a;
        int array[] = new int[arraysize];
        for(int i=a; i<=b;i++){
            for(int j =2; j<i/2; j++) {
                if (i % j == 0) {
                    flag =0;
                    break;
                }

                } if(flag ==1)
                    array[count]= i;
                    count++;





        }
        return array;
    }

    public static void main(String args[]){

        int arr[]=primeNumber(10,20);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
