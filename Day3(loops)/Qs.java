import java.util.Arrays;

class Qs {
    public static void main(String[] args) {
        int temp;
        int a[]={56,-31,89,53,44,-32};
        Arrays.sort(a);
        
        System.out.println("Ascending order:"+Arrays.toString(a));
        for (int i = 0,j=a.length-1; i<j; i++,j--) {
        
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("descending order:"+Arrays.toString(a));
    }
}
