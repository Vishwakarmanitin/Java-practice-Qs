class arm {
    public static void main(String[] args) {
        int rem,sum=0,i;
        int a[]={170,153,258,8028,8208};
        int count=0;
        
    for ( i = 0; i < a.length; i++) {       
        int no=a[i];           
        while(no>0){            
        no/=10;
        ++count;
    }
        no=a[i];
    while (no>0) {           
        rem=no%10;
        sum=(int)sum+(int)Math.pow(rem,count);
        no/=10;
    }
        
    
       if(sum==a[i]){ System.out.println("Armstrong no:"+a[i]);}
        sum=0;
        count=0;
    }
}
    }

