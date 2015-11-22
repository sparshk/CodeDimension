import java.util.*;
class editsen
{
    boolean check(String str)
    {
        boolean flag=false;
        if(str.length()==1)
            flag=true;

        return flag;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the sentence:");
        String str=sc.nextLine()+" ";
        int len=str.length();String str2=" ";boolean check=false;
        int ctr=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==' ')
                ctr++;
        }
        String Fst[]=new String[ctr];
        String Lst[]=new String[ctr];
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            str2=str2+ch;
            if(ch==' ')
            {
                check=check(str2);
                for(int j=0;j<ctr;j++)
                {
                    if(check==true)
                    {
                        Fst[j]=(str2);
                        Lst[j]=(str2);
                    }
                    else if(check==false)
                    {
                        int len1=str2.length();
                        Fst[j]=str2.substring(0,1);
                        Lst[j]=str2.substring(len1-1);
                    }
                }
            }
            str2="";
        }
        for(int i=0;i<ctr;i++)
            Lst[i]=Lst[i].toUpperCase();

        for(int i=0;i<ctr;i++)
        {
            System.out.print(Fst[i]+" "+Lst[i]);
        }
    }
}




