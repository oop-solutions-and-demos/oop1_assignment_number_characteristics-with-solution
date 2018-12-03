package be.vives.oop.numbercharacteristics;

import java.util.Scanner;

/**
 * Number Characteristics
 */
public final class App {
    private App() {
    }

    /**
     * Number Characteristics
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to my number properties app.");
        System.out.print("Input two numbers and I will tell you some important characteristics about them.");
        System.out.println(" You can even input negative numbers.\n");

        Scanner console = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        int first = console.nextInt();

        System.out.print("Please input the second number: ");
        int second = console.nextInt();

        System.out.println("\nThank you. Here is some info about these numbers:");
        System.out.println("\t- first + second = " + (first+second));
        System.out.println("\t- first - second = " + (first-second));
        if (first > second) {
          System.out.println("\t- The biggest number is the first (" + first + ")");
        } else if (first < second) {
          System.out.println("\t- The biggest number is the second (" + second + ")");
        } else {
          System.out.println("\t- They are the same number");
        }

        System.out.println("\t- The first number is:");

        if (first % 2 == 0) {
          System.out.println("\t\t- even");
        } else {
          System.out.println("\t\t- uneven");
        }

        if (first >= 0) {
          System.out.println("\t\t- positive");
        } else {
          System.out.println("\t\t- negative");
        }

        System.out.println("\t\t- square is " + (first*first));

        System.out.println("\t- The second number is:");

        if (second % 2 == 0) {
          System.out.println("\t\t- even");
        } else {
          System.out.println("\t\t- uneven");
        }

        if (second >= 0) {
          System.out.println("\t\t- positive");
        } else {
          System.out.println("\t\t- negative");
        }

        System.out.println("\t\t- square is " + (second*second));

        System.out.println("\nThank you for using this application made by Nico.");
    }
}
