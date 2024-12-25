//all prime no from 1 to 5555

class prime {
    public static void main(String[] args) {
       
        int i;
        for ( i = 1; i <= 5555; i++) {
            if (i%2==0 || i%3==0 || i%5==0) {
                continue;
            }else{
                System.out.println(i);
            }
        }
        
    }
    
}
