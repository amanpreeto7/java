import java.util.ArrayList;

public class FruitsArrayList {
    public static void main(String a[]){
        ArrayList<String> fruitsArray = new ArrayList<String>();
        fruitsArray.add("Apple");
        fruitsArray.add("Peach");
        fruitsArray.add("Orange");
        for(int i =0;i<fruitsArray.size();i++){
            System.out.println("fruit name "+fruitsArray.get(i));
        }

        System.out.println("After changing");
        fruitsArray.set(1, "Plum");
        for(int i =0;i<fruitsArray.size();i++){
            System.out.println("fruit name "+fruitsArray.get(i));
        }
        fruitsArray.remove(1);
        System.out.println("After removing");
        for(int i =0;i<fruitsArray.size();i++){
            System.out.println("fruit name "+fruitsArray.get(i));
        }

    }
    
}
