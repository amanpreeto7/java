import java.util.Scanner;

class ShapeOverridding{
    int a;
    int b;

    public void getValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        a = scanner.nextInt();
        System.out.println("Enter b ");
        b = scanner.nextInt();
    }
}

class RectangleOverridding extends ShapeOverridding{
    @Override
    public void getValues() {
        super.getValues();
        int c = super.a*super.b;
        System.out.println("area of rectange "+c);
    }
}

public class SquareOverridding extends ShapeOverridding{
    @Override
    public void getValues() {
        //super.getValues();
         int c = super.a*super.a;
         System.out.println("area of square "+c);
    }

    public static void main(String[] args) {
        SquareOverridding squareOverridding = new SquareOverridding();
        squareOverridding.getValues();

        RectangleOverridding rectangleOverridding = new RectangleOverridding();
        rectangleOverridding.getValues();
    }
    
}
