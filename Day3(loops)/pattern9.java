class pattern9 {
    public static void main(String[] args) {
        int s=3;
        for (int i = 1; i <= 4; i++) {
            for ( int k = 1; k <= s; k++) {
                System.out.print(" ");
             }

                for (int j = 1; j <= (2*i)-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                s--;
            }
 
            
        }
}
