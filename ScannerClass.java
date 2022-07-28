import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter any integer ");
        // int a = scanner.nextInt();
        // System.out.println(" Input integer is "+a);

        System.out.println("Enter any string ");
        String inputString = scanner.nextLine();
        System.out.println("input string value "+inputString);
    }
}
