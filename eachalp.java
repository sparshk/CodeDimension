
import java.util.*;
public class eachalp
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine().toUpperCase();
        int len=str.length();int ctr=0;
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<len;j++)
            {
                if((char)i==str.charAt(j))
                ctr++;
            }
            if(ctr==0)
            continue;
            else
            {
                System.out.println("The frequency of"+" "+(char)i+" "+"is ="+ctr);
                ctr=0;
            }
        }
    }
}