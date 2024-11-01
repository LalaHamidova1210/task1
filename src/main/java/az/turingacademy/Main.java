import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" enter any number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println(" The number is 0");
        } else {
            if (number > 0) {
                System.out.println(" The number is positive :) ");
            } else {
                System.out.println(" The number is negative  ");
            }

            if (number % 2 == 0) {
                System.out.println(" The number is even ");
            } else {
                System.out.println("The number is odd");
            }
        }

        scanner.close();
    }
}
