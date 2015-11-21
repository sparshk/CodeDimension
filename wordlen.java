import java.util.*;
class wordlen
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine().trim().toUpperCase();
        int len=str.length();int ctr=0;String reverse="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                ctr+=1;
        }
        for(int i=len-1;i>=0;i--)
        {
            char ch1=str.charAt(i);
            reverse=reverse+ch1;
        }
        System.out.println("The number of characters are:"+len);
        System.out.println("The number of vowels are:"+ctr);
        System.out.println("The reversed string is:"+reverse);
    }
}

