import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // compare full string
        boolean stringsEqual = str1.equals(str2);
        System.out.println("the two given strings are equal: " + stringsEqual);

        // compare first character
        char firstChar1 = str1.charAt(0);
        char firstChar2 = str2.charAt(0);
        boolean firstCharSame = firstChar1 == firstChar2;
        System.out.println("First characters are same: " + firstCharSame);

        input.close();
    }
}