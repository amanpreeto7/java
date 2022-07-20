public class StaticVariables {
    static int var = 0;

    public static void main(String args[]){
        StaticVariables staticVariable = new StaticVariables();
        staticVariable.var = 10;
        StaticVariables staticVariable1 = new StaticVariables();
        System.out.println("staticVariable1.var "+staticVariable1.var);;

        StaticVariables staticVariable2 = new StaticVariables();
        System.out.println("staticVariable2.var "+staticVariable2.var);;
        staticVariable2.var = 20;
        
        StaticVariables staticVariable3 = new StaticVariables();
        System.out.println("staticVariable3.var "+staticVariable3.var);;

    }
    
}
