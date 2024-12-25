import java.util.*;
class accenture {
    public static void main(String[] args) {
        
        int arr[]={5,4,3,9,7};
        int sum=9,total,s;
        int s1,s2;
        /*for (int i = 0; i < (arr.length)-1; ++i) {
            if (arr[i]>arr[i+1]) {
                s=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=s;
                i++;
            }
        }*/
        Arrays.sort(arr);
        s1=arr[0];
        s2=arr[1];
        total=s1+s2;
    System.out.println(s1+" "+s2);
    if (sum>total) {
        System.out.println(s1*s2);
    }
    }
}
