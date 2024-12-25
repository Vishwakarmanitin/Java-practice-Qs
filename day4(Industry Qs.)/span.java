import java.util.Arrays;

public class span {
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,75,85};
        int N=7;
        int res[]=new int[7];
        res[0]=1;
        int l=1;
        for (int i = 0; i < price.length-1; ++i) {
            if (price[i]>price[i+1]) {
                res[l]=1;
                ++l;
            }else{
                res[l]=2;
                ++l;
            }
        }
        System.out.println(Arrays.toString(res));
    
    for (int i = 0; i < res.length; i++) {
        res[i]=res[i]*res[i]*res[i];
    }
    System.out.println(Arrays.toString(res));
    }
    
}
