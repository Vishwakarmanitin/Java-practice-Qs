class Rev {
    public static void main(String[] args) {
        int a = 5678;
        int n = a%10;
        a = a/10;
        int m = a%10;
        a = a/10;
        int l = a%10;
        a = a/10;
        int k = a%10;
        System.out.println("Reverse is:"+(1000*n+100*m+10*l+1*k));
    }
}
