class Animals{
    String color = "Black";
    String activity;
    final float gst = 0.18f;
    Animals(String activity){
        this.activity = activity;
        System.out.println("Constructor called");
    }
    void getActivity(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animals{
    private String color;
    Dog(String activity){
        super(activity);
    }
    void setColor(String color){
        this.color = color;
        System.out.println("color "+this.color+" parent color "+super.color);
    }

    void getActivity() {
        super.getActivity();
        System.out.println("Animal is barking");
    }
}

public class superjava {
    public static void main(String a[]) {
        Dog dog = new Dog("walk");
        dog.setColor("red");
        dog.getActivity();
    }
   

    
}
