import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPin = "1234";
        String userPin = "";
        while (!userPin.equals(correctPin)) {
            System.out.print("Enter your PIN: ");
            userPin = scanner.nextLine();
            
            if (!userPin.equals(correctPin)) {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }

        System.out.println("PIN accepted. Access granted!");
        scanner.close();
    }
}