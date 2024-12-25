import java.util.*;
/**
 * evensum
 */
class evensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <= 20; i++) {
            if (i%2==0) {
                sum=sum+i;
            }           
        }
        System.out.println("Sum:"+sum);
    }
    
}

/**
 * fibo
 */
class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f0=0,f1=1,no,f3;
        System.out.println("Enter no:");
        no = sc.nextInt();
        System.out.println(f0+""+f1);
        for (int i = 2; i < no; i++) {
           f3=f1+f0;
           System.out.println(f3);
           f0=f1;
           f1=f3; 
        }

    }
    
}