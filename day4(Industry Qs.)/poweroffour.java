import java.util.*;
class poweroffour {
    static int isPowerOfFour(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        { 
            if(n % 4 != 0)
            return 0;
            n = n / 4;     
        }
        return 1;
    } 
 
    // Driver program 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int test_no =sc.nextInt();
        if(isPowerOfFour(test_no) == 1)
         System.out.println(true);
        else
         System.out.println(false);
    }
    
}