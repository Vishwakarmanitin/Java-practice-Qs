import java.util.Scanner;
class paper1 {
    public static void main(String[] args) {
        int a,b,c,per;
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of English:");
        a=sc.nextInt();

        System.out.println("Enter marks of Hindi:");
        b=sc.nextInt();

        System.out.println("Enter marks of Marathi:");
        c=sc.nextInt();
        
       
        if (a>=45 && b>=45 && c>=45) {
          System.out.println("Pass");  
        }
        else{
            System.out.println("Fail");
        }
    System.out.println("you got :"+(a+b+c)+" Out of 300");
    per = ((a+b+c)/3);
    System.out.println("Your Percentage is: "+per);

    System.out.println("1.Male" + "2.Female");
       System.out.println("Enter your gender:"); 
        d = sc.nextInt();

    if (per>=62 && d==2) {
     System.out.println("You are eligible");   
    }
    else{
        System.out.println("You are not eligible");
    }
    sc.close();
    }
}
