public class getbytes {
    public static void main(String[] args) {
        String s="ABCD";
        byte s1[]=s.getBytes();
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
}
