package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter numerator : ");
        int num = scan.nextInt();

        System.out.print("Enter denominator : ");
        int deno = scan.nextInt();

        System.out.println(divide(num, deno));

    }

    static double divide(int a, int b) {
        double result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(" Opps ! Cannot divide by zero :( ");

        } catch (InputMismatchException e) {
            System.out.println(" LMAO ! Please enter a whole no ");
        } catch (Exception e) {
            System.out.println(" Did not anticipate this BRO ");
            System.out.println(e);
        } finally {
            scan.close();
        }

        return result;

    }

}
