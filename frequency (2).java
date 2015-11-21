import java.util.*;
class frequency
{
    int countwords(String str)
    {
        str=str+" ";
        int len=str.length();
        int ctr=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
                ctr++;
        }
        return ctr;
    }

    String wordatpos(String str,int pos)
    {
        str=" "+str.trim()+" ";
        int len=str.length();
        int ctr=0;String word="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if (ch==' ')
                ctr++;
            if(ctr==pos)
            {
                word=str.substring(i);
                break;
            }
        }
        word=word.substring(1);
        word=word.substring(0,word.indexOf(' '));
        word=word.trim();
        return word;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int ctr=0;
        String word="";
        for(int i=1;i<countwords(str);i++)
        {
            word=wordatpos(str,i);
            for(int j=1;j<countwords(str);j++)
            {
                if(word==wordatpos(str,j));
                ctr++;
            }
        }
        if(ctr>1)
            System.out.println(word);

    }
}

