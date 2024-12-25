public class reverseit {
    public static void main(String[] args) {
        String s="nitin",rev="";
        char a[]=s.toCharArray();
       // System.out.println(a[]);
       for (int i = a.length-1; i >= 0; i--) {
        rev=rev+s.charAt(i);
       }
       System.out.println("Reversed:"+rev);
       if (rev==s) {
        System.out.println("Palindrome"); 
       }else{
        System.out.println("Not a palindrome");
       }
    }
}
