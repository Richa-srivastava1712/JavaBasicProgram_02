package JavaConditionalLoop03;

import java.util.Scanner;

/* nPr = factorial(n) / factorial(n-r)
        nCr = factorial(n)/(factorial(n-r) * factorial(r))
 */
public class PermutationCombination {

    public int factorial(int num) {
        int fact =1;
        for(int i=num;i>0;i--){
            fact *=i;
        }
        return  fact;
    }
    public static void main(String args[]){
        PermutationCombination p = new PermutationCombination();
        System.out.println("Enter number n for calculating permutations and combination ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number r for calculating permutations and combination ");
        int r = sc.nextInt();
        if(n<r){
            System.out.println("Enter valid number for n and r");
        }else {
            System.out.println("Permutation of nPr = " + p.factorial(n) / p.factorial(n - r));
            System.out.println("Cobination of nCr = " + p.factorial(n) / p.factorial(n - r)* p.factorial(r));
        }
    }
}
