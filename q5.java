import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;

        while (true) {
            System.out.print("Enter a number (negative number to stop): ");
            double num = scanner.nextDouble();
            if (num < 0) {
                break;
            }
            
            totalSum += num;
        }

        System.out.println("Final sum: " + totalSum);
        scanner.close();
    }
}