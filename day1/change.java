import java.util.*;
class change {
  public static void main(String args[]){
  int amt,note,n;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Amount :");
  amt = sc.nextInt();
  System.out.println("2000\n500\n100\n50\n20\n10\n5\n2\n1");
  System.out.println("enter starting note: ");
  note = sc.nextInt();
  switch (note) {
    case 2000:
    n=amt/2000;
    System.out.println("No.of 2000 ruppee notes"+n);
    amt=amt%2000;

    case 500:
    n=amt/500;
    System.out.println("No.of 500 ruppee notes"+n);
    amt=amt%500;

    case 100:
    n=amt/100;
    System.out.println("No.of 100 ruppee notes"+n);
    amt=amt%100;

    case 50:
    n=amt/50;
    System.out.println("No.of 50 ruppee notes"+n);
    amt=amt%50;

    case 20:
    n=amt/20;
    System.out.println("No.of 20 euppee notes"+n);
    amt=amt%20;

    case 10:
    n=amt/10;
    System.out.println("No.of 10 ruppee notes"+n);
    amt=amt%10;

    case 5:
    n=amt/5;
    System.out.println("No.of 5 ruppee coins:"+n);
    amt=amt%5;

    case 2:
    n=amt/2;
    System.out.println("No.of 2 rupee coins:"+n);
    amt=amt%2;

    case 1:
    n=amt/1;
    System.out.println("No.of 1 ruppee coins:"+n);
    amt=amt%1;
    break;
        
  
    default:
        break;
  }
    sc.close();

  }  
}
