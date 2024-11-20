package Task;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        int maxElement = myArray[0];
        for (int value : myArray) {
            if (Math.abs(value) > Math.abs(maxElement)) {
                maxElement = value;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += maxElement;
        }

        System.out.println(Arrays.toString(myArray));

        in.close();
    }
}

