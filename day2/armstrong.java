import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no,rem,sum=0,n;
        System.out.println("Enter no:");
        no=sc.nextInt();
        n=no;
        while (no>0) {
            rem=no%10;
            sum=sum + (int)Math.pow(rem, 3);
            no=no/10;

        }

        if (sum==n) {
        System.out.println("Armstrong no.");
        }else{
        System.out.println("Not an armstrong no.");
        }
    }
}

/**
 * armstr
 */
class armstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no,rem,sum=0,n,i,count=0;
        System.out.println("Enter no:");
        no=sc.nextInt();
        n=no;
       
       
            while (no>0) {
            no=no/10;
            count++;
        }
        no=n;
        
        while (no>0) {
            rem=no%10;
            sum=sum + (int)Math.pow(rem, count);
            no=no/10;

        }

        if (sum==n) {
        System.out.println("Armstrong no.");
        }else{
        System.out.println("Not an armstrong no.");
        }
    }
    
}
