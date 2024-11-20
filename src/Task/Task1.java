package Task;
import java.util.Scanner;

public class Task1 {
    public static double minNumbers(double a, double b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble();
        System.out.println(Math.sqrt(minNumbers(a, b)));

        in.close();
    }
}


