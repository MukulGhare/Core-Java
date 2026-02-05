package Functions;

import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n to find the sum of all odd nos from 1 to n ");
        int a = sc.nextInt();

        System.out.println(sumOfOdd(a));
        sc.close();
    }

    public static int sumOfOdd(int n) {
        int sum = 0;
        for(int i=1; i<=n ;i++){
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        return sum;
    }
}
