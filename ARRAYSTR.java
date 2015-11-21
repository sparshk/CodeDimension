import java.util.*;
class ARRAYSTR
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter the string.");
        str=sc.nextLine()+" ";
        int len=str.length();int w=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
                w=w+1; 
        }
        int a1=0,a2=0;
        char Fst[]=new char[w];
        char Lst[]=new char[w];
        String str1="";
        for(int i=0;i<len;i++)
        {
            char ch1=str.charAt(i);

            str1=str1+ch1;
            if(ch1==' ')
            {
                int len1=str1.length();
                if(len1==1)
                {
                    Fst[a1]=str1.charAt(len1-1);
                    Lst[a2]=str1.charAt(len1-1);
                    a1=a1+1;
                    a2=a2+1;
                }
                else if(len1>1)
                {
                    Fst[a1]=str1.charAt(0);
                    Lst[a2]=str1.charAt(len1-2);
                    a1=a1+1;
                    a2=a2+1;
                }
                str1="";
            }
        }
        for(int i=0;i<w;i++)
        {
            char ch2=Lst[i];
            if(Character.isLowerCase(ch2))
            {
                Lst[i]=Character.toUpperCase(ch2);        
            }
            else
            Lst[i]=ch2;
        }
        for(int i=0;i<w;i++)
        System.out.print(Fst[i]+""+Lst[i]);  
    }
}

