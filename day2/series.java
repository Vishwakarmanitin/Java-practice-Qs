import java.util.Scanner;
class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n,sum=0;
        System.out.println("Enter value of x:");
        x=sc.nextInt();
        System.out.println("Enter power n:");
        n=sc.nextInt();
        for (int i = 1; i <= n; ++i){
           sum= sum+ (int)(Math.pow(x,i)/i);
        }
            System.out.println(sum);

    }
    
}

/**
 * series1
 * 
 */
class series1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n,fact=1,no;
        double sum=0;
        
        System.out.println("Enter x:");
        x=sc.nextInt();
        System.out.println("Enter n:");
        n=sc.nextInt();
       
        for (int i = 1; i <= n; ++i){
            no=i;
            while (no>0) {
                
              fact=fact*no;
              no--;  
            }
            
            sum= sum+ (Math.pow(x,i)/fact);
         }
             System.out.println(sum);


    }
    
}