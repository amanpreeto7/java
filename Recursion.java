class Recursion{
    public int factorial(int a){
        if(a>1)
        return a*factorial(a-1);
        else{
            return 1;
        }
    }
    public static void main(String args[]) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(5));;
    }
}