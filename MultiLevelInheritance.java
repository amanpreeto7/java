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

class B extends A{
    public void setB(int b){
        System.out.println("b "+b);
    }
}
public class MultiLevelInheritance extends B{
    public void getValueA(){
       int a =  getA();
       System.out.println("value of a in child "+a);
    }

    public static void main(String a[]) {
        MultiLevelInheritance multiLevelInheritance = new MultiLevelInheritance();
        multiLevelInheritance.setA(10);
        multiLevelInheritance.getA();
        multiLevelInheritance.setB(10);    
    }
    
}
