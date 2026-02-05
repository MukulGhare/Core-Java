package Functions;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter find if person can vote : ");
        int a = sc.nextInt();

        System.out.println(canVote(a));
        sc.close();
    }

    public static String canVote(int a) {
        if (a<18){
            return "NO";
        } else {
            return "YES";
        }
    }
}
