public class stringbuffer {
    public static void main(String[] args) {
        //String to String buffer conversion
        String s1="Nitin";
        StringBuffer sb1=new StringBuffer(s1);
        System.out.println(sb1);

        StringBuffer sb2=new StringBuffer("Prashant");
        String s2=sb2.toString();
        System.out.println(s2);
    }
}
