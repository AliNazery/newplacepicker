import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}