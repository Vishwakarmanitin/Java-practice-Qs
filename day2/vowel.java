import java.util.Scanner;
class vowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your letter: ");
    char c = sc.next().charAt(0);
    if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
        System.out.println("It's an vowel");
    }
    else{
        System.out.println("Not a vowel");
    }
    sc.close();
  }  
}
