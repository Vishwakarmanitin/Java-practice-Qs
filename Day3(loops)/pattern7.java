class pattern7 {
    public static void main(String[] args) {
        int s=3;
        for (int i = 1; i <= 4; i++) {
            for ( int k = 1; k <= s; k++) {
                System.out.print(" ");
             }

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                s--;
            }
 
            
        }
    }

