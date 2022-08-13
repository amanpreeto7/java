import java.util.Scanner;

public abstract class Shape {
    public final float pie = 3.14f;
    public int length;
    public int breadth;
    Scanner scanner = new Scanner(System.in);

    public void getLength(){
        System.out.println("Enter length");
        length = scanner.nextInt();
    }

    public void getBreadth(){
        System.out.println("Enter breadth ");
        breadth = scanner.nextInt();
    }

    public int returnLength(){
        return length;
    }

    public int returnBreadth(){
        return breadth;
    }

    public abstract void calculateArea();

    
}
