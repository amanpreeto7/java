public class ReverseNumber {
    public static void main(String args[]) {

   int r,reverse=0,temp;    
  int originalNumber=454; 
  
  temp=originalNumber;    
  while(temp>0){    
   r=originalNumber%10;
   reverse=(reverse*10)+r;    
   temp=temp/10;    
  }    
  if(originalNumber==reverse)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
