import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num = num / 10;
        }
         if (originalNum == reversedNum) {
            System.out.println(originalNum + " -> Palindrome");
        } else {
            System.out.println(originalNum + " -> Not Palindrome");
        }
        
        scanner.close();
    }
}