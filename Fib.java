public class Fib {
    public static void main(String args[]) {
        int c = 1, a= 1, b = 1;
        for(int i =0; i<10;i++){
            c = a+b;
            b = a;
            a = c;
            System.out.println(String.valueOf(c));
        }
        
    }
    
}
