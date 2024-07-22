import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        return sum;
    }
}
