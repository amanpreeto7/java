public class CalculateSquare extends Shape {
    int length;
    @Override
    public void calculateArea() {
        System.out.println("area is " +(length*length));
    }

    @Override
    public void getBreadth() {
        super.getBreadth();
    }

    @Override
    public void getLength() {
        super.getLength();
    }

    @Override 
    public int returnBreadth(){
        System.out.println("super.returnBreadth() "+super.returnBreadth());
        length = super.returnBreadth();
       return length;
    }

    public static void main(String a[]) {

        CalculateSquare calculateSquare = new CalculateSquare();
        calculateSquare.getBreadth();
        calculateSquare.getLength();
        calculateSquare.returnBreadth();
        calculateSquare.calculateArea();
    }
    
}
