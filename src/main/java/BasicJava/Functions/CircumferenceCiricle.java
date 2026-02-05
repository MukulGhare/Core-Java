package Functions;

import java.util.Scanner;

public class CircumferenceCiricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius to find circumference : ");
        float a = sc.nextFloat();

        System.out.println(circleCircum(a));
        sc.close();
    }

    public static double circleCircum(float r){
        return 2 * 3.14 * r;
    }
}
