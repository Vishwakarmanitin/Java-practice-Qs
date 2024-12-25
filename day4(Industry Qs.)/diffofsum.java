import java.util.*;
class diffofsum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int m,n,sum1=0;
    int sum2=0;
    System.out.print("Enter m:");
    m=sc.nextInt();
    System.out.print("Enter n:");
    n=sc.nextInt();
    for (int i = 1; i <= n; i++) {
        if (i%m==0) {
            
            sum1+=i;
        }else{
          
            sum2+=i;
        }

    }
    int diff=sum2-sum1;
    System.out.println(diff);
   } 
   
}
