class ClassA{
    public void display() {
        System.out.println("Display in a");   
    }
}

class ClassB extends ClassA{
    @Override
    public void display() {
      //  super.display();
    }

}
public class MethodOverridding {
    public static void main(String q[]) {
        ClassB b = new ClassB();
        b.display();
        
    }
    
}
