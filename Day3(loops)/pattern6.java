 class pattern6 {
    public static void main(String[] args) {
        int x=65;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((char)x);
                x++;
            }
            System.out.println();
        }
    }
}
