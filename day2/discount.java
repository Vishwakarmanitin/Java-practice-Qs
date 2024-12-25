import java.util.*;
class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n;
        System.out.println("Enter Cost Price :");
        int a=sc.nextInt();
        System.out.println("Enter (Y/n)\nAre you a student :");
        char c=sc.next().charAt(0);
        switch (c) {
            case 'Y':
              if (a>500) {
                n = a-(0.1*a) ;
                System.out.println("Discounted price is:"+n);
              }else{
                n = a-(0.05*a);
                System.out.println("Discounted Price is:"+n);
              }  
                break;
            
            case 'n':
               if (a>500) {
                n = a-(a*0.08);
                System.out.println("Discounted Price is:"+n);
               }else{
                n = a-(0.02*a);
                System.out.println("Discounted Price is:"+n);
               }
                break;
        
            default:
                break;
        }
        sc.close();
        
    }
}
