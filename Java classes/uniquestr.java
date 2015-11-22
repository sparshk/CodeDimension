import java.util.*;
class uniquestr
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string.");
        String str=sc.nextLine().toUpperCase();
        int len=str.length();int a=0;char ch1=' ';
        for(int i=0;i<len-1;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
                continue;
            for(int j=i+1;j<len;j++)
            {
                ch1=str.charAt(j);
                if(ch==ch1)
                   a=a+1;
           }
        }
        if(a>0)
            System.out.println("The string is not unique.");
            else
            System.out.println("The string is unique.");
    }
}

