class A{
    private int a;
    public void setA(int a ){
        this.a = a;
    }

    public int getA(){
        System.out.println("value of a in class "+a);
        return a;
    }
}
public class SingleInheritance extends A{
    public void getValueA(){
       int a =  getA();
       System.out.println("value of a in child "+a);
    }

    public static void main(String a[]) {
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.setA(10);
        singleInheritance.getA();

        singleInheritance.getValueA();

        A aClass = new A();
        aClass.getA();

        
    }
    
}
