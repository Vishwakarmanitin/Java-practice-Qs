import java.util.Scanner;
public class capegimi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        int sub[] = new int[10];
        int max[] = new int[10];
        int maxMarks,i,j;
        System.out.println("enter number of semester:");
        int sem = sc.nextInt();
        for(i=0;i<sem;i++)
        {
        System.out.println("enter number of subjects in "+(i+1)+" semester:");
        sub[i] = sc.nextInt();
        }
        for(i=0;i<sem;i++)
        {
            System.out.println("marks obtained in "+(i+1)+" semester");
            for(j = 0;j<sub[i];j++)
            {
                marks[j]=sc.nextInt();
            }
            maxMarks=marks[0];
            for(int k=0;k<=j;k++)
            {
                if(maxMarks<marks[k])
                {
                    maxMarks=marks[k];
                }
                else{
                    continue;
                }
            }
            max[i]=maxMarks;
            j=0;
        }
        for(i=0;i<sem;i++)
        {
            System.out.println("max marks in sem-"+(i+1)+" is "+max[i]);
        }
       sc.close();
    }
}