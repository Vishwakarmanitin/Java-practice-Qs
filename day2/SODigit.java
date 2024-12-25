class SODigit {
    public static void main(String[] args) {
        int a = 567;
        int n = a%10;
        a = a/10;
        int m = a%10;
        a = a/10;
        int l = a%10;

        System.out.println("Last digit is:"+(n+m+l));
    }
}
