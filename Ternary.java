public class Ternary {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 15;

        String isBGreater = a>b? a>c? "A": b>c? "B": "C":"B";
        System.out.println("greater is "+isBGreater);
        
    }
    
}
