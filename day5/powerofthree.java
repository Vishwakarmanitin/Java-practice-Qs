import java.util.*;
public class powerofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m=0,x=1;
        boolean flag = false;
        System.out.println("Enter n:");
        n=sc.nextInt();
        for (int i = 0; i <= n; i++) {
        if (i%3==0 ) {
            m=m+(int)Math.pow(3, x);
            if (m==n) {
                flag=true;
                break;
            }else{
                flag=false;
            }x++;
        }
    }
    System.out.println(flag);
        
    }
    }

