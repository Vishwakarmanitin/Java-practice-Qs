import java.util.*;
class alphabet {
    public static void main(String[] args) {
        int m;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        m=sc.nextInt();
        int n[];
        n = new int[m];
        System.out.println("Enter nos.");
        for (int i = 0;i<m; i++) {
            n[i]=sc.nextInt();
            if (n[i]==0) {
                break;
            } else{
        }     
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]+"-"+(char)n[i]);
        }
       
    }
}
