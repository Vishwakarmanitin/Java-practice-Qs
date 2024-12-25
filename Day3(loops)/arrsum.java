import java.util.*;
class arrsum {
    public static void main(String[] args) {
        double sum=0;
        double arr[] = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Sum : "+sum);


        sc.close();

    }
}
