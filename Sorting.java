public class Sorting {
    public static void main(String s[]) {
        int[] array = {1,3,67,34,89};
        int temp = 0;
        for(int i =0; i<array.length;i++){

            for(int j =0; j<array.length; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i< array.length;i++){
            System.out.println("a "+array[i]);
        }
       
        
        
    }
    
}
