import java.util.Scanner;

class leapyear {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter Year:");
    a=sc.nextInt();
    if(a%100!=0){
        if (a%4==0) {
        System.out.println("It's a leap year!");
    }
        else{
        System.out.println("Not a leap year");
    }
    }
    else{
        if (a%400==0) {
            System.out.println("Century leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
    sc.close();
 }   
}
