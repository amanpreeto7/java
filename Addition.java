public class Addition {
    double pi = 22/7;
    public  void Sum(int a){
        System.out.println("Sum of two variables "+(a));
    }

    public  void Sum(double radius){
        System.out.println("Sum of two variables "+(pi*(radius*radius)));
    }
    public  void Sum(int a, int b, int c){
        System.out.println("Sum of three variables "+(a+b+c));
    }

    public  double Sum(double a, double b){
        System.out.println("Sum of two double variables "+((a*b)/2));
        return 0.0;
    }

    public static void main(String args[]){
        Addition addition = new Addition();
        addition.Sum(1,2);
        addition.Sum(1,2,3);
        addition.Sum(23.0, 3.0);
    }

}
