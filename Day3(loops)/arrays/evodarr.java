import java.util.*;
class evodarr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int even=0,odd=0;
       int arr[]={1,2,3,4,5};
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            even++;
        }else{
            odd++;
        }
       }
       System.out.println("Total Even nos: "+even);
       System.out.println("Total Odd nos: "+odd);
       sc.close();
    }
}
