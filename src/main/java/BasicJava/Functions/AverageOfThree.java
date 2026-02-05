package Functions;

import java.util.Scanner;

public class AverageOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter three nos to find their avrage : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        findAverage(a, b, c);

        sc.close();
    }

    public static void findAverage(float a, float b, float c) {
        System.out.println((a + b + c) / 3);
    }

}
