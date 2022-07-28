import java.util.Scanner;

public class HelloWorldRecursion {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int enteredNumber = 1;
        while(enteredNumber >=1 && enteredNumber<10){
            System.out.println("Enter any number between 1 and 9");
            enteredNumber = scanner.nextInt();
            for(int j =0;j<i;j++){
                System.out.println("Hello world ");
            }
            i++;
        }
        System.out.println("Bye Bye");
    }
}
