import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. Choose one or more of the problems between 1 - 10. Enter number(s) to start");


        String input = scanner.nextLine();
        String[] choices = input.split("\\s+");

        for (String choiceStr : choices) {
            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice < 1 || choice > 10) {
                    System.out.println("Invalid choice: " + choice + ". Please enter a number between 1 and 10.");
                    continue;
                }

                executeProblem(choice, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input:" + choiceStr + ". Please enter valid numbers");
            }
        }

        scanner.close();
    }


    public static void executeProblem(int choice, Scanner scanner){
        if (choice == 1) {
            System.out.println("PROBLEM 1:\n" + "Enter n and array of this n elements:");

            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }


            double startTime = System.nanoTime();
            int res = minOfArray(arr);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;
            System.out.println("The minimum element of array is: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }

        if (choice == 2) {
            System.out.println("PROBLEM 2\n" + "Enter n and array of this n elements:");

            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }


            double startTime = System.nanoTime();
            double res = avgOfArray(arr);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;
            System.out.println("The average number of array is: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }


    }


    /*
    Problem 1
    This method takes array and returns its minimum element
    It uses for loop
    Time complexity:
    It iterates through array and finds min

    @param arr The array that would be iterated
    @return minimum element of the given array
     */

    public static int minOfArray(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }

        return min;
    }



    /*
    Problem 2
    This method takes array and returns its average
    It uses for loop
    Time complexity:
    It iterates through array, summarize elements and divides it by array size

    @param arr The array that would be iterated
    @return The average number of the given array
     */
    public static double avgOfArray(ArrayList<Integer> arr) {
        double summ = 0;
        for (int num : arr) {
            summ += num;
        }

        return summ / arr.size();
    }
}