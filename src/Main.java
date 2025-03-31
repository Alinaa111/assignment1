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

                ProblemSolver.executeProblem(choice, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input:" + choiceStr + ". Please enter valid numbers");
            }
        }

        System.out.println("Thank you for using the program!");

        scanner.close();
    }
}