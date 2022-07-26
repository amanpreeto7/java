
public class LoopingStatments {
    public static void main(String args[]) {
        for(int i = 0; i<5;i++){
            for(int j = 0; j<i;j++){
                System.out.print("x");
            }
            System.out.print("\n");
        }

        for(int i = 5; i>0;i--){
            for(int j = 0; j<i;j++){
                System.out.print("x");
            }
            System.out.print("\n");
        }

        int a = 8;
        while(a<10){
            System.out.println("value of a ");
            a++;
        }

        var doVariable = 0;
        do{
            doVariable++;

            if(doVariable == 3){
                continue;
            }
            if(doVariable == 8){
                break;
            }
            System.out.print(doVariable);

        }while(doVariable<10);

        for(int i =0; i<10; i++){
            if(i == 3){
                continue;
            }
            System.out.println("value of i "+i);

        }

    }
}
