import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Enter radius value: ");
        double radius = input.nextDouble();

        double area = pi * Math.pow(radius, 2);
        System.out.println("Area of circle = " + area);

        input.close();
    }
}