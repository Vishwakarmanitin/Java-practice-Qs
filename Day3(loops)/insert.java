import java.util.Arrays;

class insert {
    public static void main(String[] args) {
        int a1[]={13,25,36,31,45,11};
        int indexposition=2,newvalue=57;
        System.out.println("Original array:"+Arrays.toString(a1));

        for (int i = a1.length-1;i>indexposition; i--) {
            a1[i]=a1[i-1];
        }
        a1[indexposition]=newvalue;
        System.out.println("New Array:"+Arrays.toString(a1));

    }
}
