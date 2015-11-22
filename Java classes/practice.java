import java.util.*;
class practice
{
    String preset(String str)
    {
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                str=str.substring(i)+str.substring(0,i)+"AY";
                break;
            }
        }
        return str;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine()+" ";
        String output="";
        String word="";
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            word=word+ch1;
            if(ch1==' ')
            {
                word=word.trim();
                output=output+preset(word)+" ";
                word="";
            }
        }
        System.out.println("The piglatin form is="+output);
    }
}


