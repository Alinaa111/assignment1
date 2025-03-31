import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    public static ArrayList<Integer> readArray(Scanner scanner) {
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        return arr;
    }

    public static void printExecutionTime(double startTime, double endTime) {
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
