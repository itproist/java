package Task;

import java.util.Scanner;

public class Task2 {
    public static double minNumbers(double a, double b) {
        return Math.min(a, b);
    }

    public static double maxNumbers(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble();
        System.out.println((5 * maxNumbers(a, b + 2) - 4 * minNumbers(1- a, b))/(3 + ((maxNumbers(a, b + 2))/(minNumbers(1- a, b)))));

        in.close();
    }
}
