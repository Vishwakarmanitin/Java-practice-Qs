import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="teacher";
        String t="cheater";
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String x=new String(a);
        String y=new String(b);
        System.out.println(x);
        System.out.println(y);
        if (x.equals(y)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
