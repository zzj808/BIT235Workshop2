import java.util.Scanner;

public class DifferenceTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer number: ");
        int num2 = input.nextInt();

        int difference = num1 - num2;
        System.out.println("Difference of two numbers is: " + difference);

        input.close();
    }
}