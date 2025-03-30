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

        System.out.println("Thank you for using the program");

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

        if (choice == 3) {
            System.out.println("PROBLEM 3\n" + "Enter any number:");
            int n = scanner.nextInt();

            double startTime = System.nanoTime();
            String res = (isPrimeOrComposite(n) == 1) ? "Prime" : "Composite";
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The number is: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }

    }


    /*
    Problem 1
    This method takes array and returns its minimum element
    It uses for loop
    Time complexity: O(n), n is size of array
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
    Time complexity: O(n), n is size of array
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



    /*
    Problem 3
    This method checks if the given number is prime or composite
    It uses for loop
    Time complexity: O(n), n is input number
    For loop iterates through 2 to number itself

    @param n The number that is checked
    @return 1 or 0, depending on count
     */
    public static int isPrimeOrComposite(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 0) return 1;
        else return 0;
    }


    /*
    Problem 4
    This method calculates the factorial of a given number
    It uses recursive approach
    Time complexity: 0(n), where n is the input number.
    The recursive algorithm iterates through all numbers from n to
    resulting in linear time complexity.

    @param n The number for which the factorial is to be calculated.
    @return The factorial of the given number
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * factorial(n - 1);
    }
}