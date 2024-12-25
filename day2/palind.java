import java.util.*;
class palind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,sum=0,no,n,rem;
      for(i=1;i<=9999;i++){
        no=i;
        
        rem=0;
        while (no>0) {
         
          rem=rem*10+no%10;
          no=no/10;  
        }

        if (rem==i) {
            System.out.println(rem);
            }
        }

            /*else{
            System.out.println("Not an palindrome no.");
            }
            */
    
}
}
