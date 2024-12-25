import java.util.*;
class equalise {
        public static void main(String[] args) {
            String s,t;        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter s:");
            s=sc.next();
            System.out.print("Enter t:");
            t=sc.next();
            if (s.length() == t.length()) {
                  
                System.out.println("no.of operations: "+0);
                System.out.println("Both strings are same.");
            }else if(s.length()<t.length()){
                
                System.out.println("no.of operations: "+(t.length()-s.length()));
            }else{
                System.out.println("no.of operations: "+(t.length()-s.length()));
            }
            sc.close();
        }
}
