//armstrong no from 1 to 10000

class armstro {
    public static void main(String[] args) {
        

        int no,rem,sum=0,i,count=0;
       
        for(i=1;i<=10000;i++){
            sum=0;
            count=0;
        no=i;
         
       
            while (no>0) {
            no=no/10;
            count++;
        }
        no=i;
        while (no>0) {
            rem=no%10;
            sum=sum + (int)Math.pow(rem, count);
            no=no/10;           
        }
        
        if(sum==i){
            System.out.println(sum);
            }

    }
    }
}
