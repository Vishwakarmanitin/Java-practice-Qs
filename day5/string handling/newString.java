class newString {
    public static void main(String[] args) {
        String s="help4code";
        System.out.println(s); 
        
        String s1=new String("help4code");
        System.out.println(s1);

        char ch[]={'h','e','l','p','4','c','o','d','e'};
        String s2=new String(s1);
        System.out.println(s2);

        char[] ch1={'h','e','l','l','o','4','c','o','d','e'};
        String s3= new String(ch1,2,8);
        System.out.println(s3);
        byte []b={65,66,67,68,69,70};
        String s4=new String(b,1,3);
        System.out.println(s4);

    }    
}
