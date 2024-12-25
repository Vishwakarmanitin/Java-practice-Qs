import java.util.*;
public class badone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5,bad=4;
        int arr[]={1,2,3,4,5}; 
        for (int i = 0; i < 5; i++) {
            if (arr[i] == bad || arr[i] ==bad+1 ) {
               /*  for (int j = i; j < 5; j++) {
                    System.out.println(arr[j]+"False");
                    break;
                }*/System.out.println(arr[i] + "False");
            }else{
                System.out.println(arr[i]+"True");
            }
        }  
    }
}

