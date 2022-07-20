public class LocalVariable {
    //instance
    int variableA;
   static int variableB;
    int instanceVariable;

    public void function(){

        //local
        int a = 10; 
        int b = 20;

    }
    public static void main(String args[]){
       
        LocalVariable obj1 = new LocalVariable();
        obj1.instanceVariable = 10;
        obj1.variableA = 20;
        obj1.variableB = 30;
        System.out.println("instance of local variable"+obj1.instanceVariable+" a and b "+obj1.variableA +" "+obj1.variableB);

        LocalVariable obj2 = new LocalVariable();
        obj2.instanceVariable = 100;
        System.out.println("instance of local variable"+obj2.instanceVariable+" a and b "+obj2.variableA +" "+obj2.variableB);

    }
    
}
