import java.util.*;
class numarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int small=arr[0];
        int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small>arr[i]) {
                small=arr[i];
            }
            if (large<arr[i]) {
                large=arr[i];
            }
        }
        System.out.println("large:"+large);
        System.out.println("small:"+small);
        sc.close();
    }
}
