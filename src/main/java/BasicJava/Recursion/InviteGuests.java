package Recursion;

public class InviteGuests {

    public static void main(String[] args) {
        // Q. Find no of ways to invite n guests to a party
        // C1 - guest can come alone
        // C2 - guest can come in a pair with other guests

        int ways = guestCall(4);
        System.out.println(ways);
    }

    public static int guestCall(int n) {

        if (n <= 1) {
            return 1;
        }

        int singleCall = guestCall(n-1);
        int pairCall = (n - 1) * guestCall(n - 2);

        return singleCall + pairCall;

    }

}
