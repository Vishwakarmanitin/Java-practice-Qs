import java.util.*;
class ciscco {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int n,i=0;
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter range:");
        n=sc.nextInt();*/
        for ( i = 0; i < arr.length-1; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length-1;i++){
            if (arr[i+1]==arr[i]+1) {
            
        }else{
            System.out.println("Missing no:"+(arr[i]+1));
        }
    }
        sc.close();
    }
}
