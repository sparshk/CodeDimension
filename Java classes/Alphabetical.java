import java.util.*;
class Alphabetical
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String str2=""; char ch = ' ';
        str=str.toUpperCase();
        for(int i=65; i<=90; i++)
        {
            for(int j=0; j<str.length(); j++)
            {
                ch=str.charAt(j);
                if(ch==(char)i)
                str2+=ch;
            }
        }
        System.out.println("Alphabetical order: "+str2);
    }
}
   