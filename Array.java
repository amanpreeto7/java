public class Array {
    public static void main(String args[]) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        String arrayS[] = new String[10];
        for(int i =0; i< array.length; i++){
            array[i] = i;
            arrayS[i] = String.valueOf(i+65);
        }
        array[5] = 50;
        for(int i =0; i<array.length;i++){
            System.out.println("item at "+i+" is "+array[i] +" string array "+arrayS[i]);
        }

        array[12] = 12;
        
    }
    
}
