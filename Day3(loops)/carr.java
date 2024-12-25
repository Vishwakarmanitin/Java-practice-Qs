import java.util.*;
class carr {
    public static void main(String[] args) {
        int a1[]=new int[]{56,28,73,53,81};
        int a2[]=Arrays.copyOf(a1, 5);
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        int a3[]=Arrays.copyOf(a2, 5);
        System.out.println(Arrays.toString(a3));
    }
}
