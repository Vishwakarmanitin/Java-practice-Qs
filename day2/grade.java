import java.util.*;
class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,per;
        int n=5;
        int sum=0;        
        for (int i = 1; i < n; i++) {
            System.out.println("Enter marks of "+i+" Subject:");
            a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println("Total marks :"+sum);
        per=(sum/4);
        if (per>=90) {
            System.out.println("Grade A");
        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        }
        else if(per>=40){
            System.out.println("Grade E");
        }
        else if(per<40){
            System.out.println("Fail");
        }
        sc.close();

        
    }
}
