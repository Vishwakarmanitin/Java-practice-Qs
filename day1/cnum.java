import java.util.Scanner;
class cnum {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int no,count=0;
    System.out.println("Enter no:");
    no = sc.nextInt();

    while(no>0){
        no = no/10;
        ++count;
    }
    System.out.println(count);


  }  
}
/*
 * snum
 */

class snum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no,sum=0,rem;
    System.out.println("Enter no:");
    no=sc.nextInt();
    while (no>0) {
        rem=no%10;
        sum=sum+rem;
        no=no/10;
    }
    System.out.println(sum);


}
}

