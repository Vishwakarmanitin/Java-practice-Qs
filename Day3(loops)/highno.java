import java.util.*;
class highno {
    public static void main(String args[]){
        int arr[]={1,3,2,4};
        int res[]=new int[4];
        int i,j;
        for ( i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    res[i]=arr[j];
                    break;
                }
            }
        }
        res[i-1]=-1;
        System.out.println(Arrays.toString(res));
    }
}
