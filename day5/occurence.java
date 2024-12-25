import java.util.*;
class occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,res="";
        char t;
        System.out.println("Enter letter:");
        s=sc.next();
        System.out.println("Enter letter to be removed:");
        t=sc.next().charAt(0);
        char a[]=s.toCharArray();
        char b=t;
        //char c[]=new char[100];
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b) {
                continue;
            }else{
                res=res+a[i];
            }
        }
        System.out.println(res);
    }
}
