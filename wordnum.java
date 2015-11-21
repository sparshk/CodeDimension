import java.util.*;
class wordnum
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine().trim()+" ";
        System.out.println("Enter the word to be searched");
        String word=sc.nextLine();
        int len=str.length();int ctr=0;
        String word1="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            word1=word1+ch;
            if(ch==' ')
            {
                int len1=word1.length();
                word1=word1.substring(0,len1-1);
                System.out.println(word1);
                if(word1.equalsIgnoreCase(word))
                {
                    ctr=ctr+1;
                }
                word1="";

            }
        }
        if(ctr==0)
            System.out.println("The word does not exists");
        else
            System.out.println("The frequency of the reqd word is="+ctr);
    }
}