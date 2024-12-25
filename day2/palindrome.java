import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no,n,rem;
        System.out.println("Enter no:");
        no=sc.nextInt();
        n=no;
        rem=0;
        while (no>0) {
         
          rem=rem*10+no%10;
          no=no/10;  
        }
        if (rem==n) {
            System.out.println("palindrome no.");
            }else{
            System.out.println("Not an palindrome no.");
            }
    
}
}

