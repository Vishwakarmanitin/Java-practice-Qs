import java.util.*;
public class capgemini 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter string:");
        str=sc.nextLine();
        int i, j, k = 0, count = 0;
        String ch = new String("");
        for(i=0; i<str.length(); i++)
        {
            count = 0;
            for(j=0; j<=i; j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
                ch = ch + str.charAt(i);
            }
        }
        for(i=0; i<ch.length(); i++)
        {
            count = 0;
            for(j=0; j<str.length(); j++)
            {
                if(ch.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.printf("%c",ch.charAt(i));
            }
            else
            {
                System.out.printf("%c%d",ch.charAt(i),count);
            }
        }
    }    
}