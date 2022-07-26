public class IfStatements {
    public static void main(String args[]){
        int a = 9;
        int b = 20;

        if(a<b){
            System.out.println("A is less than B");
            if(a<10){
                System.out.println("A is less than 10");
            }
        }else if(b>a){
            System.out.println("B is greater than A");
        }else{
            System.out.println("a is equal to b");
        }

        String java = "Javaa";
        switch(java){
            case "java": System.out.println(" java in small");
            break;
            case "jaVa": System.out.println(" java in small, v capital");
            break;
            case "Java": System.out.println(" java correct");
            break;
            default: System.out.println(" in default");
            
        }
    }
    
}
