public class pattern8 {
    public static void main(String[] args) {
        int s=4;
        for (int i = 1; i <= 4; i++) {
            for ( int k = 1; k <= i; k++) {
                System.out.print(" ");
             }
            for (int j = 1; j <= s; j++) {
                System.out.print("*");
            } 
              
                System.out.println();
                s--;
            }
 
            
        }
}
