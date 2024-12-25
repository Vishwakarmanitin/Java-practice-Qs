import java.util.Arrays;

class rev {
    public static void main(String[] args) {
        int temp;
        
        int a[]={1,2,3,4,5,6};
       
        for (int i = 0,j=a.length-1; i<j; i++,j--) {
        
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        
        System.out.println(Arrays.toString(a));
        }
    }

